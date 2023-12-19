package day21;

import day16.FrequSnt;

import java.util.Arrays;

public class RemoveSpaces {
    public static void main(String[] args) {

     String   str = "  Hello world      I      love      Java  ";

     str= str.trim();

        System.out.println(str);

String[] words = str.split(" ");

        System.out.println(Arrays.toString(words));

        String result = "";
for (String each:words){
    if(!each.isEmpty()){
        result+= each + " ";
    }
}
result= result.trim();
        System.out.println(result);






    }
}
/*
1. Write a program that can remove all the extra space from string
			Ex:
				str = "  Hello world      I      love      Java    "

        	Output:
        		Hello world I love Java
 */