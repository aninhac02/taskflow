package com.api.taskflow.model.service;

import com.api.taskflow.model.dto.TaskDto;
import com.api.taskflow.model.entity.Task;
import com.api.taskflow.model.repository.TaskRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class TaskService {

    @Autowired
    private TaskRepository taskRepository;

    @Autowired
    private ModelMapper modelMapper;

    public void save(TaskDto task) {
        taskRepository.save(modelMapper.map(task, Task.class));
    }

    public List<TaskDto> findAll() {
        return taskRepository.findAll().stream().map(t -> modelMapper.map(t, TaskDto.class)).toList();
    }
}
