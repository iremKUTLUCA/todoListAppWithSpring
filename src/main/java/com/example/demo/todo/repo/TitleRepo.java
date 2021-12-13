package com.example.demo.todo.repo;


import com.example.demo.todo.model.Titles;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TitleRepo extends JpaRepository<Titles, Integer> {
}
