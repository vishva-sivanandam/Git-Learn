package org.student;

public class Stack {
    void dostuff(){
        doMoreStuff();
    }
    void doMoreStuff(){
     doMore();// After This Method will be Executed Print 10/0
        System.out.println(10/0);//
    }
    void doMore(){
        System.out.println("Hi");
    }
    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.dostuff();
    }
}
