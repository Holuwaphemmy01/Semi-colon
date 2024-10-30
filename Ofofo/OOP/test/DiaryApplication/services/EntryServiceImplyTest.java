package DiaryApplication.services;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class EntryServiceImplyTest {
    DiaryServiceImply diaryServiceImply = new DiaryServiceImply();


    @Test
    public void testToRegisterUserLoginInAndCreateEntry() throws Exception {
        diaryServiceImply.register("oluwafemi", "password");
        diaryServiceImply.Login("oluwafemi", "password");
        diaryServiceImply.createEntry("oluwafemi", "name", "title");
        assertEquals(1, diaryServiceImply.countEntryByUser("oluwafemi"));
    }


    @Test
    public void testToRegisterUserLoginInAndCreate3EntryAndNumberOfEntriesShouldBe3() throws Exception {
            diaryServiceImply.register("oluwafemi", "password");
            diaryServiceImply.Login("oluwafemi", "password");
            diaryServiceImply.createEntry("oluwafemi", "name", "title");
            diaryServiceImply.createEntry("oluwafemi","name1", "title1");
            diaryServiceImply.createEntry("oluwafemi","name2", "title2");
            assertEquals(3, diaryServiceImply.countEntryByUser("oluwafemi"));
    }


    @Test
    public void testToRegister2userAndCreate2EntriesEachAndEachOfTheUserEntriesShouldBe2() throws Exception {
        diaryServiceImply.register("oluwafemi", "password");
        diaryServiceImply.Login("oluwafemi", "password");
        diaryServiceImply.createEntry("oluwafemi", "name", "title");
        diaryServiceImply.createEntry("oluwafemi", "name1", "title1");
        assertEquals(2, diaryServiceImply.countEntryByUser("oluwafemi"));
        diaryServiceImply.register("akinzo", "password2");
        diaryServiceImply.Login("akinzo", "password2");
        diaryServiceImply.createEntry("akinzo", "name", "title");
        diaryServiceImply.createEntry("akinzo", "name1", "title1");
        assertEquals(2, diaryServiceImply.countEntryByUser("akinzo"));
    }

    @Test
    public void testToRegister2User_LoginAndCreate2EntriesEachAndUser2GetTheSecondEntry() throws Exception {
        diaryServiceImply.register("oluwafemi", "password");
        diaryServiceImply.Login("oluwafemi", "password");
        diaryServiceImply.createEntry("oluwafemi", "name", "title");
        diaryServiceImply.createEntry("oluwafemi", "name1", "title1");
        String expected = "Entry{id='oluwafemi1', title='name', body='title'}";
        DiaryApplication.data.repositories.models.Entry entry = diaryServiceImply.countEntry("oluwafemi", 1);
        assertEquals(expected,entry.toString());
    }

}