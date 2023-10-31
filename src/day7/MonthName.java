package day7;

public class MonthName {
    public static void main(String[] args) {
     /*
     1. Create a class named MonthName.java
2. An integer variable named number is declared and given, Write a
program that can print the name of the month that the number
represents. (only if the given number is a valid number, then print the
name of the month. Otherwise print Invalid)
Ex:
Given:
number = 10
output:
October
      */

       int number = 11;

       if (number >=1 && number<=12){

           if (number==1){
               System.out.println("January");
           }
           if (number==2){
               System.out.println("Fabruary");
           }
           if (number==3){
               System.out.println("March");
           }
           if (number==4){
               System.out.println("April");
           }
           if (number==5){
               System.out.println("May");
           }
           if (number==6){
               System.out.println("June");
           }
           if (number==7){
               System.out.println("July");
           }
           if (number==8){
               System.out.println("August");

           }if (number==9){
               System.out.println("September");

           }if (number==10){
               System.out.println("October");

           }if (number==11){
               System.out.println("November");

           }
           if (number==12){
               System.out.println("December");
               
           }
       }else{
           System.out.println("Invalid Month");
       }







    }
}
