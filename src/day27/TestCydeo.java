package day27;

public class TestCydeo {
    public static void main(String[] args) {

        CydeoStudent st1 = new CydeoStudent("Ali",12,'M');
        CydeoStudent st2 = new CydeoStudent("Vali",22,'F');

        System.out.println(st1);
        System.out.println(st2);

        System.out.println(CydeoStudent.school);
        System.out.println(st2.school);



    }
}
