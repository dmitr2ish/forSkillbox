package dmitr2ish.com.github.forSkillbox.repository;

import dmitr2ish.com.github.forSkillbox.entity.RecordEntity;

public interface RecordRepository {
    // adding in repository new record
    void add(RecordEntity record);

    // deleting all records from repository
    void deleteAll();
}
