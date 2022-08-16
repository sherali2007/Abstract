package com.company.Register;

import java.util.Objects;
import java.util.Scanner;

import static java.lang.System.in;

public class Register implements CarInt {
    Scanner scanner = new Scanner(in);

    String[] arrayName = new String[100];
    int[] arrayPassword = new int[100];
    int count = 0;
    boolean isHave = false;


    @Override
    public void signUp(String name, int password) {
        System.out.println("Sign Up");
        System.out.print("Name write: ");
        name = scanner.nextLine();
        System.out.print("Password write: ");
        password = scanner.nextInt();

        arrayName[count] = name;
        arrayPassword[count] = password;
        count++;

    }

    @Override
    public void signIn(String name, int password) {

        System.out.println("Sign In");

        System.out.print("Name write: ");
        name = scanner.nextLine();
        System.out.print("Password write: ");
        password = scanner.nextInt();

        for (int i = 0; i < count; i++) {
            if (Objects.equals(arrayName[i], name) && arrayPassword[i] == password) {
                System.out.println("welcome !!!");
            }
        }

    }

    @Override
    public void userList() {


    }

    @Override
    public void userSearch(String name) {
        System.out.println("Search");

        System.out.print("Name write: ");
        name = scanner.nextLine();
        for (int i = 0; i < count; i++) {
            if (arrayName[i].equals(name)) {
                System.out.println(name + " Yes");
            } else {
                System.out.println(name + " no");
            }
        }
    }
}

