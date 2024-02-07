package day12_practice_tasks;
import static java.lang.Math.*;
public class Circle {
    private double radius;

    public Circle(double radius) {
        setRadius(radius);
    }

    public double getRadius() { //getter
        return radius;
    }

    public void setRadius(double radius) { // setter
        if (radius <= 0){
            System.err.println("Radius can not be negative or 0");
            System.exit(1);
        }
        this.radius = radius;
    }

    public double calcArea (){
        double area = round(pow(radius,2) * PI);
        return area;
    }

    public double calcPerimeter (){
        double perimeter = round(2 * PI * radius);
        return perimeter;
    }

    public String toString() {
        return "Circle radius: " + radius + " Circle area: " + calcArea() +
                    ". Circle perimeter: " + calcPerimeter();
        }
}

