package me.dio.santanderAPI.service;

import me.dio.santanderAPI.domain.model.User;

public interface UserService {

    User findById(Long id);

    User create(User userToCreate);
}
