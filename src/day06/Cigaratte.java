package day06;

public class Cigaratte {
    public static void main(String[] args) {
/*
1. Create a class named Cigarettes.java
2. A variable named age is declared and given, Write a program that
can check if the person is eligible to buy cigarettes
Ex:
age = 20
output:
You are not eligible to buy Cigarettes
 */
  int age = 18;

  if(age >= 21 && age <=100){
      System.out.println("You are eligible to buy cigarette");
  }

        if(age < 21 || age > 100){
            System.out.println("You are not eligible to buy cigarette");
        }








    }
}
