package ai.github.com.daylanbueno.todoApp.adapter.repository;

import ai.github.com.daylanbueno.todoApp.adapter.entities.TodoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoRepository  extends JpaRepository<TodoEntity, Integer> {
}
