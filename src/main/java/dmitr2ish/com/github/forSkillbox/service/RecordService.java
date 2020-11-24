package dmitr2ish.com.github.forSkillbox.service;

import dmitr2ish.com.github.forSkillbox.dto.Record;

public interface RecordService {
    // Getting a record as a dto and sending this object as an entity to the repository
    void add(Record record);

    // Deleting all records from repository
    void deleteAll();
}
