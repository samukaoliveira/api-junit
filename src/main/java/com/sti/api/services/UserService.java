package com.sti.api.services;

import com.sti.api.domain.User;
import com.sti.api.domain.dto.UserDTO;
import org.springframework.stereotype.Service;

import java.util.List;

public interface UserService {

    User findById(Integer id);

    List<User> findAll();

    User create(UserDTO obj);

    User update(UserDTO obj);

    void delete(Integer id);
}
