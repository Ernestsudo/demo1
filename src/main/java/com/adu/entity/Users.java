package com.adu.entity;

public class Users {
    private int id;
    private char username;
    private char password;
    private char email;
    private char sex;

    public Users(char sex) {
        this.sex = sex;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public char getUsername() {
        return username;
    }

    public void setUsername(char username) {
        this.username = username;
    }

    public char getPassword() {
        return password;
    }

    public void setPassword(char password) {
        this.password = password;
    }

    public char getEmail() {
        return email;
    }

    public void setEmail(char email) {
        this.email = email;
    }

    public Users() {
    }

    public Users(int id, char username, char password, char email) {
        this.id = id;
        this.username = username;
        this.password = password;

        this.email = email;
    }
}
