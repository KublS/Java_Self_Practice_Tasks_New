package day12_practice_tasks;

public class CircleClient {

    public static void main(String[] args) {

        Circle circle1 = new Circle(3.5);
        System.out.println(circle1.getRadius());
        System.out.println(circle1.calcArea());
        System.out.println(circle1.calcPerimeter());
        System.out.println(circle1);

        System.out.println("-----------------------");

        Circle circle2 = new Circle(2);
        System.out.println(circle1.getRadius());
        System.out.println(circle2.calcArea());
        System.out.println(circle2.calcPerimeter());
        System.out.println(circle2);

        System.out.println("-----------------------");

        Circle circle3 = new Circle(1.5);
        System.out.println(circle1.getRadius());
        System.out.println(circle3.calcArea());
        System.out.println(circle3.calcPerimeter());
        System.out.println(circle3);

    }
}
