package com.example.demo.todo.model;

import com.sun.istack.NotNull;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "todo")
@Getter
@Setter

public class TodoList {


    @Id
    @GeneratedValue
    @Column(name = "todo_id")
    private Integer todo_id;
 //   @NotNull
    @Column(name = "tik")
    private Integer tik;
    @Column(name = "content")
    private String content;
    @Column(name="startDate")
    private LocalDate startDate;
    @Column(name="endDate")
    private LocalDate endDate;

}
