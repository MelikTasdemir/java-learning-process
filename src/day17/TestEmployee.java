package day17;

public class TestEmployee {

    public static void main(String[] args) {

        Employee emp1 = new Employee() ;
        emp1.setInfo("Melik",30, 'M' , "Boss", 4000,"1050");

        Employee emp2 = new Employee() ;
        emp2.setInfo("Haci", 34 , 'F' , "Noop" , 3000, "A1050");


        System.out.println(emp1);
        System.out.println(emp2);


        emp1.work();
    }

}
