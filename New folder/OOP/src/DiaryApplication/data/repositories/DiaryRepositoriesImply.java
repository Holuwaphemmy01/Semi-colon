package DiaryApplication.data.repositories;

import DiaryApplication.models.Diary;

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
                System.out.println(diaries);
                diaries.remove(diary);
            }
        }
//       for(Diary diarys: diaries){
//           if(diarys.getTitle()==(diary.getTitle())){
//               diaries.remove(diarys);
//           }
//       }
    }

    @Override
    public int count() {
        return diaries.size();
    }

    @Override
    public String findById(String userName) {
        for(int index = 0; index < numberOfDiaries; index++) {
            if(diaries.get(index).getUsername().equals(userName)) {
                return toStrings(diaries.get(index));
            }
        }
       return null;
    }


    public String toStrings(Diary diary) {
        return STR."Diary{username='\{diary.getUsername()}', title='\{diary.getTitle()}', password='\{diary.getPassword()}'}";
    }


}