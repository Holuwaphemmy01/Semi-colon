package DiaryApplication.services;

import DiaryApplication.data.models.Diary;
import DiaryApplication.data.repositories.DiaryRepositories;
import DiaryApplication.data.repositories.DiaryRepositoriesImply;

import java.sql.SQLOutput;
import java.util.Objects;

public class DiaryServiceImply implements DiaryService {
    private DiaryRepositories diaryRepositories = new DiaryRepositoriesImply();
    private EntryServiceImply entryService =  new EntryServiceImply();


    public void createEntry(String title, String content) {
        entryService.create(title, content);
    }

    @Override
    public void register(String userName, String password) throws Exception {

        if(diaryRepositories.findByUserName(userName) == null) {
            Diary diary = new Diary(userName, password);
            diary.setUsername(userName);
            diary.setPassword(password);
            diary.setDiaryId();
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

}
