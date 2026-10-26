package org.practice;

import java.io.PrintWriter;

public class Compiler {
    public static void main(String[] args) throws  Exception  {
        PrintWriter  printWriter = new PrintWriter("abc.txt");
        printWriter.println("Hi");
    }
}
