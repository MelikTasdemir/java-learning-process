package day07;

public class LoanApplication {
    public static void main(String[] args) {

/*
package name: day07_ifStatements

Warmup Tasks:
    1. Create a class named LoanApplication. two variables named salary and createdScore are declared and given, write a program that can check if the person is eligible to apply for a loan
            Note:In order to be eligible for a loan:
                    1. salary: at least 45K
                    2. credit score: at least 700
 */

int salary = 55000,
        CreditScore = 680;

/*
if(salary>=45000 && CreditScore >= 700){
    System.out.println("You are eligible for loan");
}else{
    System.out.println("You are not eligible");
}
*/
        String Result = "";
        if(salary>=45000 && CreditScore >= 700){
            Result= "You are eligible for loan";
        }else{
            Result= "You are not eligible";
        }
        System.out.println(Result);

    }
}
