package day20;

import java.util.Arrays;

public class ForEachPrac {
    public static void main(String[] args) {

int [] num = {1,2,3,4,5,6,7,8,9,10,11};

for(int each : num){
    if(each%2 !=0){
        System.out.println(each);
    }
}

        System.out.println("----------------------------------------");

        int [] num2 = {100,34,454,67,8,-67,-66,};

        int max=num[0];
        int min=num[0];

        for (int each : num2) {
            if(each>max){
                max=each;
            }
            if(each<min){
                min=each;
            }
        }
        System.out.println("max = " + max);
        System.out.println("min = " + min);

        System.out.println("----------------------------------------");

        int[] a1 = {10,20,30,40,50};
        int[] a2 = {60,70,80,90,100,110};

        int[] a3 = new int[a1.length +a2.length];

        int k = 0;

        for (int each : a1) {
            a3[k++] =each;
        }
        for (int each : a2) {
            a3[k++] =each;
        }

        System.out.println(Arrays.toString(a3));

        System.out.println("----------------------------------------");

        String [] name = {"Ali Pot","Veli Top","Deli Kot","Selin Ok"};

        for (String each : name) {
            System.out.println(each.charAt(0) + "." + each.charAt(each.lastIndexOf(" ")+1));

        }









    }
}
