package day33;

public class TestEmployee {
    public static void main(String[] args) {

        Teacher employee1 = new Teacher("Daniel", 34, 'M', "11A", "Sdet", 12.500);

        Developer employee2 = new Developer("Asi",23,'F',"A22","Dev",11.400);






        System.out.println(employee1);
        System.out.println(employee2);

        Teacher.work();

    }
}
