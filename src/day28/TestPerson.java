package day28;

public class TestPerson {
    public static void main(String[] args) {

        Person person1 = new Person("Ali");
        Person person2 = new Person("Ahmet",'M');
        Person person3 = new Person("Veli",23);
        Person person4 = new Person("Bahtiyar","English");
        Person person5 = new Person("Hami",22,'M');
        Person person6 = new Person("Nur",31,'F',"German");

        person4.name= "Baho";

        System.out.println(person1);
        System.out.println(person2);
        System.out.println(person3);
        System.out.println(person4);
        System.out.println(person5);
        System.out.println(person6);


        Person.printPlanetName();
        person2.eat("Kek");
        person4.drink("Cola");









    }
}
