package ai.github.com.daylanbueno.todoApp.domain.services;

import ai.github.com.daylanbueno.todoApp.domain.Todo;
import ai.github.com.daylanbueno.todoApp.domain.ports.TodoServicePort;
import ai.github.com.daylanbueno.todoApp.domain.ports.TodoARepositoryPort;

import java.util.List;

public class TodoService implements TodoServicePort {

    private  final TodoARepositoryPort todoARepositoryPort;

    public TodoService(TodoARepositoryPort todoARepositoryPort) {
        this.todoARepositoryPort = todoARepositoryPort;
    }

    @Override
    public Todo saveTodo(Todo todo) {
        return todoARepositoryPort.saveTodo(todo);
    }

    @Override
    public List<Todo> findAllTodo() {
        return todoARepositoryPort.findAllTodo();
    }
}
