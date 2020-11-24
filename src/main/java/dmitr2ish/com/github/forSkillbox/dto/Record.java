package dmitr2ish.com.github.forSkillbox.dto;

import lombok.Data;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

// Transition form of an object from the web to the service
@Data
public class Record {

    @NotNull(message = "input is blank")
    @Size(min = 1, max = 10, message = "missing length limits")
    private String someText;
}
