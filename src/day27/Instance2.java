package day27;

public class Instance2 {

    public String name;
    public int age;
/*
    {
        name="Gay";
        age=15;
    }
*/

    public Instance2(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {

        Instance2 obj1 = new Instance2("Asi",12);
        Instance2 obj2 = new Instance2("Ase",45);


        System.out.println(obj1.name);
        System.out.println(obj2);
    }


}
