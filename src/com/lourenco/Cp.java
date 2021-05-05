package com.lourenco;

import java.util.Random;

public class Cp {
    private Random randomNumber;

    public Cp() {
        randomNumber = new Random();
    }

    public String cpChoose() {
        int rN = randomNumber.nextInt(3);
        if (rN == 0) {
            System.out.println("cp choose rock... \n");
            return "rock";
        } else if (rN == 1) {
            System.out.println("cp choose paper... \n");
            return "paper";
        } else {
            System.out.println("cp choose scissors... \n");
            return "scissors";
        }
    }
}
