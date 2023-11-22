package day15;

public class RemoveDuplicate {
    public static void main(String[] args) {

        String str = "aaabbcccccdd" ;
        String result = "" ;

        for (int i = 0; i < str.length() ; i++) {
        char each = str.charAt(i) ;

        if( !result.contains("" + each) ) {
            result += each ;
        }


        }
        System.out.println(result);







    }
}
