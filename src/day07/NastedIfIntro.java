package day07;

public class NastedIfIntro {
    public static void main(String[] args) {

        int score = 87;

        if (score >= 0 && score <= 100) {
            if (score >= 60) {
                System.out.println("Passed");
            } else {
                System.out.println("Failed");
            }
        }
        System.out.println("=============================================");

        int age = 32;

        if (age >= 1 && age <= 150) {


            if (age >= 21) {
                System.out.println("Eligible");
            } else {
                System.out.println("Not eligible");
            }

        } else {
            System.out.println("Invalid Age");
        }


    }
}
