package com.company.Register;


import java.util.Scanner;

import static java.lang.System.in;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(in);
        Register register = new Register();
        System.out.println("Book King");
        while (true) {

            System.out.println("1-> Sign Up");
            System.out.println("2-> Sign In");
            System.out.println("3-> user list");
            System.out.println("4-> search user");
            System.out.print("= ");
            int n = scanner.nextInt();
            switch (n) {
                case 1 -> {
                    System.out.print("User name write: ");
                    String name = scanner.nextLine();
                    System.out.print("Password  write: ");
                    int password = scanner.nextInt();


                    register.signUp(name, password);

                }
                case 2 -> {
                    System.out.print("User name write: ");
                    String name = scanner.nextLine();

                    System.out.print("Password  write: ");
                    int password = scanner.nextInt();
                    register.signIn(name, password);
                }
                case 3 -> {

                }
            }


        }

    }



}

