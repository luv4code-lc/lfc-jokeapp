package lfc.springframework.joke;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("classpath:chuck-norris-config.xml")
public class LfcJokeAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(LfcJokeAppApplication.class, args);
    }

}
