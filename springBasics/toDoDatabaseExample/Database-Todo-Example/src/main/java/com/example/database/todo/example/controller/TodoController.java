package com.example.database.todo.example.controller;

import com.example.database.todo.example.model.Todo;
import com.example.database.todo.example.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
public class TodoController {

    @Autowired
    private TodoRepository todoRepository;


    @PostMapping(value = "/post/todos", consumes = "application/json")
    public ResponseEntity submitTodo(@RequestBody Todo todo) {
        todoRepository.save(todo);
        return new ResponseEntity(HttpStatus.CREATED);
    }

    @GetMapping("/get/todos")
    List<Todo> getAllTodos() {
        List<Todo> todos = todoRepository.findAll();
        return todos;
    }

    @DeleteMapping("/delete/todos/{id}")
    public void deleteTodo(@PathVariable("id") Integer id) {
        todoRepository.deleteById(id);
    }
}
