package com.hmonge.curso.sprinboot.error.springboot_error.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hmonge.curso.sprinboot.error.springboot_error.exceptions.UserNotFoundException;
import com.hmonge.curso.sprinboot.error.springboot_error.models.domain.User;
import com.hmonge.curso.sprinboot.error.springboot_error.services.IUserService;

@RestController
@RequestMapping("/app")
public class AppController {

    @Autowired
    private IUserService service;

    @GetMapping
    public String index() {
        // int value = 100 / 0;
        int value = Integer.parseInt("10x");
        System.out.println(value);
        return "Ok 200";
    }

    @GetMapping("/show/{id}")
    public User show(@PathVariable(name = "id") Long id) {
        User user = service.findById(id).orElseThrow(() -> {
            return new UserNotFoundException("Error el usuario no existe!");
        });

        /*
         * if (user == null) {
         * throw new UserNotFoundException("Error el usuario no existe!");
         * }
         */

        System.out.println(user.getName());
        return user;
    }

    /*
     * @GetMapping("/show/{id}")
     * public ResponseEntity<?> show(@PathVariable(name = "id") Long id) {
     * Optional<User> optionalUser = service.findById(id);
     * if (optionalUser.isEmpty()) {
     * return ResponseEntity.notFound().build();
     * }
     * 
     * return ResponseEntity.ok(optionalUser.get());
     * }
     */
}
