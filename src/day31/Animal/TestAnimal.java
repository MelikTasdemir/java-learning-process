package day31.Animal;

public class TestAnimal {
    public static void main(String[] args) {

        Cat cat1 = new Cat("Emily","Bangle",'M',23,"Small","Blue");

        Dog dog1 = new Dog("Max","Husky",'F',34,"Medium","Yellow");

        Lion lion1 = new Lion("Simba","African",'M',23,"Big","Pink",true);

        Eagle eagle1 =new Eagle("Bella","American",'F',34,"Big","Purple");

        System.out.println(cat1);
        System.out.println(dog1);
        System.out.println(lion1);
        System.out.println(eagle1);

        System.out.println("---------------------------------------------------------------------");

        cat1.eat();
        dog1.eat();
        lion1.eat();
        eagle1.eat();

        System.out.println("---------------------------------------------------------------------");


        cat1.sleep();
        dog1.sleep();
        lion1.sleep();
        eagle1.sleep();





    }
}
