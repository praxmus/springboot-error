package com.hmonge.curso.sprinboot.error.springboot_error.services;

import java.util.List;
import java.util.Optional;

import com.hmonge.curso.sprinboot.error.springboot_error.models.domain.User;

public interface IUserService {

    List<User> findAll();

    Optional<User> findById(Long id);
}
