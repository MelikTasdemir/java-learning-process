package day11;

public class StringMethod3 {
    public static void main(String[] args) {


String word = "Java" ;
boolean r1 = word.isEmpty();

        String word2 = "" ;
        boolean r2 = word2.isEmpty();

        System.out.println(r1);
        System.out.println(r2);

        System.out.println("==============================================");


String d1 = "               " ;
boolean e1 = d1.isEmpty() ;
boolean e2= d1.isBlank() ;

        System.out.println(e1);
        System.out.println(e2);


        System.out.println("+++++==============================================+++++");

String t1 = "Cydeo" ;

String t2 = new String("Cydeo") ;

        System.out.println( t1 == t2 );
        System.out.println(t1.equals(t2));

            System.out.println("-----==============================================------");

String h1 = "Rank" ;
String h2 = "rank" ;

            System.out.println(h1.equalsIgnoreCase(h2));

            System.out.println(h1.equals(h2));

            System.out.println("+++++==============================================+++++");

String names = "Ali Veli Isa Kim" ;
boolean hasAhmet = names.contains("Ahmet") ;

boolean hasAli = names.contains("Ali") ;

boolean veli = names.toLowerCase().contains("veli") ;


            System.out.println(hasAhmet);
            System.out.println(hasAli);
            System.out.println(veli);

            System.out.println("-----==============================================------");


     String url = "www.cydeo.com" ;

     boolean valid = url.startsWith("www.") ;

            System.out.println(valid);

boolean valid2 = url.endsWith(".com") ;

            System.out.println(valid2);








    }
}
