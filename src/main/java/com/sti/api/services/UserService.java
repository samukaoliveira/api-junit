package com.sti.api.services;

import com.sti.api.domain.User;
import org.springframework.stereotype.Service;

public interface UserService {

    User findById(Integer id);
}
