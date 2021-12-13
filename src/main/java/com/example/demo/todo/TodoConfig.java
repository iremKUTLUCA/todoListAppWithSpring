package com.example.demo.todo;

import com.example.demo.todo.model.TodoList;
import com.example.demo.todo.repo.TodoRepo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;

public class TodoConfig {

    @Bean
    CommandLineRunner commandLineRunner(
            TodoRepo repository) {
        return args -> {
            new TodoList(

            );
        };
    }
}
