package utilities;

import java.util.Arrays;

public class ArrUtilitiy {

    public static int[] merge(int[] arr1, int[] arr2) {

        int[] arr3 = new int[arr1.length + arr2.length];

        int k = 0;


        for (int i = 0; i < arr1.length; i++, k++) {
            arr3[k] = arr1[i];
        }

        for (int i = 0; i < arr2.length; i++, k++) {
            arr3[k] = arr2[i];
        }
        return arr3;


    }

    public static double[] merge(double[] arr1, double[] arr2) {

        double[] arr3 = new double[arr1.length + arr2.length];

        int k = 0;


        for (int i = 0; i < arr1.length; i++, k++) {
            arr3[k] = arr1[i];
        }

        for (int i = 0; i < arr2.length; i++, k++) {
            arr3[k] = arr2[i];
        }
        return arr3;
    }


    public static char[] merge(char[] arr1, char[] arr2) {

        char[] arr3 = new char[arr1.length + arr2.length];

        int k = 0;


        for (int i = 0; i < arr1.length; i++, k++) {
            arr3[k] = arr1[i];
        }

        for (int i = 0; i < arr2.length; i++, k++) {
            arr3[k] = arr2[i];
        }
        return arr3;


    }

    public static int[] reverse(int[] array) {

        int[] reverse = new int[array.length];

        for (int i = array.length - 1, k = 0; i >= 0; i--, k++) {

            reverse[k] = array[i];
        }
        return reverse;
    }

    public static double[] reverse(double[] array) {

        double[] reverse = new double[array.length];

        for (int i = array.length - 1, k = 0; i >= 0; i--, k++) {

            reverse[k] = array[i];
        }
        return reverse;
    }

    public static String[] reverse(String[] array) {

        String[] reverse = new String[array.length];

        for (int i = array.length - 1, k = 0; i >= 0; i--, k++) {

            reverse[k] = array[i];
        }
        return reverse;
    }

    public static int[] AddElement(int[] array, int element) {
        int[] newArr = Arrays.copyOf(array, array.length + 1);
        newArr[newArr.length - 1] = element;
        return newArr;
    }

    public static double[] AddElement(double[] array, double element) {
        double[] newArr = Arrays.copyOf(array, array.length + 1);
        newArr[newArr.length - 1] = element;
        return newArr;
    }

    public static String[] AddElement(String[] array, String element) {
        String[] newArr = Arrays.copyOf(array, array.length + 1);
        newArr[newArr.length - 1] = element;
        return newArr;
    }

    public static char[] AddElement(char[] array, char element) {
        char[] newArr = Arrays.copyOf(array, array.length + 1);
        newArr[newArr.length - 1] = element;
        return newArr;
    }

    public static boolean contains(int[] array, int element) {
        for (int each : array) {
            if (each == element) {
                return true;
            }
        }
        return false;
    }

    public static boolean contains(double[] array, double element) {
        for (double each : array) {
            if (each == element) {
                return true;
            }
        }
        return false;
    }

    public static boolean contains(char[] array, char element) {
        for (char each : array) {
            if (each == element) {
                return true;
            }
        }
        return false;
    }

    public static boolean contains(String[] array, String element) {
        for (String each : array) {
            if (each.equals(element)) {
                return true;
            }
        }
        return false;
    }
}