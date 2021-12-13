package com.example.demo.todo.model;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "title")
@Getter
@Setter

@NoArgsConstructor

public class Titles {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int title_id;

    @Column(name = "yapılacaklar")
    private String yapılacaklar;


    @OneToMany(mappedBy = "title")
    private List<TodoList> toDoListEntityList;
}
