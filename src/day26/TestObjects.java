package day26;

public class TestObjects {
    public static void main(String[] args) {

        Student student1 = new Student("Ahmet",20,'M',"B123");
        Student student2 = new Student("Mehmet",23,'M',"A122");
        Student student3 = new Student("Ahit",22,'M',"B145");
        Student student4 = new Student("Afet",25,'F',"A156");
        Student student5 = new Student("Demet",20,'F',"A126");


        StudentGroup group1 = new StudentGroup("Java Learners",1);

        group1.addStudent(student1);
        group1.addStudent(student2);
        group1.addStudent(student3);
        group1.addStudent(student4);
        group1.addStudent(student5);


        group1.addStudent("Kaya",31,'M',"B128");

        System.out.println(group1);

        group1.removeStudent("A156");

        System.out.println(group1);


        for (Student each : group1.students) {
            System.out.println(each.name + " " + each.id);
        }

        student2.study();

        String s = group1.addStudent(new Student("Kaya", 32, 'M', "B1234"));
        System.out.println(s);

        for (Student each : group1.students) {
            System.out.println(each.name + " " + each.id);
        }

    }
}
