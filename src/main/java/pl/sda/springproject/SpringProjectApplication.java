package pl.sda.springproject;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import pl.sda.springproject.console.Calculator;
import pl.sda.springproject.console.ConsoleInput;
import pl.sda.springproject.console.ConsoleOutput;

@SpringBootApplication
public class SpringProjectApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringProjectApplication.class, args);
    }


    }

