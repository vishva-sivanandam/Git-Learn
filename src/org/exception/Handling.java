package org.exception;

public class Handling {
    public static void main(String[] args) {
        System.out.println("Statement-1");
        try{
            System.out.println(10/0);
            System.out.println("Hi is the Next ");
        } catch (Exception e) {
            System.out.println(10/2);
        }
        System.out.println("Last");
    }
}
