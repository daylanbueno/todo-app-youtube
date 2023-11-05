package ai.github.com.daylanbueno.todoApp.domain;

public class Todo {

    private Integer id;

    private String description;

    private Boolean done;


    public Todo() {
    }

    public Todo(Integer id, String description, Boolean done) {
        this.id = id;
        this.description = description;
        this.done = done;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Boolean getDone() {
        return done;
    }

    public void setDone(Boolean done) {
        this.done = done;
    }

}
