package day11;

import java.util.Scanner;

public class Login {
    public static void main(String[] args) {

/*
2. Create a class named LogIn
			2.1 Ask the user to enter the username & password
			2.2 print "You are now logged in" If user entered valid username and password
				otherwise print the error message "Incorrect username or password. Please try again"

			Note: Assume that the valid credentials are:
						username: Cydeo
						password: WoodenSpoon
 */

        String correctName = "Cydeo",
                correctPass = "WoodenSpoon";

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your user name:");
        String name = input.nextLine();

        System.out.println("Enter your password:");
        String pass = input.nextLine();

        input.close();


        if ( name.equals(correctName) && pass.equals(correctPass) ) {
            System.out.println("You are now logged in");
        } else {
            System.out.println("Incorrect username or password. Please try again");

        }
    }
}