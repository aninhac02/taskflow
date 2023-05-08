package com.api.taskflow.model.service;

import com.api.taskflow.model.dto.UserDto;
import com.api.taskflow.model.entity.User;
import com.api.taskflow.model.repository.UserRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private ModelMapper modelMapper;

    public void save(UserDto user) {
        userRepository.save(modelMapper.map(user, User.class));
    }
    public UserDto findById(Long id) {
        return modelMapper.map(userRepository.findById(id), UserDto.class);
    }

    public List<UserDto> findAll() {
        return userRepository.findAll().stream().map(u -> modelMapper.map(u, UserDto.class)).toList();
    }
}
