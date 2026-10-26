package org.student;

public class Soft {
    public static void main(String[] args) {
        try {
            System.out.println("Hi");
            System.out.println(10/0);
        }
        catch (Exception e){
            System.out.println(e);
        }
        System.out.println("Program ----End");
    }
}
