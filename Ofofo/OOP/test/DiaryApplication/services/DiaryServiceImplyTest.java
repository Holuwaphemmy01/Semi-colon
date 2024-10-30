package DiaryApplication.services;

import DiaryApplication.data.models.Diary;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DiaryServiceImplyTest {
        DiaryServiceImply diaryService = new DiaryServiceImply();

    @Test
    void testToRegisterMember() throws Exception {
            diaryService.register("oluwafemi", "password1");
            assertEquals(1,  diaryService.count());
    }

    @Test
    void testNotToRegisterMemberThatHaveBeenRegistered() throws Exception {
        diaryService.register("oluwafemi", "password1");
        assertThrows(Exception.class, () -> diaryService.register("oluwafemi", "password1"));
    }

    @Test
    void testToLoginWithCorrectPassword() throws Exception {
        diaryService.register("oluwafemi", "password1");
        Diary diary = diaryService.Login("oluwafemi", "password1");
        assertEquals("oluwafemi", diary.getUsername());
    }

    @Test
    void testToThrowExceptionWhenLoginWithIncorrectPassword() throws Exception {
        diaryService.register("oluwafemi", "password1");
        assertThrows(Exception.class, () -> diaryService.Login("oluwafemi", "password"));
    }

    @Test
    void testToThrowExceptionWhenLoginWithIncorrectUsername() throws Exception {
        diaryService.register("oluwafemi", "password1");
        assertThrows(Exception.class, () -> diaryService.Login("oluwfemi", "password"));
    }

    @Test
    void testToReturnFalseIfDiaryIsNotLocked() throws Exception {
        diaryService.register("oluwafemi", "password1");
        Diary diary = diaryService.Login("oluwafemi", "password1");
        assertFalse(diary.isLocked());
    }



}