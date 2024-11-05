package ofofo.data.repository;

import ofofo.data.model.Entry;

public interface EntryRepository {
    long count();
    void delete(Entry entry);
    void deleteAll();
    void deleteById(String id);
    boolean existsById(String id);
    Entry findById(String id);
    void save(Entry entry);
    Entry findByTitle(String myTitle);
}
