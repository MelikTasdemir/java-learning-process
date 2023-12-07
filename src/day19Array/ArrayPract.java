package day19Array;

import java.util.Arrays;

public class ArrayPract {
    public static void main(String[] args) {

int [] ary1 = new int[100] ;


        for (int i = 0, j= 1; i < ary1.length; i++ , j++) {
            ary1[i] = j;
        }

        System.out.println("ary1 = " + Arrays.toString(ary1));

        System.out.println("========================================================");


        int [] ary2 = new int[100] ;


        for (int i = ary2.length-1 , k = 1; i >= 0; i--, k++) {
            ary2[i] = k;
        }

        System.out.println("ary2 = " + Arrays.toString(ary2));





        
    }
}
