package com.example.demo.todo.model;

import com.sun.istack.NotNull;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "todo")
@Getter
@Setter

public class TodoList {


    @Id
    @GeneratedValue
    @Column(name = "id")
    private Integer id;
    @NotNull
    @Column(name = "tik")
    private Integer tik;
    @Column(name = "content")
    private String content;
    @Column(name="startDate")
    private LocalDate startDate;
    @Column(name="endDate")
    private LocalDate endDate;

    @ManyToOne()
    @JoinColumn(name="title_title_id")
    private TodoList list;


}
