package com.java.test.beans;

public class User {
    private String username;
    private String email;
    private String curse;
    private String institute;
    private String password;

    public User() {
    }

    public User(String username, String email, String curse, String institute, String password) {
        this.username = username;
        this.email = email;
        this.curse = curse;
        this.institute = institute;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCurse() {
        return curse;
    }

    public void setCurse(String curse) {
        this.curse = curse;
    }

    public String getInstitute() {
        return institute;
    }

    public void setInstitute(String institute) {
        this.institute = institute;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}