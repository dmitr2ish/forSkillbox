package dmitr2ish.com.github.forSkillbox.repository;

import dmitr2ish.com.github.forSkillbox.entity.RecordEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;

@Repository
public class RecordRepositoryImpl implements RecordRepository {

    private final EntityManager entityManager;

    @Autowired
    public RecordRepositoryImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public void add(RecordEntity record) {
        entityManager.persist(record);
        entityManager.flush();
    }

    @Override
    public void deleteAll() {
        entityManager.createQuery("delete from RecordEntity c").executeUpdate();
    }
}
