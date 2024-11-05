package ofofo.data.service.entry;

import ofofo.data.model.Entry;

public interface EntryService {
    String createEntry(String userName, String title, String content);
    void deleteEntry(Entry entry);
    void deleteBYId(String id);
    void deleteAllEntries();
    boolean existsById(String id);
    long countEntries();
    Entry findEntryById(String id);
}
