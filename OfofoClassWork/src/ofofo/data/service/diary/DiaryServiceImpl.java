package ofofo.data.service.diary;

import ofofo.data.model.Diary;
import ofofo.data.repository.DiaryRepository;
import ofofo.data.repository.DiaryRepositoryImpl;
import ofofo.data.service.entry.EntryServiceImpl;

import java.util.Objects;

public class DiaryServiceImpl implements DiaryService {
    private DiaryRepository diaryRepository = new DiaryRepositoryImpl();
    private EntryServiceImpl entryService = new EntryServiceImpl();
    private Diary diary;

    @Override
    public void register(String userName, String password) throws IllegalArgumentException {
        boolean result = diaryRepository.existsById(userName);
        if (result)  throw new IllegalArgumentException();
        else {
            diary = new Diary();
            diary.setUserName(userName);
            diary.setPassword(password);
            diaryRepository.save(diary);
        }
    }

    @Override
    public Diary Login(String userName, String password) throws Exception {
        Diary diary = diaryRepository.findById(userName);
        if(!Objects.equals(diary.getUserName(), userName)) throw new Exception();
        else  {
            if(diary.getPassword().equals(password)){
                diary.setLocked(false);
                return diary;
            }
            else throw new Exception();
        }
    }

    @Override
    public void Logout() {
        diary.setLocked(true);
    }

    @Override
    public long countEntries() {
        if(diary.isLocked()) throw new IllegalArgumentException();
        return entryService.countEntries();
    }

    @Override
    public String createEntries(String title, String content) {
//        if(diary.isLocked() == true) throw new IllegalArgumentException();
        return entryService.createEntry(diary.getUserName(), title, content);
    }

    @Override
    public void deleteEntryById(String entryId) {
        entryService.deleteBYId(entryId);
    }

    @Override
    public boolean existEntryById(String entryId) {
        return false;
    }

    public long count() {
     return diaryRepository.count();
    }
}
