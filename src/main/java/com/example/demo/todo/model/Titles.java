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
    private Integer title_id;

    @Column(name = "yapilacaklar")
    private String yapilacaklar;

    @OneToMany(targetEntity = Titles.class)
    private List<TodoList> TodoListEntityList;


}
