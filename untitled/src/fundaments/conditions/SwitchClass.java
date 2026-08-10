package fundaments.conditions;

import java.util.Scanner;

public class SwitchClass {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Name : ");
        String name = sc.nextLine();
        switch (name) {
            case "Kamal":
                System.out.println("This is Fake");
                break;

            case "Vishva":
                System.out.println("This is Original");
                break;
        }
    }
}
