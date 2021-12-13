package com.example.demo.todo.controller;

import com.example.demo.todo.model.TodoList;
import com.example.demo.todo.services.TitleServices;
import com.sun.istack.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path= "api/v1/title")
public class TitleController {


    @Autowired
    public void TitleController(){

    }

    @PostMapping
    public TodoList save(@Validated @NotNull @RequestBody TodoList todoItem){

        return TitleServices.save(todoItem);
    }

    @PutMapping
    public TodoList update(@Validated @NotNull @RequestBody TodoList todoItem) {

        return TitleServices.save(todoItem);
    }

    @DeleteMapping(value = "/{id}")
    public void delete(@PathVariable Long id){
        TitleServices.deleteById(id);
    }
}
