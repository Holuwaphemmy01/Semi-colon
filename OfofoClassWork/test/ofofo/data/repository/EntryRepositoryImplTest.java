package ofofo.data.repository;

import ofofo.data.model.Entry;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EntryRepositoryImplTest {
    private final EntryRepository repository = new EntryRepositoryImpl();
    private final Entry entry = new Entry();

    @Test
    public void testThatEntryRepository_NoEntrySaved() {
        assertEquals(0, repository.count());
    }

    @Test
    public void testThatEntryRepository_OneEntrySaved() {
        assertEquals(0, repository.count());
        entry.setTitle("my title");
        repository.save(entry);
        assertEquals(1, repository.count());
    }

    @Test
    public void testToSaveMoreThanOneEntry() {
        assertEquals(0, repository.count());
        entry.setTitle("my title");
        repository.save(entry);
        Entry entry1 = new Entry();
        entry1.setTitle("my title1");
        repository.save(entry1);
        assertEquals(2, repository.count());
    }

    @Test
    public void testThatRepositoryShouldNotSaveEntryWithNoTitle() {
        repository.save(entry);
        assertEquals(0, repository.count());
    }

    @Test
    public void testToDeleteAllEntryInTheRepository() {
        entry.setTitle("my title");
        repository.save(entry);
        Entry entry1 = new Entry();
        entry1.setTitle("my title1");
        repository.save(entry1);
        assertEquals(2, repository.count());
        repository.deleteAll();
        assertEquals(0, repository.count());
    }

    @Test
    public void testToDeleteEntryById(){
        entry.setId("1");
        entry.setTitle("my title");
        repository.save(entry);
        Entry entry1 = new Entry();
        entry1.setId("2");
        entry1.setTitle("my title1");
        repository.save(entry1);
        assertEquals(2, repository.count());
        repository.deleteById("1");
        assertEquals(1, repository.count());
    }

    @Test
    public void testNotToDeleteEntryByIdThatDoesNotExist() {
        entry.setId("1");
        entry.setTitle("my title");
        repository.save(entry);
        Entry entry1 = new Entry();
        entry1.setId("2");
        entry1.setTitle("my title1");
        repository.save(entry1);
        assertEquals(2, repository.count());
        repository.deleteById("3");
        assertEquals(2, repository.count());
    }

    @Test
    public void testToDeleteEntryByEntryObject(){
        entry.setTitle("my title");
        repository.save(entry);
        Entry entry1 = new Entry();
        entry1.setTitle("my title1");
        repository.save(entry1);
        assertEquals(2, repository.count());
        repository.delete(entry);
        assertEquals(1, repository.count());
    }

    @Test
    public void testToFindEntryByIdAndReturnEntry() {
        entry.setId("1");
        entry.setTitle("my title");
        repository.save(entry);
        Entry entry1 = new Entry();
        entry1.setId("1");
        entry1.setTitle("my title1");
        repository.save(entry1);
        assertEquals(2, repository.count());
        assertEquals(entry, repository.findById("1"));
    }

    @Test
    public void testToReturnNullWhenFindEntryWithWrongId(){
        entry.setId("1");
        entry.setTitle("my title");
        repository.save(entry);
        Entry entry1 = new Entry();
        entry1.setId("2");
        entry1.setTitle("my title1");
        repository.save(entry1);
        assertEquals(2, repository.count());
        assertNull(repository.findById("10"));
    }



    @Test
    public void testToFindEntryByTitleAndReturnEntry() {
        entry.setTitle("my title");
        repository.save(entry);
        Entry entry1 = new Entry();
        entry1.setTitle("my title1");
        repository.save(entry1);
        assertEquals(2, repository.count());
        assertEquals(entry, repository.findByTitle("my title"));
    }

    @Test
    public void testToReturnNullWhenFindEntryWithWrongTitle(){
        entry.setTitle("my title");
        repository.save(entry);
        Entry entry1 = new Entry();
        entry1.setTitle("my title1");
        repository.save(entry1);
        assertEquals(2, repository.count());
        assertNull(repository.findByTitle("my name"));
    }

    @Test
    public void testToReturnTrueIfEntryExistsWhenPassedId(){
        entry.setId("1");
        entry.setTitle("my title");
        repository.save(entry);
        Entry entry1 = new Entry();
        entry1.setId("2");
        entry1.setTitle("my title1");
        repository.save(entry1);
        assertEquals(2, repository.count());
        assertTrue(repository.existsById("1"));
    }

    @Test
    public void testToReturnFalseIfIdDoesNotExists(){
        entry.setId("1");
        entry.setTitle("my title");
        repository.save(entry);
        Entry entry1 = new Entry();
        entry1.setId("2");
        entry1.setTitle("my title1");
        repository.save(entry1);
        assertEquals(2, repository.count());
        assertFalse(repository.existsById("10"));
    }
}