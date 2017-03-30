package nl.ordina.reactor.playground;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import reactor.core.publisher.Flux;

@SpringBootApplication
public class PlayGroundApplication {
    public static void main(String[] args) {
        SpringApplication.run(PlayGroundApplication.class, args);
    }
}