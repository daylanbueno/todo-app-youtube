package ai.github.com.daylanbueno.todoApp.adapter.repository;

import ai.github.com.daylanbueno.todoApp.adapter.entities.TodoEntity;
import ai.github.com.daylanbueno.todoApp.domain.Todo;
import ai.github.com.daylanbueno.todoApp.domain.ports.TodoARepositoryPort;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
@AllArgsConstructor
public class TodoRepositoryAdapter implements TodoARepositoryPort {

    private final TodoRepository todoRepository;

    private final ModelMapper modelMapper;
    @Override
    public Todo saveTodo(Todo todo) {

        TodoEntity entity = modelMapper.map(todo, TodoEntity.class);

        TodoEntity save = todoRepository.save(entity);

        return modelMapper.map(save, Todo.class);
    }

    @Override
    public List<Todo> findAllTodo() {

        List<TodoEntity> all = todoRepository.findAll();

        return all.stream()
                .map( todoEntity -> modelMapper.map(todoEntity, Todo.class))
                .collect(Collectors.toList());

    }
}
