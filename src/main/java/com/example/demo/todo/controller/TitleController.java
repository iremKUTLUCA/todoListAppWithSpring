package com.example.demo.todo.controller;

import com.example.demo.todo.model.Titles;
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
    public Titles save(@Validated @NotNull @RequestBody Titles titlesItem){

        return TitleServices.save(titlesItem);
    }

    @PutMapping
    public Titles update(@Validated @NotNull @RequestBody Titles titlesItem) {

        return TitleServices.save(titlesItem);
    }

    @DeleteMapping(value = "/{id}")
    public void delete(@PathVariable Long id){

        TitleServices.deleteById(id);
    }
}
