package com.taskmanager.backend.controller;

import com.taskmanager.backend.repository.TaskRepository;
import com.taskmanager.backend.model.Task;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import java.util.List;

@RestController
public class TaskController {
    
    private final TaskRepository taskRepository;
    public TaskController(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    @GetMapping("/api/tasks")
    public List<Task> getTasks() {
        return taskRepository.findAll();
    }

    @PostMapping("/api/tasks")
    public Task createTask(@RequestBody Task task) {
        return taskRepository.save(task);
    }
    
}