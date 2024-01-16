package day04;

public class Task456 {
    public static void main(String[] args) {

        /*
        1. Create a class named CarInfo.java
2. Declare the following variables:
1. year
2. make
3. model
4. miles
5. color
6. Price
3. Use concatenation to print the full info of the car in the
following format:
Year Make Model, Miles, Color, Price.
Ex:
Car information is :
2018 Toyota Camry, 50000 miles, Red, $19000.
         */

        int year = 2018;
        String make = "Toyota",
                model = "Camry",
                miles = "50000 miles",
                color = "Red",
                Price = "$19000";

        System.out.println(year + " " + make + " " + model + ", " + miles+  ", " + color + ", " + Price + ".");

        System.out.println("------------------------------------------------------------");

/*
1. Create a class named EmployeeInfo.java
2. Declare the following Variables:
1. name
2. age
3. gender
4. company_name
5. jobTitle
6. salary
3. Use concatenation to display the full info of the employee:
Ex:
given data:
name = “Daniel”
age = 28
gender = “Male”
company_name = “Google Inc”
job_title = ”Software Developer"
salary = 90000
output:
Daniel is 28 years old, gender is Male.
Daniel works at Google Inc as a Software Developer.
Daniel makes $ 90000 per year.
 */

String name = "Daniel";
int age = 28;
String gender = "Male",
        company_name = "Google Inc",
        jobTitle = "Sofware Developer";
int salary = 90000;
        System.out.println(name + " is " + age + " years old," + "gender is " + gender + "."+
        "\n" + name + " works at " + company_name + " as a " + jobTitle + "." + "\n" +
                name + " makes " + "$ " + salary + " per year." );


        System.out.println("------------------------------------------------------------");

/*
1. Create a class named SalaryCalculator.java
2. Declare the following Variables:
1. name1
2. hourlyRate
3. weeklyHours
3. Write a program that can calculate the salary, and display the
following info:
Hint: there are 52 weeks in a year
salary = hourlyRate * weeklyHours * 52
Ex:
given data:
name = “Joshua”
hourlyRate = 40
weeklyHours = 45
output:
Hello Joshua, your salary is $ 93600
 */

String name1 = "Joshua";
int hourlyRate = 40,
        weeklyhours = 45;
        System.out.println("Hello " + name1 + ", your salary is $ " + (hourlyRate*weeklyhours*52)  );













        
    }
}
