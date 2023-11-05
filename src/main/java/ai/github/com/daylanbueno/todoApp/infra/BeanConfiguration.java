package ai.github.com.daylanbueno.todoApp.infra;

import ai.github.com.daylanbueno.todoApp.domain.ports.TodoServicePort;
import ai.github.com.daylanbueno.todoApp.domain.ports.TodoARepositoryPort;
import ai.github.com.daylanbueno.todoApp.domain.services.TodoService;
import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfiguration {

    @Bean
    public ModelMapper modelMapper() {
        return new ModelMapper();
    }

    @Bean
    public TodoServicePort todoServiceImpl(TodoARepositoryPort todoARepositoryPort) {
        return new TodoService(todoARepositoryPort);
    }
}
