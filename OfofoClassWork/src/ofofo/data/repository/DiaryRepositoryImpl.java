package ofofo.data.repository;

import ofofo.data.model.Diary;

import java.util.ArrayList;
import java.util.List;

public class DiaryRepositoryImpl implements DiaryRepository {
    List <Diary> diaries = new ArrayList<Diary>();
    @Override
    public long count() {
        return  diaries.size();
    }

    @Override
    public void delete(Diary diary) {
        for(Diary d: diaries){
            if(d.equals(diary)) diaries.remove(d);
        }
    }

    @Override
    public void deleteAll() {
        diaries.clear();
    }

    @Override
    public void deleteById(String id) {
        for(Diary diary : diaries){
            if(diary.getUserName().equals(id)){
                diaries.remove(diary);
            }
        }
    }

    @Override
    public boolean existsById(String id) {
        for(Diary diary : diaries){
            if(diary.getUserName().equals(id)) return true;
        }
        return false;
    }

    @Override
    public Diary findById(String id) {
        for(Diary diary : diaries){
            if(diary.getUserName().equals(id)) return diary;
        }
        return null;
    }

    @Override
    public void save(Diary diary) {
        if(diary.getUserName() == null || diary.getPassword()==null) throw new IllegalArgumentException("diary is null");
        this.diaries.add(diary);
    }
}
