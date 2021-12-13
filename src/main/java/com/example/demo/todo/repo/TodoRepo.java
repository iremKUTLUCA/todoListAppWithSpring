package com.example.demo.todo.repo;

import com.example.demo.todo.model.TodoList;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TodoRepo extends JpaRepository<TodoList, Integer> {
}
