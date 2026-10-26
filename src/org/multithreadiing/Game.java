package org.multithreadiing;

import java.util.*;
public class Game {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        String[] choices = {"rock", "paper", "scissor"};

        String system = choices[r.nextInt(3)];

        Thread t = new Thread(() -> {
            try {
                Thread.sleep(5000);
                System.out.println("\nSystem Wins!");
                System.exit(0);
            } catch (Exception e) {
            }
        });
        t.start();

        System.out.print("Enter rock, paper or scissor: ");
        String user = sc.nextLine();

        t.interrupt();

        System.out.println("System: " + system);
        System.out.println("User: " + user);

        if (system.equals(user)) {
            System.out.println("Draw");
        }
        else if (
                (user.equals("rock") && system.equals("scissor")) ||
                        (user.equals("paper") && system.equals("rock")) ||
                        (user.equals("scissor") && system.equals("paper"))
        ) {
            System.out.println("User takes the Glory!");
        }
        else {
            System.out.println("System Wins!");
        }

        sc.close();
    }
}
