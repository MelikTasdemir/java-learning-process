package day19Array;

public class MaxNum {
    public static void main(String[] args) {



        int [] numbers = {100,-200,-23,34,56};

        int min = numbers[0];

        for (int i = 0; i < numbers.length; i++) {

            if(numbers[i] < min) {
                min = numbers[i];
            }
        }
        System.out.println(min);









    }
}
