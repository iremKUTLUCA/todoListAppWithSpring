package com.example.demo.todo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class todoServices {

    private final todoRepo todoRepo;

    @Autowired
    public todoServices(com.example.demo.todo.todoRepo todoRepo) {
        this.todoRepo = todoRepo;
    }

    public List<todoList> gettodo(){
        return todoRepo.findAll();
    }

    public todoList save(todoList todoItem) {
        return (todoList) todoRepo;
    }

    public void deleteById(Long id) {

    }
}
