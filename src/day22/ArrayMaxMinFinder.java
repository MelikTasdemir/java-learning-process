package day22;

import java.util.Arrays;

public class ArrayMaxMinFinder {
    public static void main(String[] args) {


        int[][] array = {{100, 20, 300}, {10, 1000, 50}, {-200, 400, 0}};

        int min = array[0][0];
        int max = array[0][0];

        for (int[] arr1D : array) {
            for (int element : arr1D) {
                if (element < min) {
                    min = element;
                }
                if (element > max) {
                    max = element;
                }
            }

        }
        System.out.println("Minimum number is:" + min);
        System.out.println("Max number is:" + max);
    }
}
/*
 Write a program that can find the minimum and maximum numbers from a two dimensional array of integers
		Ex:
			array = { {100, 20, 300}, {10, 1000, 50}, {-200, 400, 0} };

			output:
				Minimum number is: -200
				Maximum number is: 1000
 */