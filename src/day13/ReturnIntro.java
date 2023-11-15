package day13;

public class ReturnIntro {
    public static void main(String[] args) {

  // int s1 = sum(20,49);  ================ sum is a void method, thats why error

        System.out.println(square(5));
        System.out.println(cube(7));


    }
/*
    public static void sum ( int n1, int n2 ) {

        int result = n1 + n2 ;
*/


    public static int sum ( int n1, int n2 ) {

        int result = n1 + n2 ;

        return result;
    }

    public static int square (int num) {

        int square = num * num;
        return square ;

    }


    public static int cube (int num ) {

        int cube = square(num) * num ;       // num * num * num ;
        return cube ;

    }

}
