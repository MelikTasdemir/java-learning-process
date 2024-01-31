package day27;

public class InstanceBlock {

    {
        System.out.println("Whattf");
    }


    public InstanceBlock(){
        System.out.println("Cons are better");
    }


    public static void main(String[] args) {

    new InstanceBlock();
    new InstanceBlock();












    }
}
