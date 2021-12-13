package com.example.demo.todo.services;

import com.example.demo.todo.model.TodoList;
import com.example.demo.todo.repo.TodoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TodoServices {

    private TodoRepo todoRepo;

    @Autowired
    public TodoServices(com.example.demo.todo.repo.TodoRepo todoRepo) {

        this.todoRepo = todoRepo;
    }

    public List<TodoList> gettodo(){

        return todoRepo.findAll();
    }

    public TodoList save(TodoList todoItem) {

        return (TodoList) todoRepo;
    }

    public void deleteById(Long id) {

    }
}
