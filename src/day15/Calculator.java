package day15;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in) ;

        System.out.println("Enter first number:");
        double num1 = input.nextDouble() ;
        System.out.println("Enter second number:");
        double num2 = input.nextDouble();

        System.out.println("Enter a operator: ");
        char opp = input.next().charAt(0) ;


        while (! (opp == '+' || opp == '-' || opp == '*' || opp == '/')) {
            System.err.println("Invalid operator!!! Please re-enter an operator:");
            opp = input.next().charAt(0) ;
        }

        if (opp == '=') {
            System.out.println((int) ( num1 + num2 ) );
        } else if (opp == '-') {
            System.out.println((int) ( num1 - num2 ) );
        } else if (opp == '*') {
            System.out.println((int) ( num1 * num2 ) );
        } else {
            System.out.println((int)( num1 / num2) );
        }

    }
}
