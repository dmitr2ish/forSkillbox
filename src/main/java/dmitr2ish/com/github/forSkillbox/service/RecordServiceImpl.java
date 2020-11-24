package dmitr2ish.com.github.forSkillbox.service;

import dmitr2ish.com.github.forSkillbox.dto.Record;
import dmitr2ish.com.github.forSkillbox.entity.RecordEntity;
import dmitr2ish.com.github.forSkillbox.repository.RecordRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class RecordServiceImpl implements RecordService {

    private final RecordRepository repository;

    @Autowired
    public RecordServiceImpl(RecordRepository repository) {
        this.repository = repository;
    }

    @Override
    public void add(Record record) {
        RecordEntity recordEntity = new RecordEntity();
        recordEntity.setSomeText(record.getSomeText());
        repository.add(recordEntity);
    }

    @Override
    public void deleteAll() {
        repository.deleteAll();
    }
}
