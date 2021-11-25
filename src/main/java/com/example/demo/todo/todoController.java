package com.example.demo.todo;

import com.sun.istack.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path= "api/v1/todo")
public class todoController {

    private final todoServices todoServices;

    @Autowired
    public todoController(todoServices todoServices){
        this.todoServices = todoServices;
    }


    @PostMapping
    public todoList save(@Validated @NotNull @RequestBody todoList todoItem){
        return todoServices.save(todoItem);
    }

    @PostMapping
    public todoList update(@Validated @NotNull @RequestBody todoList todoItem) {
        return todoServices.save(todoItem);
    }

    @DeleteMapping(value = "/{id}")
    public void delete(@PathVariable Long id){
        todoServices.deleteById(id);
    }
}
