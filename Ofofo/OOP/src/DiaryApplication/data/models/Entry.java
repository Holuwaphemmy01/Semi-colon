package DiaryApplication.data.repositories.models;

import DiaryApplication.data.models.Diary;
import DiaryApplication.data.repositories.DiaryRepositoriesImply;

public class Entry {
    private String id;
    private String title;
    private String body;

    public Entry(){
    }

    public Entry(String title, String body) {
        this.id = id;
        this.title = title;
        this.body = body;
    }

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    @Override
    public String toString() {
        return "Entry{" + "id='" + id + '\'' + ", title='" + title + '\'' + ", body='" + body + '\'' + '}';
    }
}
