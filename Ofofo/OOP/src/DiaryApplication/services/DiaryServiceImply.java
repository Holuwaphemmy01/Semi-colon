package DiaryApplication.services;

import DiaryApplication.data.models.Diary;
import DiaryApplication.data.repositories.DiaryRepositories;
import DiaryApplication.data.repositories.DiaryRepositoriesImply;

import java.util.Objects;

public class DiaryServiceImply implements DiaryService {
    private DiaryRepositories diaryRepositories = new DiaryRepositoriesImply();
    private EntryServiceImply entryService =  new EntryServiceImply();
    int counter = 0;


    public void createEntry(String userId, String title, String content) {
        if(diaryRepositories.findByUserName(userId) != null) {
            counter++;
            System.out.println("This is your entry id number "+counter);
            String userEntry = userId+counter;
            entryService.create(userEntry, title, content);

        }
    }

    @Override
    public void register(String userName, String password) throws Exception {

        if(diaryRepositories.findByUserName(userName) == null) {
            Diary diary = new Diary(userName, password);
            diaryRepositories.saveDiary(diary);
        }

         else throw new Exception();
    }




    public int count() {
        return diaryRepositories.count();
    }

    @Override
    public Diary Login(String userName, String password) throws Exception{
        Diary diary = diaryRepositories.findByUserName(userName);
        if(!Objects.equals(diary.getUsername(), userName)) throw new Exception();
        else  {
             if(diary.getPassword().equals(password)){
                diary.setLocked(false);
                return diary;
             }
            else throw new Exception();
        }
    }

    public DiaryApplication.data.repositories.models.Entry countEntry(String userId, int id) {
        return entryService.countEntry(userId, id);
    }

    public DiaryApplication.data.repositories.models.Entry getEntryById(String userId, int id) {
        return entryService.repositories.getEntryByIdAndUSerId(userId, id);
    }

    public int countEntryByUser(String userId) {
        return entryService.countEntries(userId);
    }

}
