package com.example.database.todo.example.repository;

import com.example.database.todo.example.model.Todo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoRepository extends JpaRepository<Todo, Integer> {


}
