package day26;

public class Constructor2 {

    public Constructor2(){
        System.out.println("Default");
    }

    public Constructor2(int a){
    this();
        System.out.println("Int");
    }

    public Constructor2(String b){
    this(34);
        System.out.println("String");
    }

    public static void main(String[] args) {


        Constructor2 obj1 = new Constructor2();

        System.out.println(obj1);

        System.out.println("====================================");

        Constructor2 obj2 = new Constructor2(34);

        System.out.println(obj2);

        System.out.println("====================================");

        Constructor2 obj3 = new Constructor2("Java");

        System.out.println(obj3);




    }

}
