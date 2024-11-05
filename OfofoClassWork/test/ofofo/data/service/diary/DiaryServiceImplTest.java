package ofofo.data.service.diary;

import ofofo.data.model.Diary;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DiaryServiceImplTest {
    DiaryServiceImpl diaryService = new DiaryServiceImpl();
    @Test
    public void testToCreateOneDiaryAndDiaryCountWillBeOne(){
        diaryService.register("userName", "password");
        assertEquals(1, diaryService.count());
    }

    @Test
    public void testToCreateTwoDiariesAndDiaryCountWillBeTwo(){
        diaryService.register("userName1", "password1");
        diaryService.register("userName2", "password2");
        assertEquals(2, diaryService.count());
    }

    @Test
    public void testThatRegisteredUserCanNotRegisteredTwice(){
        diaryService.register("userName1", "password1");
        assertThrows(IllegalArgumentException.class, () -> diaryService.register("userName1", "password2"));
        assertEquals(1, diaryService.count());
    }

    @Test
    public void testToLoginRegisteredUserAndDiaryWillBeUnLock() throws Exception {
        diaryService.register("userName1", "password1");
        Diary diary = diaryService.Login("userName1", "password1");
        assertFalse(diary.isLocked());
    }

    @Test
    public void testToThrowExceptionWhenUserEnterWrongPassword() throws Exception {
        diaryService.register("userName1", "password1");
        assertThrows(Exception.class, () -> diaryService.Login("userName1", "wrongPassword"));
    }

    @Test
    public void testToThrowExceptionWhenNonRegisteredUserWantToLogin() throws Exception {
        assertThrows(Exception.class, () -> diaryService.Login("userName1", "wrongPassword"));
    }


    @Test
    public void testThatRegisteredInitialZeroEntry() throws Exception {
        diaryService.register("userName", "password");
        diaryService.Login("userName", "password");
        assertEquals(0, diaryService.countEntries());
    }

    @Test
    public void testThatRegisteredUserCanLoginAndCreateEntry() throws Exception {
        diaryService.register("userName", "password");
        diaryService.Login("userName", "password");
        Diary diary = diaryService.Login("userName", "password");
        assertFalse(diary.isLocked());
        String result = diaryService.createEntries("title", "content");
        assertEquals(1, diaryService.countEntries());
    }

    @Test
    public void testThatRegisteredUserCanLoginAndCreateThreeEntryAndCountEntriesWillBeThree() throws Exception {
        diaryService.register("userName", "password");
        diaryService.Login("userName", "password");
        Diary diary = diaryService.Login("userName", "password");
        assertFalse(diary.isLocked());
        String result = diaryService.createEntries("title", "content");
        String result1 = diaryService.createEntries("title1", "content1");
        String result2 = diaryService.createEntries("title2", "content2");
        assertEquals(3, diaryService.countEntries());
    }


    @Test
    public void testToRegisterUserAndCreateThreeEntryAndDeleteEntryTwoAndEntryCountIsTwo() throws Exception {
        diaryService.register("userName", "password");
        diaryService.Login("userName", "password");
        diaryService.createEntries("title1", "content1");
        String result = diaryService.createEntries("title2", "content2");
        diaryService.createEntries("title3", "content3");
        diaryService.deleteEntryById(result);
        assertEquals(2, diaryService.countEntries());
    }

    @Test
    public void testToRegisterUserAndCreateThreeEntryAndDeleteEntryTwoAndEntryCountIsTwoAlsoCheckIfDeletedEntryDoesNotExist() throws Exception {
        diaryService.register("userName", "password");
        diaryService.Login("userName", "password");
        diaryService.createEntries("title1", "content1");
        String result = diaryService.createEntries("title2", "content2");
        diaryService.createEntries("title3", "content3");
        diaryService.deleteEntryById(result);
        assertEquals(2, diaryService.countEntries());
        assertFalse(diaryService.existEntryById(result));

    }

    @Test
    public void testNotToCreateEntryIfUserIsLogOut() throws Exception {
        diaryService.register("userName", "password");
        diaryService.Login("userName", "password");
        diaryService.createEntries("title1", "content1");
        String result = diaryService.createEntries("title2", "content2");
        assertEquals(2, diaryService.countEntries());
        diaryService.Logout();
        assertThrows(IllegalArgumentException.class, () -> diaryService.countEntries());
    }

    }