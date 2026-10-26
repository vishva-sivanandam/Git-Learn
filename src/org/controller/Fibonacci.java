package org.controller;

public class Fibonacci {
    public static void main(String[] args) {

        int first = 0;
        int second = 1;

        while (first <= 100) {

            System.out.print(first + " ");

            int next = first + second;

            first = second;
            second = next;
        }
    }
}
