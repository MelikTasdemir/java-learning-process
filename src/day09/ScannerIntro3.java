package day09;

import java.util.Scanner;

public class ScannerIntro3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a character");
        char ch = input.next().charAt(0);


        System.out.println("Would you like to continue???");
        String answer= input.next();


        System.out.println("Would you like to continue?");
        String answer2 = input.nextLine();


        System.out.println("You have entered " + answer);
        System.out.println("You entered " + answer2);

        input.close();
    }
}
