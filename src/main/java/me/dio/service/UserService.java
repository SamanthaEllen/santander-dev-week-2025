package me.dio.service;

import me.dio.domain.model.User;

public interface UserService {
    User finById(Long id);

    User create(User userToCreate);

}
