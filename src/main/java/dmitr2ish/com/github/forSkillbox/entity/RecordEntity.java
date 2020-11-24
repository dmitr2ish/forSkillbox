package dmitr2ish.com.github.forSkillbox.entity;

import lombok.Data;

import javax.persistence.*;

// Record as a entity for saving in data base
@Data
@Entity
@Table(name = "record")
public class RecordEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String someText;
}
