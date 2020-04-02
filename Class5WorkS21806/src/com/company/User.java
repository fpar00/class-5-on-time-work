package com.company;

import java.util.ArrayList;

public class User {
    public String firstName;
    public String lastName;
    public String Email;
    public String password;

    User(String firstName, String lastName, String Email, String Password) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.Email = Email;
        this.password = Password;
    }

    User(String email) {
        this.Email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return Email;
    }

    public String getPassword() {
        return password;
    }
}
