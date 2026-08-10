package org.example;

public class Format {
    public static void main(String[] args) {
        DataFormat dataFormat =new DataFormat();
        dataFormat.setAge(21);
        dataFormat.setName("Vishva");
        dataFormat.setRollNo(4);
        System.out.println(dataFormat.getAge());
        System.out.println(dataFormat.getName());
        System.out.println(dataFormat.getRollNo());
    }

}
