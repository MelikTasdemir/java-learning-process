package day09;

import java.util.Scanner;

public class NextLinePract {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your full name: ");
        String full_name = input.nextLine();

        System.out.println("School name: ");
        String school_name = input.nextLine();

        System.out.println("Gender: ");
        String gender = input.next();

        System.out.println("Age: ");
        int age = input.nextInt();

        input.nextLine();
        System.out.println("Street Name: ");
        String street = input.nextLine();





    }
}
