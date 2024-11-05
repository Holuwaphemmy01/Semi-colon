package ofofo.data.service.entry;

import ofofo.data.model.Entry;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class EntryServiceImplTest {

    private final EntryServiceImpl entryService = new EntryServiceImpl();
    @Test
    public void testToCreateEntryAndCountIsOne(){
        entryService.createEntry("femi", "title", "content");
        assertEquals(1, entryService.countEntries());
    }

    @Test
    public void testToCreateMoreThanOneEntryAndEntryNumberIsDifferent(){
       String first =  entryService.createEntry("femi", "title", "content");
       String second =  entryService.createEntry("femi", "title1", "content1");
       String third = entryService.createEntry("femi", "title2", "content2");
       assertEquals(3, entryService.countEntries());
       assertNotEquals(first, second);
       assertNotEquals(first, third);
       assertNotEquals(second, third);
    }

    @Test
    public void testToCreateThreeEntriesAndDeleteEntryOneByIdAndCountIsTwo(){
        String first =  entryService.createEntry("femi", "title", "content");
        String second =  entryService.createEntry("femi", "title1", "content1");
        String third = entryService.createEntry("femi", "title2", "content2");
        entryService.deleteBYId(first);
        assertEquals(2, entryService.countEntries());
    }

    @Test
    public void testToDeleteAllEntriesAndCountIsZero(){
        String first =  entryService.createEntry("femi", "title", "content");
        String second =  entryService.createEntry("femi", "title1", "content1");
        String third = entryService.createEntry("femi", "title2", "content2");
        entryService.deleteAllEntries();
        assertEquals(0, entryService.countEntries());
    }

    @Test
    public void testToFindIfAnEntryExist(){
        String first =  entryService.createEntry("femi", "title", "content");
        String second =  entryService.createEntry("femi", "title1", "content1");
        String third = entryService.createEntry("femi", "title2", "content2");
        assertTrue(entryService.existsById(second));
    }

    @Test
    public void testToFindAnEntryAndReturnTheEntry(){
        String first =  entryService.createEntry("femi", "title", "content");
        String second =  entryService.createEntry("femi", "title1", "content1");
        String third = entryService.createEntry("femi", "title2", "content2");
        Entry entry = entryService.findEntryById(second);
        assertEquals(entry.getContent(), "content1");
    }

}