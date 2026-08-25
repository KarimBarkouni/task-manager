package com.taskmanager.backend.controller;

import com.taskmanager.backend.model.Task;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import java.util.List;
import java.util.ArrayList;

@RestController
public class TaskController {

    @GetMapping("/api/tasks")
    public List<Task> getTasks() {
        Task task = new Task();
            task.setId(1L);
            task.setTitle("Sample Task");
            task.setDescription("This is a sample task.");
            task.setCompleted(false);
            task.setPriority("Medium");

        Task task2 = new Task();
            task2.setId(2L);
            task2.setTitle("Another Task");
            task2.setDescription("This is another sample task.");
            task2.setCompleted(true);
            task2.setPriority("High");
            
        List<Task> tasks = new ArrayList<>();
        tasks.add(task);
        tasks.add(task2);
        return tasks;
    }

    @PostMapping("/api/tasks")
    public Task createTask(@RequestBody Task task) {
        return task;
    }
    
}