package DiaryApplication.services;

import DiaryApplication.data.repositories.EntryRepositoriesImpl;
import DiaryApplication.data.repositories.models.Entry;

import java.sql.SQLOutput;

public class EntryServiceImply implements EntryService {
    EntryRepositoriesImpl repositories = new EntryRepositoriesImpl();
    private int id = 4021;


    public int countEntries(String username) {
        return repositories.countEntryByUser(username);
    }

    @Override
    public Entry getEntryByIdAndUSerId(String userId, int entryId) {
        return null;
    }

    public void create(String userId, String title, String content){
        DiaryApplication.data.repositories.models.Entry entry = new DiaryApplication.data.repositories.models.Entry(title, content);
        entry.setId(userId);
        repositories.save(entry);
    }

    public DiaryApplication.data.repositories.models.Entry countEntry(String userId, int id) {
        return repositories.getEntryByIdAndUSerId(userId, id);
    }


}
