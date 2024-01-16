package day06;

public class SingleIfStatament {
    public static void main(String[] args) {

int number = 101;
boolean isEven = number % 2 == 0;

if (isEven){
    System.out.println(number + " is even number.");
}

        if (!isEven){
            System.out.println(number + " is odd number.");
        }

        System.out.println("===================================");

if(number %2 == 0){
    System.out.println(number + " is even number.");
}

        if(number %2 != 0){
            System.out.println(number + " is odd number.");
        }





    }
}
