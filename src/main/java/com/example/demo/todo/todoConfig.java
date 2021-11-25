package com.example.demo.todo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;

public class todoConfig {

    @Bean
    CommandLineRunner commandLineRunner(
            todoRepo repository) {
        return args -> {
            new todoList(
                    1,
               1,
               "sadasd",
               "10.11.2021",
               "12.11.2021"
            );
        };
    }
}
