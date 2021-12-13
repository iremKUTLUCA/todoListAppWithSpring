package com.example.demo.todo.controller;

import com.example.demo.todo.model.TodoList;
import com.example.demo.todo.services.TodoServices;
import com.sun.istack.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path= "api/v1/todo")
public class TodoController {

    private final com.example.demo.todo.services.TodoServices todoServices;

    @Autowired
    public TodoController(com.example.demo.todo.services.TodoServices todoServices) {
        this.todoServices = todoServices;
    }


    @PostMapping
    public TodoList save(@Validated @NotNull @RequestBody TodoList todoItem){

        return todoServices.save(todoItem);
    }

    @PutMapping
    public TodoList update(@Validated @NotNull @RequestBody TodoList todoItem) {

        return todoServices.save(todoItem);
    }

    @DeleteMapping(value = "/{id}")
    public void delete(@PathVariable Long id){

        todoServices.deleteById(id);
    }
}
