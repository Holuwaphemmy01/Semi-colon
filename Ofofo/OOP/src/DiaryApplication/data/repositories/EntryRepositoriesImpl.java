package DiaryApplication.data.repositories;

import DiaryApplication.data.repositories.models.Entry;

import java.util.ArrayList;
import java.util.List;

public class EntryRepositoriesImpl  implements data.repositories.EntryRepositories {
    List<Entry>  entries = new ArrayList<>();
    private int id;
    @Override
    public void save(Entry entry) {
        entries.add(entry);
    }

    @Override
    public void delete(Entry entry) {
        for(int index = 0; index < entries.size(); index++) {
            if(entries.get(index).equals(entry)) {
                entries.remove(entry);
            }
        }
//        for(Entry listOfEntries: entries) {
//            if(listOfEntries.equals(entry)) entries.remove(entry);
//        }
    }

    @Override
    public Entry getEntryById(int id) {
        for(Entry entry: entries){
            if(entry.getId() == id) return entry;
        }
        return null;
    }
    @Override
    public int count() {
        return entries.size();
    }


}
