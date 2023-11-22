package day15;

import java.util.Scanner;

public class WhileEligible {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in) ;
        System.out.println("Enter your age:");
        int age = input.nextInt();




        while (! ( age >= 1 && age < 150)) {
            System.err.println("Enter a valid age:");
            age = input.nextInt();
        }
        System.out.println("Eligible");


        System.out.println("Are you Usa citizen?");
String yesOrno = input.next().toLowerCase() ;

while (! ( yesOrno.equals("yes") || yesOrno.equals("no") )) {
    System.err.println("Invalid entry, Please re-enter:");
    yesOrno = input.next().toLowerCase();
        }
if (yesOrno == "yes") {
    System.out.println("Eligible");
} else {
    System.out.println("Not Eligible");
}


    }
}
