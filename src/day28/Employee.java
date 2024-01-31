package day28;

public class Employee {

    private String name;


    public String getName() {
        if (name == null){
            return  "Unknown";
        }
        return name;
    }

    public void setName(String name) {
        if(name.isEmpty() || name.isBlank()){
            System.err.println("No");
            System.exit(1);
        }
        this.name = name;
    }

    private double salary;


    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if (salary<0){
            System.err.println("No" + salary);
            System.exit(1);
        }
        this.salary = salary;
    }
}

