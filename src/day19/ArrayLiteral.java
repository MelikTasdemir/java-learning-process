package day19;

import java.util.Arrays;

public class ArrayLiteral {
    public static void main(String[] args) {


int[] score = new int[5];

int[] scores = {50,60,70,80,90};  //Array literal


        System.out.println(score.length);
        System.out.println(scores.length);

        System.out.println("Score = " + Arrays.toString(score));
        System.out.println("Scores= " + Arrays.toString(scores));

        System.out.println("=================================================");

        // elements           1.        2.          3.          4.          5.        6.          7.
        String [] days = {"Monday", "Tuesday", "Wednesday","Thursday", "Friday", "Saturday", "Sunday"} ;
       // indexs             0          1           2           3         4          5           6
        int n= 1;

        System.out.println(days[n-1]);
        System.out.println(days[n+4]);

        System.out.println("=================================================");

String[] month = {"Jan", "Feb", "March", "Apr", "May", "June", "July", "Aug", "Sep", "Oct", "Now", "Dec"};

        System.out.println("month = " + Arrays.toString(month));

            System.out.println("=================================================");

            for (int i = month.length -1 ; i >= 0; i--) {
                    System.out.println(month[i]);
            }
            
            
            
            
            
            
            
            
            












    }
}
