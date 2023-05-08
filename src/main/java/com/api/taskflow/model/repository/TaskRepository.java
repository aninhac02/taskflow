package com.api.taskflow.model.repository;

import com.api.taskflow.model.entity.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public abstract class TaskRepository implements JpaRepository<Task, Long> {
}
