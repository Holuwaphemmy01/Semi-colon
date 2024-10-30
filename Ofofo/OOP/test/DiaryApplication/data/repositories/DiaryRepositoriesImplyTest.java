package DiaryApplication.data.repositories;

import DiaryApplication.data.models.Diary;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class DiaryRepositoriesImplyTest {

    private final DiaryRepositoriesImply diaryRepositoriesImply = new DiaryRepositoriesImply();
    @Test
    public void testThatDiaryIsEmpty(){
        assertEquals(0, diaryRepositoriesImply.count());
    }

    @Test
    public void testToSaveEntry(){
        Diary diary = new Diary("Oluwafemi","password");
        diaryRepositoriesImply.saveDiary(diary);
        assertEquals(1, diaryRepositoriesImply.count());
    }

    @Test
    public void testToCountNumberOfDiariesSaved(){
        Diary diary1 = new Diary("Oluwafemi","password");
        Diary diary2 = new Diary("adeleke","password1");
        Diary diary3 = new Diary("femzy","password2");
        diaryRepositoriesImply.saveDiary(diary1);
        diaryRepositoriesImply.saveDiary(diary2);
        diaryRepositoriesImply.saveDiary(diary3);
        assertEquals(3, diaryRepositoriesImply.count());
    }


    @Test
    public void testToFindByUserName(){
        Diary diary1 = new Diary("Oluwafemi","password");
        Diary diary2 = new Diary("adeleke","password1");
        Diary diary3 = new Diary("femzy","password2");
        diaryRepositoriesImply.saveDiary(diary1);
        diaryRepositoriesImply.saveDiary(diary2);
        diaryRepositoriesImply.saveDiary(diary3);
        Diary result = diaryRepositoriesImply.findByUserName("adeleke");
        assertEquals(diary2, result);
    }

    @Test
    public void testToFindByUserNameThatDoesNotExist(){
        Diary diary1 = new Diary("Oluwafemi","password");
        Diary diary2 = new Diary("adeleke","password1");
        Diary diary3 = new Diary("femzy","password2");
        diaryRepositoriesImply.saveDiary(diary1);
        diaryRepositoriesImply.saveDiary(diary2);
        diaryRepositoriesImply.saveDiary(diary3);
        Diary result = diaryRepositoriesImply.findByUserName("maribo");
        assertNull(result);
    }

    @Test
    public void testToDeleteDiary(){
        Diary diary1 = new Diary("Oluwafemi","password");
        diaryRepositoriesImply.saveDiary(diary1);
        Diary diary2 = new Diary("adeleke","password1");
        diaryRepositoriesImply.saveDiary(diary2);
        Diary diary3 = new Diary("femzy","password2");
        diaryRepositoriesImply.saveDiary(diary3);
        diaryRepositoriesImply.delete(diary2);
        int result = diaryRepositoriesImply.count();
        assertEquals(2, result);
    }

    @Test
    public void testToFindByTitile(){
        Diary diary1 = new Diary("Oluwafemi","password");
        diaryRepositoriesImply.saveDiary(diary1);
        Diary diary2 = new Diary("adeleke","password1");
        diaryRepositoriesImply.saveDiary(diary2);
        Diary diary3 = new Diary("femzy","password2");
        diaryRepositoriesImply.saveDiary(diary3);
        //diaryRepositoriesImply.findByTitle();
    }

}
