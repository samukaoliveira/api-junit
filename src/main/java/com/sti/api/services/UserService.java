package com.sti.api.services;

import com.sti.api.domain.User;
import org.springframework.stereotype.Service;

import java.util.List;

public interface UserService {

    User findById(Integer id);

    List<User> findAll();
}
