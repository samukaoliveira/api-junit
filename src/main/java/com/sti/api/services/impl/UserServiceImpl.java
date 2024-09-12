package com.sti.api.services.impl;

import com.sti.api.domain.User;
import com.sti.api.repositories.UserRepository;
import com.sti.api.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository repository;

    @Override
    public User findById(Integer id){
        Optional<User> obj = repository.findById(id);
        return obj.orElse(null);
    }
}
