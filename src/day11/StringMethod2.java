package day11;

public class StringMethod2 {
    public static void main(String[] args) {

String sent = "I love Phyton, Phyton is the best programming language, and Phyton is in high demand" ;

String sent2 = sent.replace("Phyton", "Java") ;

        System.out.println(sent2);

        System.out.println("============================================");

String sent3 = "Java" ;

sent3 = sent3.replace("a","e");

        System.out.println(sent3);

        System.out.println("============================================");

      String d1 = "I love Java, Java is cool" ;

      d1= d1.replaceFirst("Java","Phyton");


        System.out.println(d1);

        System.out.println("============================================");

String b1 = "I love Java Programing";

String b2 = b1.substring( 7 , 11 ) ;

        System.out.println(b2);

        System.out.println("============================================");

String g1 = "mlktasdemir@gmail.com" ;

int gg = g1.indexOf('@') + 1 ;
int ggwp = g1.lastIndexOf('.');

String ez = g1.substring(gg,ggwp) ;
        System.out.println(ez);

        System.out.println("============================================");

String ssd = "Phyton    " ;

String result = (ssd +"\n").repeat(10) ;

        System.out.println(result);

        System.out.println("============================================");





    }
}
