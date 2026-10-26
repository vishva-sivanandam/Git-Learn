package org.student;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class StudentAFID {
    public static void main(String[] args) {
        Map<String, String> students = new HashMap<>();
        students.put("AFID101", "Vishva");
        students.put("AFID102", "Arun");
        students.put("AFID103", "Karthik");
        students.put("AFID104", "Rahul");
        students.put("AFID105", "Sanjay");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter AFID Code: ");
        String afidCode = sc.nextLine();
        if (students.containsKey(afidCode)) {
            String studentName = students.get(afidCode);
            System.out.println("Student Name: " + studentName);
        } else {
            System.out.println("Data is not exist with us.");
        }
        sc.close();
    }
}
