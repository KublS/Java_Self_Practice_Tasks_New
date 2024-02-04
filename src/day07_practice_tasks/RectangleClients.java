package day07_practice_tasks;

public class RectangleClients {
    public static void main(String[] args) {

        Rectangle rectangle1 = new Rectangle();
        rectangle1.width = 5.5;
        rectangle1.length = 3.88;

        double area1 = rectangle1.calculateArea(5.5, 3.88);
        double perimeter1 = rectangle1.calculatePerimeter(5.5, 3.88);

        System.out.println(area1);
        System.out.println(perimeter1);
        System.out.println(rectangle1);

        System.out.println("-----------------------");

        Rectangle rectangle2 = new Rectangle();
        rectangle2.width = 4.4;
        rectangle2.length = 7.17;

        double area2 = rectangle2.calculateArea(4.4,7.17);
        double perimeter2 = rectangle2.calculatePerimeter(4.4, 7.17);
        System.out.println(area2);
        System.out.println(perimeter2);
        System.out.println(rectangle2);
    }
}
