package day13;

public class ReturnPractice {
    public static void main(String[] args) {

        System.out.println(isOdd(200));

        int num = 301 ;
                if( isEven(num)){
                    System.out.println( num + " is even number." );
                } else {
                    System.out.println( num + " is odd number." );
                }

    }

    public static boolean isOdd( int num) {

        return ( num %2 != 0)? true : false ;

    }
    public static boolean isEven ( int num) {
        return ! isOdd(num) ;
    }
}
