package day16;

import java.util.Scanner;

public class WarmUpLogin {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in) ;

        System.out.println("Enter your name: ");
        String n = input.next();

        System.out.println("Enter your password: ");
        String p = input.next();

if( n.equals("Cydeo") && p.equals("WoodenSpoon") ) {
    System.out.println("Logged in");
} else {

    for (int i = 0; i < 3; i++) {
        System.err.println("Incorrect name or password, Please re-enter :");
        System.out.println("Enter your name: ");
        n = input.next();

        System.out.println("Please enter your password: ");
        p = input.next();

        if (n.equals("Cydeo") && p.equals("WoodenSpoon") ) {
            System.out.println("You are logged in");

        } else if (i == 2) {
            System.out.println("You have entered so many wrong entries,Please re-try after 24 hour: ");
           break;
        }


    }


}

input.close();

    }
}
