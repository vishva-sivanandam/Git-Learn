package org.computer;

import java.util.Scanner;

public class TokenMethod {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter The Id:");
        int i = scanner.nextInt();
        scanner.nextLine(); // Consume the remaining newline

        System.out.println("Enter The Name:");
        String s = scanner.nextLine();

        System.out.println(i);
        System.out.println(s);

    }
}
