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

    }

    @Override
    public int  countEntry() {
        return entries.size();
    }


    @Override
    public Entry getEntryByIdAndUSerId(String userId, int id) {
            for (Entry entry : entries) {
                if (entry.getId().equals(userId+id)) return entry;
            }
            return null;
    }


    public int countEntryByUser(String userName) {
        int number= 0;
        for(int index = 0; index < entries.size(); index++) {
            for (Entry entry : entries) {
                if (entry.getId().equals(userName+(index+1))) number += 1;
            }
        }
        return number;
    }


}
