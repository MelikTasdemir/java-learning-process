package day30;

public class TestPhoneObj {
    public static void main(String[] args) {


        Iphone iphone1 = new Iphone("Iphone12", "Large",200,"Black");

        Samsung samsung1 = new Samsung("A30","Medium",300.5,"Gold");

        Nokia nokia1 = new Nokia("Brick","Small",250,"White");

        System.out.println(iphone1);
        System.out.println(samsung1);
        System.out.println(nokia1);

        iphone1.call(911);
        samsung1.call(333);
        nokia1.call(211);

        iphone1.text(343232666);
        samsung1.text(34345464);
        nokia1.text(345346345);

        iphone1.faceTime(787);
        samsung1.freeze();
        nokia1.selfDefense();




    }
}
