package com.lourenco;

import java.util.Scanner;

public class Logic {
    private Scanner scanner;
    private User user;
    private Cp cp;

    public Logic() {
        scanner = new Scanner(System.in);
        user = new User();
        cp = new Cp();
    }

    public void game() {
        while (true) {
            String userGame = user.userChoose();
            String cpGame = cp.cpChoose();

            if (userGame.equals(cpGame)) {
                System.out.println("DRAW!");
                System.out.println("\n");
                System.out.println("Do you wanna play again?");
            } else if (userGame.equals("rock") && cpGame.equals("scissors")) {
                System.out.println("YOU WIN!");
                System.out.println("\n");
                System.out.println("Good! Do you wanna play again?");
            } else if (userGame.equals("paper") && cpGame.equals("rock")) {
                System.out.println("YOU WIN!!");
                System.out.println("\n");
                System.out.println("Good! Do you wanna play again?");
            } else if (userGame.equals("scissors") && cpGame.equals("paper")) {
                System.out.println("YOU WIN!");
                System.out.println("\n");
                System.out.println("Good! Do you wanna play again?");
            } else if (userGame.equals("scissors") && cpGame.equals("rock")) {
                System.out.println("YOU LOSE!");
                System.out.println("\n");
                System.out.println("Yeah, I won! Do you wanna play again?");
            } else if (userGame.equals("rock") && cpGame.equals("paper")) {
                System.out.println("YOU LOSE!");
                System.out.println("\n");
                System.out.println("Yeah, I won! Do you wanna play again?");
            } else if (userGame.equals("paper") && cpGame.equals("scissors")) {
                System.out.println("YOU LOSE!");
                System.out.println("\n");
                System.out.println("Yeah, I won! Do you wanna play again?");
            }

            System.out.println("enter 1 to continue; \n" + "enter 2 to close; \n");
            byte input2 = scanner.nextByte();
            System.out.println("\n");

            if (input2 == 2) {
                System.out.println("Bye!");
                System.exit(0);
            }
        }
    }
}
