package com.example.demo.todo;

import org.springframework.data.jpa.repository.JpaRepository;

public interface todoRepo extends JpaRepository<todoList, Integer> {
}