package com.example;

public class Main {
    public static void main(String[] args) {
        UserRepository repository = new UserRepository();
        UserService userService = new UserService(repository);
        UserController controller = new UserController(userService);

        controller.registerUser();
        controller.changeEmail();
        controller.showUser();
    }
}
