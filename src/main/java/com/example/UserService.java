package com.example;

public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void createUser(int id, String name, String email, String no) {
        User user = new User(id, name, email, no);
        userRepository.save(user);
    }

    public User getUser(int id) {
        return userRepository.findById(id);
    }

    public void updateUserEmail(int id, String email) {
        User user = userRepository.findById(id);
        if (user != null) user.updateEmail(email);
    }
}
