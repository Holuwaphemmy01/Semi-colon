package ofofo.data.service.diary;

import ofofo.data.model.Diary;

public interface DiaryService {
    void register(String userName, String password);
    Diary Login(String userName, String password) throws Exception;
    void Logout();
    long countEntries();
    String createEntries(String title, String content);
    void deleteEntryById(String entryId);
    boolean existEntryById(String entryId);

}
