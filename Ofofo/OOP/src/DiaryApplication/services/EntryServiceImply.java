package DiaryApplication.services;

import DiaryApplication.data.repositories.EntryRepositoriesImpl;

import java.sql.SQLOutput;

public class EntryServiceImply implements EntryService {
    EntryRepositoriesImpl repositories = new EntryRepositoriesImpl();

    private int id = 4021;

    @Override
    public void create(String title, String description) {
        DiaryApplication.data.repositories.models.Entry entry = new DiaryApplication.data.repositories.models.Entry();
        entry.setTitle(title);
        entry.setBody(description);
        entry.setId(this.id += 1);
        System.out.println("Your entry number is "+this.id);
        repositories.save(entry);
    }




}
