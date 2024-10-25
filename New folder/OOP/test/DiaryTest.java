import DiaryApplication.data.repositories.DiaryRepositoriesImply;
import DiaryApplication.models.Diary;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class DiaryTest {

    private DiaryRepositoriesImply diaryRepositoriesImply = new DiaryRepositoriesImply();
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
        String result = String.valueOf(diaryRepositoriesImply.findById("adeleke"));
        String expected = "Diary{username='adeleke', title='null', password='password1'}";
        assertEquals(expected, result);
    }

    @Test
    public void testToFindByUserNameThatDoesNotExist(){
        Diary diary1 = new Diary("Oluwafemi","password");
        Diary diary2 = new Diary("adeleke","password1");
        Diary diary3 = new Diary("femzy","password2");
        diaryRepositoriesImply.saveDiary(diary1);
        diaryRepositoriesImply.saveDiary(diary2);
        diaryRepositoriesImply.saveDiary(diary3);
        String result = diaryRepositoriesImply.findById("maribo");
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
}
