package com.example;

public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    public void registerUser() {
        userService.createUser(1, "Kalhara", "kalhara@example.com");
    }

    public void changeEmail() {
        userService.updateUserEmail(1, "newemail@example.com");
    }

    public void showUser() {
        User user = userService.getUser(1);
        if (user != null) {
            System.out.println(user.getName());
            System.out.println(user.getEmail());
        }
    }
}
