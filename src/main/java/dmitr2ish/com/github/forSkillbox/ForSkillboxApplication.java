package dmitr2ish.com.github.forSkillbox;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.logging.Logger;

@SpringBootApplication
public class ForSkillboxApplication {

    @Bean
    public Logger getLogger() {
        return Logger.getLogger(ForSkillboxApplication.class.getName());
    }

    public static void main(String[] args) {
        SpringApplication.run(ForSkillboxApplication.class, args);
    }

}
