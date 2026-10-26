package org.practice;

public class Dummy {
    void image(){
        System.out.println("This is Process of the Dummy");
    }
    public int image(int a , int b){
        int c = a+b;
        return c;
    }

    public class Like extends Dummy{
    public void image(){
         System.out.println("This is Like Class Image");
     }
    }


    public static void main(String[] args) {
        Dummy dummy  =  new Dummy();
        System.out.println(dummy.image(2,3)); ;
    }


    }

