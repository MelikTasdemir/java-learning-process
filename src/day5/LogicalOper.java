package day5;

public class LogicalOper {
    public static void main(String[] args) {

double salary =  60000;
int creditScore = 650;

boolean eligibleLoan = salary >= 30000 && creditScore >= 650;
        System.out.println(eligibleLoan);

        System.out.println("---------------------------------");

        double salaryy =  90000;
        int creditScoree = 500;

        boolean eligibleLoann = salaryy >= 30000 && creditScoree >= 650;
        System.out.println(eligibleLoann);
        System.out.println("---------------------------------");

        int age = 28;
        String country = "USA";
        boolean eligible = age>=18 && country =="USA";

        System.out.println(eligible);

        System.out.println("---------------------------------");

String answer = "maybe";
boolean validAnswer = answer== "yes" || answer== "no";
        System.out.println(validAnswer);
        System.out.println("---------------------------------");

        String answerr = "yes";
        boolean validAnswerr = answerr== "yes" || answerr== "no";
        System.out.println(validAnswerr);
        System.out.println("---------------------------------");

        char grade = 'B';
        boolean passed = grade == 'A' || grade == 'B'|| grade == 'C'|| grade == 'D';

        System.out.println(passed);
        System.out.println("++++++++++++++++++++++++++++++++++++++++");

            System.out.println(true);
            System.out.println(!true);

            String a = "yes";
            boolean yes = a == "yes";
            boolean no = !yes;

            System.out.println(yes);
            System.out.println(no);







    }
}
