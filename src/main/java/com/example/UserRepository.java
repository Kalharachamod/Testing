package com.example;

import java.util.ArrayList;
import java.util.List;

public class UserRepository {
    private final List<User> users = new ArrayList<>();

    public void save(User user) {
        users.add(user);
    }

    public User findById(int id) {
        for (User user : users) {
            if (user.getId() == id) return user;
        }
        return null;
    }

    public List<User> findAll() {
        return users;
    }
}
