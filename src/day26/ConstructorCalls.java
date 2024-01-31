package day26;

public class ConstructorCalls {

    public ConstructorCalls(){
        // this();
        System.out.println("Default Constructor");
    }

    public ConstructorCalls(int a){

        this();

        System.out.println("Argument");

    }

    public ConstructorCalls(double b){

        System.out.println("No argument");
    }

    public ConstructorCalls(String d){
    this();
   // this(2.5);
        System.out.println("Noop argument");

    }









    public static void main(String[] args) {

method1();
        System.out.println("--------------------------------------");

method2();

    }
    public static void method1(){
        System.out.println("Method 1");
    }
public static void  method2(){
        method1();
    System.out.println("Method 2");
}

















}
