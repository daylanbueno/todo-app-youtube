package ai.github.com.daylanbueno.todoApp.adapter.controllers;

import ai.github.com.daylanbueno.todoApp.domain.Todo;
import ai.github.com.daylanbueno.todoApp.domain.ports.TodoServicePort;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("todos")
@AllArgsConstructor
public class TodoController {


    private final TodoServicePort todoServicePort;

    @PostMapping
    private Todo create(@RequestBody Todo todo) {
        return todoServicePort.saveTodo(todo);
    }

    @GetMapping
    private List<Todo> findAll() {
        return todoServicePort.findAllTodo();
    }

}
