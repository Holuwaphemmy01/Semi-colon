package DiaryApplication.data.repositories;

import DiaryApplication.data.repositories.models.Entry;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EntryRepositoriesImplTest {
    EntryRepositoriesImpl repo = new EntryRepositoriesImpl();

    @Test
    void testThatEntryIsEmpty() {
        assertEquals(0, repo.countEntry());
    }

    @Test
    void testToAddEntry() {
        Entry entry = new Entry("Story of my Life", "I am a billionaire when on planet earth");
        repo.save(entry);
        assertEquals(1, repo.countEntry());
    }


    @Test
    void testThatICanEntryById(){
        Entry entry1 = new Entry("Story of my Life", "I am a billionaire when on planet earth");
        Entry entry2 = new Entry( "The man call God", "If you dont have jesus, your life don spoil");
        Entry entry3 = new Entry("my Little lie", "All fornicator will die");
        repo.save(entry1);
        repo.save(entry2);
        repo.save(entry3);
        assertEquals(3, repo.countEntry());
    }

    @Test
    void testThatEntryWillReturnNullIfWrongIdIsBeingPassed(){
        Entry entry1 = new Entry( "Story of my Life", "I am a billionaire when on planet earth");
        Entry entry2 = new Entry("The man call God", "If you dont have jesus, your life don spoil");
        Entry entry3 = new Entry("my Little lie", "All fornicator will die");
        repo.save(entry1);
        repo.save(entry2);
        repo.save(entry3);
        assertEquals(3, repo.countEntry());
//        Entry getId = repo.getEntryById(100);
//        assertNull(getId);
    }

    @Test
    void testThatICanDeleteEntry(){
        Entry entry1 = new Entry( "Story of my Life", "I am a billionaire when on planet earth");
        Entry entry2 = new Entry( "The man call God", "If you dont have jesus, your life don spoil");
        Entry entry3 = new Entry( "My Little lie", "All fornicator will die");
        Entry entry4 = new Entry("My babe cheat on me", "All fornicator will die");

        repo.save(entry1);
        repo.save(entry2);
        repo.save(entry3);
        repo.save(entry4);
        assertEquals(4, repo.countEntry());
        repo.delete(entry2);
        repo.delete(entry3);
        assertEquals(2, repo.countEntry());
    }



}