package day18;

public class PizzaTest {
    public static void main(String[] args) {


        Pizza piz1 = new Pizza();
        piz1.size = 'M';


        Pizza piz2 = new Pizza();
        piz2.size = 'M';



        Pizza piz3 = new Pizza();
        piz3.setInfo('m',2,4);


        System.out.println(piz3);
        System.out.println(piz1);
        System.out.println(piz2);


        System.out.println("=================================================================");

        double total = 0;

        for (int i = 0; i < 20; i++) {

            Pizza small = new Pizza();
            small.setInfo('s',3,4);
total += small.Cost();

            Pizza medium = new Pizza();
            medium.setInfo('m',1,5);
total += medium.Cost();

            Pizza large = new Pizza();
            large.setInfo('L',3,3);
total += large.Cost();
        }

        System.out.println(total);






    }
}
