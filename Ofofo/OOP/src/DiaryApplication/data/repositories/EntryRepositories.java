package data.repositories;

import DiaryApplication.data.repositories.models.Entry;

public interface EntryRepositories {
    void save(DiaryApplication.data.repositories.models.Entry entry);
    void delete(DiaryApplication.data.repositories.models.Entry entry);
    int countEntry();
    Entry getEntryByIdAndUSerId(String userId, int id);
}
