package day06;

public class GradeLvl2 {
    public static void main(String[] args) {

            int grade = 2;

            String Result = "";

            if(grade>=1 && grade<=5){
                Result ="Elementary school";
            }
            if(grade>=6 && grade<=8){
                Result ="Middle school";
            }
            if(grade>=9 && grade<=12){
                Result ="High school";
            }
            if(grade>=13 && grade<=16){
                Result ="College school";
            }
            if(grade>=17 && grade<=18){
                Result ="Grad School school";
            }
        System.out.println(Result);





        }


    }