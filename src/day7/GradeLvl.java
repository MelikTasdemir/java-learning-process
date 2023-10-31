package day7;

public class GradeLvl {
    public static void main(String[] args) {

        /*
         Create a class called GradeLevel, Given a number(byte) grade level determine and print which school type someone is in.
            grade level and types are:
                    1-5: Elementary school
                    6-8: Middle school
                    9-12: High school
                    13-16: College
                    17-18: Grad School

                    For Any Other grade: Invalid grade level given

            NOTE: MUST USE NESTED IF. DO NOT USE MORE THAN ONE PRINT STATEMENT
         */

   byte gradeLvl = 12;
   String result = "";

   if (gradeLvl <= 5){
       result = "Elementary school";
   } else if (gradeLvl<=8) {
       result = "Middle school";
   } else if (gradeLvl<=12) {
       result = "High school";
   } else if (gradeLvl<=16) {
       result = "Collage";
   } else{
       result = "Grad school";
   }

        System.out.println(result);

    }
}
