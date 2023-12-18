package day20;

import java.util.Arrays;
import utilities.ArrUtilitiy;

public class mergeToArray {
    public static void main(String[] args) {

        int[] arr1 = {1,2,3,4};
        int[] arr2 = {5,6,7};

        int[] arr3 = new int [arr1.length + arr2.length];

        int k = 0;


        for (int i = 0; i < arr1.length; i++, k++) {
            arr3[k] = arr1[i];
        }

        for (int i = 0; i < arr2.length; i++, k++) {
            arr3[k] = arr2[i];
        }


        System.out.println(Arrays.toString(arr3));

        System.out.println("=======================================");

        int[] a1 = {10,20,30,40};
        int[] a2 = {60,70,80};

        int[] a3= ArrUtilitiy.merge(a1,a2);

        System.out.println(Arrays.toString(a3));


        System.out.println("=======================================");

        double [] b1 = {10.5,20.6,23.5};
        double [] b2 = {50.5,60.8};

        double[] b3= ArrUtilitiy.merge(b1,b2);


        System.out.println(Arrays.toString(b3));

        System.out.println("=======================================");

        char[] ch1 = {'a','B','c'};
        char[] ch2 = {'X','y'};

        char[] ch3 = ArrUtilitiy.merge(ch1,ch2);

        System.out.println(Arrays.toString(ch3));






    }
}

/*
write a program that can merge two arrays of integers
	        Ex:
	            arr1 = {1,2,3,4}
	            arr2 = {5,6}

	        output
	            arr3 = {1,2,3,4,5,6}
 */