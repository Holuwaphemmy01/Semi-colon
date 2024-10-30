package DiaryApplication.services;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class EntryServiceImplyTest {
    DiaryServiceImply diaryServiceImply = new DiaryServiceImply();


    @Test
    public void testToRegisterUserLoginInAndCreateEntry() throws Exception {
        diaryServiceImply.register("oluwafemi", "password");
        diaryServiceImply.Login("oluwafemi", "password");
        diaryServiceImply.createEntry("name", "title");
        assertEquals(1, diaryServiceImply.count());


    }
    @Test
    public void testToRegisterUserLoginInAndCreate3EntryAndNumberOfEntriesShouldBe3() throws Exception {
            diaryServiceImply.register("oluwafemi", "password");
            diaryServiceImply.Login("oluwafemi", "password");
            diaryServiceImply.createEntry("name", "title");
            diaryServiceImply.createEntry("name1", "title1");
            diaryServiceImply.createEntry("name2", "title2");
            assertEquals(3, diaryServiceImply.count());
    }




}