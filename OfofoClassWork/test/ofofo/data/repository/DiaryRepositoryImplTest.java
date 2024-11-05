package ofofo.data.repository;

import ofofo.data.model.Diary;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class DiaryRepositoryImplTest {
    private final DiaryRepository diaryRepository = new DiaryRepositoryImpl();
    private final Diary diary = new Diary();

    @Test
   public void testThatDiaryRepository_NoDiaryIsSaved(){
       assertEquals(0, diaryRepository.count());
   }

   @Test
    public void testThatDiaryRepositoryIs1_OneDiaryIsAdded(){
        diary.setUserName("oluwafemi");
        diary.setPassword("password");
        diaryRepository.save(diary);
        assertEquals(1, diaryRepository.count());
   }

   @Test
    public void testThatDiaryRepositoryIs2_TwoDiariesAreAdded(){
        diary.setUserName("oluwafemi");
        diary.setPassword("password");
        diaryRepository.save(diary);
        Diary diary2 = new Diary();
        diary2.setUserName("oluwafemi2");
        diary2.setPassword("password2");
        diaryRepository.save(diary2);
   }

   @Test
    public void testThatRepositoryCanNotAddNullDiary(){
        diary.setPassword("oluwafemi");
        assertThrows(IllegalArgumentException.class, ()->  diaryRepository.save(diary));
   }

   @Test
    public void testThatRepositoryCanDeleteAllDiaries(){
       diary.setUserName("oluwafemi");
       diary.setPassword("password");
       diaryRepository.save(diary);
       Diary diary2 = new Diary();
       diary2.setUserName("oluwafemi2");
       diary2.setPassword("password2");
       diaryRepository.save(diary2);
       assertEquals(2, diaryRepository.count());
       diaryRepository.deleteAll();
       assertEquals(0, diaryRepository.count());
   }

   @Test
    public void testThatRepositoryCanDeleteDiaryById(){
        diary.setUserName("oluwafemi");
        diary.setPassword("password");
        diaryRepository.save(diary);
        Diary diary2 = new Diary();
        diary2.setUserName("oluwafemi2");
        diary2.setPassword("password2");
        diaryRepository.save(diary2);
        assertEquals(2, diaryRepository.count());
        diaryRepository.deleteById("oluwafemi");
        assertEquals(1, diaryRepository.count());
   }

   @Test
    public void testThatRepositoryCanNotDeleteDiaryWhenIdIsNotPresent(){
       diary.setUserName("oluwafemi");
       diary.setPassword("password");
       diaryRepository.save(diary);
       Diary diary2 = new Diary();
       diary2.setUserName("oluwafemi2");
       diary2.setPassword("password2");
       diaryRepository.save(diary2);
       assertEquals(2, diaryRepository.count());
       diaryRepository.deleteById("adeleke");
       assertEquals(2, diaryRepository.count());
   }

   @Test
    public void testToDeleteDiaryWhenDiaryObjectIsPassed(){
       diary.setUserName("oluwafemi");
       diary.setPassword("password");
       diaryRepository.save(diary);
       Diary diary2 = new Diary();
       diary2.setUserName("oluwafemi2");
       diary2.setPassword("password2");
       diaryRepository.save(diary2);
       assertEquals(2, diaryRepository.count());
       diaryRepository.delete(diary);
       assertEquals(1, diaryRepository.count());
   }

   @Test
    public void testToCheckIfDiaryExistInTheRepository(){
       diary.setUserName("oluwafemi");
       diary.setPassword("password");
       diaryRepository.save(diary);
       Diary diary2 = new Diary();
       diary2.setUserName("oluwafemi2");
       diary2.setPassword("password2");
       diaryRepository.save(diary2);
       assertEquals(2, diaryRepository.count());
       assertTrue(diaryRepository.existsById("oluwafemi"));
   }

    @Test
    public void testToAssertFalseWhenIdDoesNotExist(){
        diary.setUserName("oluwafemi");
        diary.setPassword("password");
        diaryRepository.save(diary);
        Diary diary2 = new Diary();
        diary2.setUserName("oluwafemi2");
        diary2.setPassword("password2");
        diaryRepository.save(diary2);
        assertEquals(2, diaryRepository.count());
        assertFalse(diaryRepository.existsById("adewunmi"));
    }

    @Test
    public void testToAssertFalseWhenAnIdIsDeletedAndCheckIfItStillExist(){
        diary.setUserName("oluwafemi");
        diary.setPassword("password");
        diaryRepository.save(diary);
        Diary diary2 = new Diary();
        diary2.setUserName("oluwafemi2");
        diary2.setPassword("password2");
        diaryRepository.save(diary2);
        assertEquals(2, diaryRepository.count());
        diaryRepository.deleteById("oluwafemi");
        assertFalse(diaryRepository.existsById("oluwafemi"));
    }

    @Test
    public void testToReturnDiaryWhenFindById(){
        diary.setUserName("oluwafemi");
        diary.setPassword("password");
        diaryRepository.save(diary);
        Diary diary2 = new Diary();
        diary2.setUserName("oluwafemi2");
        diary2.setPassword("password2");
        diaryRepository.save(diary2);
        assertEquals(2, diaryRepository.count());
        assertEquals(diary, diaryRepository.findById("oluwafemi"));
    }

    @Test
    public void testToReturnNullWhenIdDoesNotExist(){
        diary.setUserName("oluwafemi");
        diary.setPassword("password");
        diaryRepository.save(diary);
        Diary diary2 = new Diary();
        diary2.setUserName("oluwafemi2");
        diary2.setPassword("password2");
        diaryRepository.save(diary2);
        assertEquals(2, diaryRepository.count());
        assertNull(diaryRepository.findById("adeleke"));
    }

}