package day6;

public class OperatorPresedence {
    public static void main(String[] args) {

        System.out.println(5+2*3);

        System.out.println(7+3-2/2);

        System.out.println(-5 + 3);

        System.out.println(10>9 == 8<7 && "Java" == "Phyton" || 'a' == 'A');
//                              false  &&        false       ||   false
         //                             false                ||    false
          //                                              false

int a = 20;

a /= 10 + 2*3 ;
        System.out.println(a);

    }
}
