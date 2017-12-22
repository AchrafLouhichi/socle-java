package fr.sparkit.socle.java.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EntityScan("fr.sparkit.socle.java.entities")
@ComponentScan("fr.sparkit.socle.java.restcontroller")
public class MainApplication {

    public static void main(String[] args) {
	SpringApplication.run(MainApplication.class, args);
    }
}