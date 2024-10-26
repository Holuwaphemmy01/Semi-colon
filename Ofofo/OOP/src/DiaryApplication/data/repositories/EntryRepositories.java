package data.repositories;

public interface EntryRepositories {
    void save(DiaryApplication.data.repositories.models.Entry entry);
    void delete(DiaryApplication.data.repositories.models.Entry entry);
    DiaryApplication.data.repositories.models.Entry getEntryById(int id);
    int count();
}
