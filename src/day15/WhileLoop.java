package day15;

import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your age:");
        int age = input.nextInt();

        while (! (age >= 1 && age < 150) ) {
            System.out.println("Enter a Valid Age");
            age = input.nextInt();
        }


        if( age > 21) {
            System.out.println("Eligible");
        } else {
            System.out.println("Not eligible");
        }

    }
}
