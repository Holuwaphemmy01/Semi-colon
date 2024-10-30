package DiaryApplication.data.models;
import java.util.ArrayList;
import java.util.List;

import DiaryApplication.data.repositories.models.Entry;

import static java.lang.StringTemplate.STR;

public class Diary {
    private String username;
    private String password;
    private String title;
    private int diaryId = 3125;
    private boolean isLocked = true;


    public int getDiaryId() {
        return diaryId;
    }

    public void setDiaryId() {
        this.diaryId += 1;
    }

    public Diary(){

    }
    public Diary(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getPassword() {
        return this.password;
    }

    public String getTitle() {
        return title;
    }

    public boolean isLocked() {
        return isLocked;
    }

    public void setLocked(boolean locked) {
        isLocked = locked;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }

    public String toString(){
    return STR."Entry{username=\{username}, title='\{title}', password='\{password}'}";

    }
}
