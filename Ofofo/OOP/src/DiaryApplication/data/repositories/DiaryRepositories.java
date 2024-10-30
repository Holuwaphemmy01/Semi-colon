package DiaryApplication.data.repositories;

import DiaryApplication.data.models.Diary;

import java.util.List;

public interface DiaryRepositories {
    void saveDiary(Diary diary);
    List<Diary> findByTitle(String title);
    void delete(Diary diary);
    int count();
//     Diary findById(int id);
    Diary findByUserName(String userName);
}
