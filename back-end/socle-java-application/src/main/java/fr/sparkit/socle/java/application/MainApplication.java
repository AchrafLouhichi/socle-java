package fr.sparkit.socle.java.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan("fr.sparkit.socle.java.entities")
@ComponentScan("fr.sparkit.socle.java")
@EnableJpaRepositories(basePackages = { "fr.sparkit.socle.java.dao", "fr.sparkit.socle.java.service" })
public class MainApplication {

    public static void main(String[] args) {
	SpringApplication.run(MainApplication.class, args);
    }
}