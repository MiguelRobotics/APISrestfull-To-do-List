package example.todolist.model;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "tasks") // Nome da tabela no banco
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false) // O título não pode ser nulo
    private String title;

    @Column(length = 500) // Limite de caracteres para descrição
    private String description;

    private LocalDate dueDate;

    @Column(nullable = false)
    private boolean completed = false;

    // Construtor padrão (necessário para o JPA)
    public Task() {}

    // Construtor com parâmetros
    public Task(String title, String description, LocalDate dueDate, boolean completed) {
        this.title = title;
        this.description = description;
        this.dueDate = dueDate;
        this.completed = completed;
    }

    // Getters e Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }
}
