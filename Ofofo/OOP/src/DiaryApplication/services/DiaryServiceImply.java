package DiaryApplication.services;

import DiaryApplication.data.models.Diary;
import DiaryApplication.data.repositories.DiaryRepositories;
import DiaryApplication.data.repositories.DiaryRepositoriesImply;

import java.util.Objects;

public class DiaryServiceImply implements DiaryService {
    private DiaryRepositories diaryRepositories = new DiaryRepositoriesImply();



    @Override
    public void register(String userName, String password) throws Exception {

        if(diaryRepositories.findById(userName) == null) {
            Diary diary = new Diary(userName, password);
            diary.setUsername(userName);
            diary.setPassword(password);
            diaryRepositories.saveDiary(diary);
        }

         else throw new Exception();
    }



    @Override
    public int count() {
        return diaryRepositories.count();
    }

    @Override
    public Diary Login(String userName, String password) throws Exception{
        Diary diary = diaryRepositories.findById(userName);
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
