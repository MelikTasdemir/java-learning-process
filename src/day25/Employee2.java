package day25;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Employee2 {

    public String name;
    public  int age;
    public char gender;
    public String jobTitle;
    public double salary;
    public LocalDate hiredDate;

    @Override
    public String toString() {
        return "Employee2{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", JobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                ", HiredDate=" + hiredDate.format(DateTimeFormatter.ofPattern("MMMM/dd/y")) +
                '}';
    }



    public Employee2(String name, int age, char gender, String jobTitle, double salary, LocalDate hiredDate) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.jobTitle = jobTitle;
        this.salary = salary;
        this.hiredDate = hiredDate;







    }
}
