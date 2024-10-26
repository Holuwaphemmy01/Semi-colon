package DiaryApplication.services;

import DiaryApplication.data.models.Diary;

public interface DiaryService {

     void register(String userName, String password) throws Exception;
     int count();

     Diary Login(String userName, String password) throws Exception;

}
