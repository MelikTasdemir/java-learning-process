package day29;

import java.util.SortedMap;

public class Student {

    private String name;

    public String getName() {
        if (name == null){
            name = "Unknown";
        }
        return name;
    }

    public void setName(String name) {
        if(name.isEmpty()){
            System.err.println("Invalid student name ");
            System.exit(1);
        }
        this.name = name;
    }




    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0){
            System.err.println("No a valid age " + age);
            System.exit(1);
        }
        if (age < 5 || age > 90){
            System.err.println("Invalid age " + age);
            System.exit(1);
        }
        this.age = age;
    }




    private char  gender;

    public char getGender() {
        return gender;
    }

    public void setGender(char  gender) {
        if (gender == 'M' || gender == 'F' || gender == 'm' || gender =='f'){
            this.gender = Character.toUpperCase(gender);
        }else{
            System.err.println("Invalid gender " + gender);
            System.exit(1);
        }

    }




    private char grade;

    public char getGrade() {
        return grade;
    }

    public void setGrade(char grade) {
        boolean isValid = grade == 'A' || grade == 'B' || grade == 'C' || grade == 'D' || grade == 'F';
            if (isValid){
                this.grade = grade;
            }else{
                System.err.println("Invalid grade " + grade);
                System.exit(1);
            }
    }




    private String schoolName;

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }


    public void study(){
        System.out.println(name + " is studying at " + schoolName);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", grade=" + grade +
                ", schoolName='" + schoolName + '\'' +
                '}';
    }

    public Student(String name, int age, char gender, char grade, String schoolName) {
        setName(name);
        setAge(age);
        setGender(gender);
        setGrade(grade);
        setSchoolName(schoolName);
    }
}
/*
Warmup tasks:
    1. Create a class named Student:
            private variables:
                name, age, gender, grade, schoolName

            Encapsulate all the fields (at lest encapsulate two fields manually)
                    requirements:
                        1. age can not be less than 5 or greater than 90
                        2. gender should not be set to any character other than: 'M' and 'F'
                        3. grade should not be set to any characters other than: 'A', 'B', 'C', 'D', and 'F'

            Add a constructor that can set all teh fields when the object is created
                        (requirements of fields in the above must be applied)


            Methods:
                study()
                toString()
 */