package DiaryApplication.models;

import java.util.ArrayList;
import java.util.List;

import static java.lang.StringTemplate.STR;

public class Diary {
    private String username;
    private String password;
    private String title;
    private List<Entry> entries;

    public Diary(String username, String password) {
        this.username = username;
        this.password = password;
        entries = new ArrayList<>();
    }

    public String getPassword() {
        return this.password;
    }

    public String getTitle() {
        return title;
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
    public List<Entry> getEntries() {
        return entries;
    }
    public void setEntries(List<Entry> entries) {
        this.entries = entries;
    }


    public String toString(){
    return STR."Entry{username=\{username}, title='\{title}', password='\{password}'}";

    }
}
