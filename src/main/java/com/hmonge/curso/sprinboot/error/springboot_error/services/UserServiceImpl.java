package com.hmonge.curso.sprinboot.error.springboot_error.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hmonge.curso.sprinboot.error.springboot_error.models.domain.User;

@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    private List<User> users;

    @Override
    public List<User> findAll() {
        return users;
    }

    @Override
    public Optional<User> findById(Long id) {
        return users.stream().filter(u -> u.getId().equals(id)).findFirst();
    }

    /*
     * @Override
     * public Optional<User> findById(Long id) {
     * User user = null;
     * 
     * for (User u : users) {
     * if (u.getId().equals(id)) {
     * user = u;
     * break;
     * }
     * }
     * 
     * return Optional.ofNullable(user);
     * }
     */
}
