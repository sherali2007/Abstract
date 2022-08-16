package com.company.Register;

public interface CarInt {
    void signUp(String name, int password);

    void signIn(String name, int password);

    void userList();

    void userSearch(String name);
}
