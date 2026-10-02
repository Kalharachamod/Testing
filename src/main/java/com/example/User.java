package com.example;

public class User {
    private final int id;
    private String name;
    private String email;
    private String no;

    public User(int id, String name, String email, String no) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.no = no;
    }

    public int getId() { return id; }

    public String getEmail() { return email; }

    public String getNo() { return no; }

    public void updateEmail(String email) {
        this.email = email;
    }
}
