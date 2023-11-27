package day16;

import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        while (true) {

            System.out.println("Enter a number : ");
            int num = input.nextInt();

            if (num % 2 == 0) {
                System.out.println(num + " is even.");
            } else {
                System.out.println(num + " is odd.");
            }

            System.out.println("Another number? Yes/No");
            String answer = input.next().toLowerCase();

            while (!(answer.equals("yes") || answer.equals("no"))) {
                System.err.println("Invalid number, Would you like to enter another? Yes/No");
                answer = input.next().toLowerCase();

            }

            if (answer.equals("no")) {
                break;
            }


        }
    }
}
