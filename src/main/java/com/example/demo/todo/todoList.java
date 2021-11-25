package com.example.demo.todo;

import com.sun.istack.NotNull;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table
public class todoList {


    @Id
    @GeneratedValue
    private Integer id;
    @NotNull
    private boolean tik;
    private String content;
    private LocalDate startDate;
    private LocalDate endDate;

    public todoList() {

    }

    public todoList(int id) {
        this.id = id;
    }

    public todoList(int id, boolean tik, String content, LocalDate startDate, LocalDate endDate) {
        this.id = id;
        this.tik = tik;
        this.content = content;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public todoList(boolean tik, String content, LocalDate startDate, LocalDate endDate) {
        this.tik = tik;
        this.content = content;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public todoList(int id, int i, String s, String s1, String s2) {

    }


    public void setId(int id) {
        this.id = id;
    }


    public int getId() {
        return id;
    }

    public boolean isTik() {
        return tik;
    }

    public void setTik(boolean tik) {
        this.tik = tik;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    @Override
    public String toString() {
        return "todoList{" +
                "id=" + id +
                ", tik=" + tik +
                ", content='" + content + '\'' +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                '}';
    }
}
