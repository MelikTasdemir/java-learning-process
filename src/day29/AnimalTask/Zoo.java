package day29.AnimalTask;

public class Zoo {
    public static void main(String[] args) {

        Dog dog1 = new Dog();
        System.out.println(dog1);
        dog1.setInfo("Lol","Kangal",'M',34,"Medium","Blue");
        System.out.println(dog1);



        Cat cat1 = new Cat();
        System.out.println(cat1);
        cat1.setInfo("Lul","Angal",'F',4,"Small","Purple");
        System.out.println(cat1);



        Tiger tiger1 = new Tiger();
        System.out.println(tiger1);
        tiger1.setInfo("Hooll","Bengal",'M',3,"Large","Yellow");
        System.out.println(tiger1);

        System.out.println("====================================================================");

        dog1.eat();
        dog1.sleep();
        dog1.drink();

        cat1.meow();
        cat1.eat();
        cat1.drink();

        tiger1.eat();
        tiger1.drink();
        tiger1.hunt();








    }
}
