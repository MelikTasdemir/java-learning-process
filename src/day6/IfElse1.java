package day6;

public class IfElse1 {
    public static void main(String[] args) {

        int age = 18;

        if (age >= 21) {
            System.out.println("Eligible");
        }

        if (age <= 21) {
            System.out.println("Not Eligible");
        }

        System.out.println("============================");

        if (age >= 21) {
            System.out.println("Eligible");
        } else {
            System.out.println("Not Eligible");
        }
    }
}

