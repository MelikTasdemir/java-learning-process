package day20;

import utilities.ArrUtilitiy;

import java.util.Arrays;

public class StringMethods {
    public static void main(String[] args) {

        String str = "Cydeo School";
        char[] sc1 = str.toCharArray();

        System.out.println(Arrays.toString(sc1));

        char[] sc2 = str.replace(" ","").toCharArray();
        System.out.println();

        System.out.println(Arrays.toString(sc2));

        System.out.println("---------------------------------------");

        String str2 = "Today is a great day to learn java";

        String[] word = str2.split(" ");
        System.out.println(Arrays.toString(word));

        System.out.println("---------------------------------------");

        String sentence = "I love Java";

       String[]arr = ArrUtilitiy.reverse(sentence.split(" "));

        System.out.println(Arrays.toString(arr));

        String rvrs = "";

        for (int i = 0; i < arr.length; i++) {
            rvrs += arr[i] + " ";
        }

        System.out.println(rvrs);













    }
}
