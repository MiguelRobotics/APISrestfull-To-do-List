package example.todolist.service;

import example.todolist.model.Task;
import example.todolist.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service // Indica que esta classe é um serviço gerenciado pelo Spring
public class TaskService {

    @Autowired // Injeta automaticamente uma instância de TaskRepository
    private TaskRepository taskRepository;

    // Retorna todas as tarefas
    public List<Task> getAllTasks() {
        return taskRepository.findAll();
    }

    // Retorna uma tarefa pelo ID
    public Optional<Task> getTaskById(Long id) {
        return taskRepository.findById(id);
    }

    // Cria uma nova tarefa
    public Task createTask(Task task) {
        return taskRepository.save(task);
    }

    // Atualiza uma tarefa existente
    public Task updateTask(Long id, Task taskDetails) {
        Task task = taskRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Tarefa não encontrada com o ID: " + id));

        // Atualiza os campos da tarefa
        task.setTitle(taskDetails.getTitle());
        task.setDescription(taskDetails.getDescription());
        task.setDueDate(taskDetails.getDueDate());
        task.setCompleted(taskDetails.isCompleted());

        // Salva a tarefa atualizada no banco de dados
        return taskRepository.save(task);
    }

    // Exclui uma tarefa
    public void deleteTask(Long id) {
        taskRepository.deleteById(id);
    }
}