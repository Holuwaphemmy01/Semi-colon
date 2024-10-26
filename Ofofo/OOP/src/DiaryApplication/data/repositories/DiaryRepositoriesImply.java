package DiaryApplication.data.repositories;



import DiaryApplication.data.models.Diary;

import java.util.ArrayList;
import java.util.List;

import static java.lang.StringTemplate.STR;

public class DiaryRepositoriesImply implements DiaryRepositories {
    List <Diary> diaries =  new ArrayList<>();
    int numberOfDiaries;

    @Override
    public void saveDiary(Diary diary) {
        diaries.add(diary);
        numberOfDiaries++;
    }

    @Override
    public List<Diary> findByTitle(String title) {
        return List.of();
    }

    @Override
    public void delete(Diary diary) {
        for(int index = 0; index < diaries.size(); index++) {
            if(diaries.get(index).equals(diary)) {
                diaries.remove(diary);
            }
        }

    }

    @Override
    public int count() {
        return diaries.size();
    }

    @Override
    public Diary findById(String userName) {
        for(Diary diary : diaries) {
            if(diary.getUsername().equals(userName)) {
                return diary;
            }
        }
//        for(int index = 0; index < numberOfDiaries; index++) {
//            if(diaries.get(index).getUsername().equals(userName)) {
//                return toStrings(diaries.get(index));
//            }
//        }
       return null;
    }




    public String toStrings(Diary diary) {
        return STR."Diary{username='\{diary.getUsername()}', title='\{diary.getTitle()}', password='\{diary.getPassword()}'}";
    }


}
