package day10;

import java.util.Scanner;

public class StringMethod1 {
    public static void main(String[] args) {

String str = "Cydeo" ;
// index   =  01234

        char f1 = str.charAt(0) ;
        char f2 = str.charAt(1) ;
        char f3 = str.charAt(2) ;
        char f4 = str.charAt(3) ;
        char f5 = str.charAt(4) ;

        System.out.println("f1 = " + f1);
        System.out.println("f2 = " + f2);
        System.out.println("f3 = " + f3);
        System.out.println("f4 = " + f4);
        System.out.println("f5 = " + f5);

   /*
        char f6 = str.charAt(5) ;

        System.out.println("f6 = " + f6);
*/
        System.out.println("====================================");

        String  sentence = "Java Programming Language" ;

        int lenght = sentence.length() ;

        System.out.println(lenght);

        int lasIndex = lenght - 1 ;

        System.out.println(lasIndex);

        System.out.println("++++========================================++++++");

        String s1 = "Wooden Spoon" ;

char e1 = s1.charAt(0) ;
int lastIndex = s1.length() - 1 ;

char e2 = s1.charAt(lastIndex) ;


        System.out.println("e1 = " + e1);
        System.out.println("lastIndex = " + lastIndex);
        System.out.println("e2 = " + e2);

        System.out.println("++++========================================++++++");

        String n1 = "Umran";
        String n2 = new String("Umran") ;


        System.out.println( n1 == n2);
        System.out.println( n1.equals(n2) );

        System.out.println("++++========================================++++++");

        Scanner input = new Scanner(System.in) ;

        System.out.println("How old are you?");
        int age = input.nextInt() ;

        System.out.println("Are you US citizen? yes/no ");
        String us = input.next();

      if(age >= 21 && us.equals("yes") ) {

          System.out.println("Eligible to vote");

      } else {

          System.out.println("Not eligible to vote");


      }

      input.close();

    }
}
