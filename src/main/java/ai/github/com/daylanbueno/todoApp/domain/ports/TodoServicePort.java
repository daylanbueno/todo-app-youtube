package ai.github.com.daylanbueno.todoApp.domain.ports;

import ai.github.com.daylanbueno.todoApp.domain.Todo;

import java.util.List;

public interface TodoServicePort {

    Todo saveTodo(Todo todo);

    List<Todo> findAllTodo();

}
