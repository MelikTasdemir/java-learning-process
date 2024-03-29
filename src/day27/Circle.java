package day27;

public class Circle {


    public double radius;
    public double diameter;
    public static double pi = 3.14;

    public Circle(double radius) {
        this.radius = radius;
        diameter = radius * 2;
    }

    public double calcArea(){

        return radius * radius * pi;
    }

    public double calcPerimeter(){
        return radius * 2 * pi;
    }

    public static void printPiValue(){
        System.out.println("PI value is "+ pi);
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", diameter=" + diameter +
                ", PI=" + pi +
                ", area=" + calcArea()+
                ", perimeter=" + calcPerimeter()+
                '}';
    }
}


/*
 Create a class named Circle:

		Attributes:
			radius, diameter, pi

		Add a constructor that can set All the fields (instances)

		Actions:
			calcArea(): returns the area of Circle
			calcPerimeter(): returns the perimeter of Circle
			printPi(): displays PI value
			toString(): displays the radius, diameter, pi, area and perimeter of the circle when the object of circle is passed in the print statement
 */