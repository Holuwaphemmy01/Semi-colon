package ofofo.data.service.entry;

import ofofo.data.model.Entry;
import ofofo.data.repository.EntryRepository;
import ofofo.data.repository.EntryRepositoryImpl;

public class EntryServiceImpl implements EntryService {
    private  final EntryRepository entryRepository = new EntryRepositoryImpl();
    private int counter = 30304;



    @Override
    public String createEntry(String userName, String title, String content) {
        Entry entry = new Entry();
        entry.setTitle(title);
        entry.setContent(content);
        counter+=3;
        entry.setId(userName+counter);
        entry.setDate();
        entryRepository.save(entry);
        return entry.getId();
    }

    @Override
    public void deleteEntry(Entry entry) {

    }

    @Override
    public void deleteBYId(String id) {
       entryRepository.deleteById(id);

    }

    @Override
    public void deleteAllEntries() {
        entryRepository.deleteAll();
    }

    @Override
    public boolean existsById(String id) {
        return entryRepository.existsById(id);
    }

    @Override
    public long countEntries() {
        return entryRepository.count();
    }

    @Override
    public Entry findEntryById(String id) {
        return entryRepository.findById(id);
    }
}
