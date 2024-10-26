package DiaryApplication.data.repositories;

import DiaryApplication.data.repositories.models.Entry;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EntryRepositoriesImplTest {
    EntryRepositoriesImpl repo = new EntryRepositoriesImpl();

    @Test
    void testThatEntryIsEmpty() {
        assertEquals(0, repo.count());
    }

    @Test
    void testToAddEntry() {
        Entry entry = new Entry(45, "Story of my Life", "I am a billionaire when on planet earth");
        repo.save(entry);
        assertEquals(1, repo.count());
    }


    @Test
    void testThatICanEntryById(){
        Entry entry1 = new Entry(45, "Story of my Life", "I am a billionaire when on planet earth");
        Entry entry2 = new Entry(109, "The man call God", "If you dont have jesus, your life don spoil");
        Entry entry3 = new Entry(21, "my Little lie", "All fornicator will die");
        repo.save(entry1);
        repo.save(entry2);
        repo.save(entry3);
        assertEquals(3, repo.count());
        Entry getId = repo.getEntryById(109);
        assertEquals(entry2, getId);
    }

    @Test
    void testThatEntryWillReturnNullIfWrongIdIsBeingPassed(){
        Entry entry1 = new Entry(45, "Story of my Life", "I am a billionaire when on planet earth");
        Entry entry2 = new Entry(109, "The man call God", "If you dont have jesus, your life don spoil");
        Entry entry3 = new Entry(21, "my Little lie", "All fornicator will die");
        repo.save(entry1);
        repo.save(entry2);
        repo.save(entry3);
        assertEquals(3, repo.count());
        Entry getId = repo.getEntryById(100);
        assertNull(getId);
    }

    @Test
    void testThatICanDeleteEntry(){
        Entry entry1 = new Entry(45, "Story of my Life", "I am a billionaire when on planet earth");
        Entry entry2 = new Entry(109, "The man call God", "If you dont have jesus, your life don spoil");
        Entry entry3 = new Entry(21, "My Little lie", "All fornicator will die");
        Entry entry4 = new Entry(900, "My babe cheat on me", "All fornicator will die");

        repo.save(entry1);
        repo.save(entry2);
        repo.save(entry3);
        repo.save(entry4);
        assertEquals(4, repo.count());
        repo.delete(entry2);
        repo.delete(entry3);
        assertEquals(2, repo.count());

    }



}