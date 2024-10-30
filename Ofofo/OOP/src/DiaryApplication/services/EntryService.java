package DiaryApplication.services;

public interface EntryService {
int countEntries(String userName);
DiaryApplication.data.repositories.models.Entry getEntryByIdAndUSerId(String userId, int entryId);




}
