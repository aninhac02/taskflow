package com.api.taskflow.model.repository;

import com.api.taskflow.model.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public abstract class UserRepository implements JpaRepository<User, Long> {

}
