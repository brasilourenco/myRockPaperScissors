package com.lourenco;

import java.util.Scanner;

public class User {
    private Scanner scanner;

    public User() {
        scanner = new Scanner(System.in);
    }

    public String userChoose() {
        System.out.println("Hi there! Do you wanna play rock, paper, scissors? \n" + "enter 1 to choose rock; \n" + "enter 2 to choose paper; \n" + "enter 3 to choose scissors. \n");
        byte input = scanner.nextByte();
        System.out.println("\n");

        if (input == 1) {
            System.out.println("you choose rock...");
            return "rock";
        } else if (input == 2) {
            System.out.println("you choose paper...");
            return "paper";
        } else if (input == 3) {
            System.out.println("you choose scissors...");
            return "scissors";
        } else {
            System.err.println("ERROR! \n" + "INVALID NUMBER.");
            System.exit(0);
            return "";
        }

    }
}
