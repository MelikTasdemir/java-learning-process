package day06;

public class OddOrEven {
    public static void main(String[] args) {
        /*
        Package name: day06_ifStatements

Warmup task:
	1. Create a class named OddOrEven, and write a program that can identify if the given number is odd or even
			Ex:
				number = 20

			output:
				20 is an even number: true
				20 is an odd number: false

		Hint: even numbers are the numbers that are evenly divisible by 2 (remainder is zero)
         */


int number = 45;

boolean isEven = number %2 == 0;

boolean isOdd = number %2 != 0;
boolean Isodd = !isEven;

        System.out.println(number + " is an even number: " + isEven);
        System.out.println(number + " is an odd number: " + Isodd);





    }
}
