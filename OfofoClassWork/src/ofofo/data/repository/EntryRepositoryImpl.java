package ofofo.data.repository;

import ofofo.data.model.Entry;

import java.util.ArrayList;
import java.util.List;

public class EntryRepositoryImpl implements EntryRepository {
    private List<Entry> entries = new ArrayList<>();
    private int counter = 3093;

    @Override
    public long count() {
        return entries.size();
    }

    @Override
    public void delete(Entry entry) {
        entries.remove(entry);
    }

    @Override
    public void deleteAll() {
        entries.clear();
    }

    @Override
    public void deleteById(String id) {
        for(int index = 0; index < entries.size(); index++) {
            if(entries.get(index).getId().equals(id)) {
                entries.remove(index);
            }
        }
//        Entry entry = findById(id);
//        entries.remove(entry);
    }

    @Override
    public boolean existsById(String id) {

      for(Entry entry : entries) {
          if(entry.getId().equals(id))return true;
      }
        return false;
    }

    @Override
    public Entry findById(String id) {
        for (Entry entry : entries)
         if (entry.getId().equals(id)) return entry;
        return null;
    }

    @Override
    public void save(Entry entry) {
        if(entry.getTitle()!=null)  entries.add(entry);
    }


    @Override
    public Entry findByTitle(String myTitle) {
        for (Entry entry : entries) if (entry.getTitle().equals(myTitle)) return entry;
        return null;
    }

}
