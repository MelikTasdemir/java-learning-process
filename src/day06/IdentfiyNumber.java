package day06;

public class IdentfiyNumber {
    public static void main(String[] args) {

    /*
    2. Create a class named IdentifyNumber, and write a program that can identify if the given number is positive, or negative or zero.

			Ex:
				number = 200

			output:
		        200 is positive number: true
		        200 is negative number: false
		        200 is zero: false
     */

int number = 100;
boolean isPositive = number>0;
boolean isNegative = number<0;
//boolean isZero = number==0;
boolean isZero = !isNegative && !isPositive;

        System.out.println(number + " is positive a number: " + isPositive);
        System.out.println(number + " is negative a number: " + isNegative);
        System.out.println(number + " is zero: " + isZero);




    }
}
