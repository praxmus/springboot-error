package com.hmonge.curso.sprinboot.error.springboot_error;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.hmonge.curso.sprinboot.error.springboot_error.models.domain.User;

@Configuration
public class AppConfig {

    @Bean
    public List<User> users() {
        List<User> users = new ArrayList<>();

        users.add(new User(1L, "Steve", "Rogers"));
        users.add(new User(2L, "Tony", "Stark"));
        users.add(new User(3L, "Loise", "Lane"));
        users.add(new User(4L, "Clark", "Kent"));
        users.add(new User(5L, "Bruce", "Wayne"));

        return users;
    }

}
