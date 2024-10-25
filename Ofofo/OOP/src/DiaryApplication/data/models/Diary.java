package DiaryApplication.data.models;
import java.util.ArrayList;
import java.util.List;

import DiaryApplication.data.repositories.models.Entry;

import static java.lang.StringTemplate.STR;

public class Diary {
    private String username;
    private String password;
    private String title;
    private boolean isLocked = true;
    private List<Entry> entries = new ArrayList<>();
    ;

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
    public List<DiaryApplication.data.repositories.models.Entry> getEntries() {
        return entries;
    }
    public void setEntries(List<DiaryApplication.data.repositories.models.Entry> entries) {
        this.entries = entries;
    }


    public String toString(){
    return STR."Entry{username=\{username}, title='\{title}', password='\{password}'}";

    }
}
