package com.example.demo.todo.services;


import com.example.demo.todo.model.Titles;
import org.springframework.beans.factory.annotation.Autowired;

public class TitleServices {

    private com.example.demo.todo.repo.TitleRepo titleRepo;

    @Autowired
    public TitleServices(com.example.demo.todo.repo.TitleRepo titleRepo) {

        this.titleRepo = titleRepo;
    }


    public static Titles save(Titles titleItem) {

        return titleItem;
    }

    public static void deleteById(Long id) {

    }
}
