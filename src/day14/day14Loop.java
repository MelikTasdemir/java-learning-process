package day14;

import java.util.Scanner;

public class day14Loop {
    public static void main(String[] args) {

        String str3 = combine("onE", "eight");
        System.out.println(str3);



        System.out.println(sumOf4(10,20,30,40));
    }

    public static String combine(String str1, String str2) {

        String result;

        if (str1.charAt(str1.length() - 1) == str2.charAt(0)) {
            result = str1 + str2.substring(1);
        } else {
            result = str1 + str2;
        }

/*
if ( str1.endsWith( "" + str2.charAt(0) ) ) {

    result = str1 + str2.substring(1);

} else {
    result = str1 + str2 ;
}
*/

        return result;

    }


    public static int sumOf2 ( int n1 , int n2) {

        return n1 + n2 ;
    }

    public static int sumOf3 ( int n1 , int n2 , int n3 ) {
        return sumOf2( n1 , n2 ) + n3 ;

    }

    public static int sumOf4 ( int n1 , int n2 , int n3 , int n4 ) {
        return sumOf3(n1,n2,n3) + n4 ;
    }

  /*  public static int sum(int num1, int num2, int num3, int num4, int num5) {

        int sum5;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter first number");
        int n1 = input.nextInt();

        System.out.println("Enter second number");
        int n2 = input.nextInt();

        System.out.println("Enter third number");
        int n3 = input.nextInt();

        System.out.println("Enter fourth number");
        int n4 = input.nextInt();

        input.close() ;
        */



    }




/*
Warmup Tasks:
	Task1:
	    Create a method named combine that can take two string and hen add them together and returns it.
        	But if the last letter of the first word and the first letter of the last letter are the same, return that character once.

	        combine("one", "eight")  ==> oneight

	Task 2:
	    1. create a method that can find the sum of two integer numbers
	                method name: sumOf2Numbers

	    2. create a method that can find the sum of three integer numbers
	                method name: sumOf3Numbers

	    3. create a method that can find the sum of four integer numbers
	                method name: sumOf4Numbers
 */