package day12_practice_tasks;

public class RectangleClient {
    public static void main(String[] args) {

        Rectangle rectangle1 = new Rectangle(2,4);
        System.out.println(rectangle1.getLength());
        System.out.println(rectangle1.calcArea());
        System.out.println(rectangle1);

        System.out.println("------------------------------");

        Rectangle rectangle2 = new Rectangle(1,8);
        System.out.println(rectangle2.getLength());
        System.out.println(rectangle2.calcArea());
        System.out.println(rectangle2);

        System.out.println("------------------------------");

        Rectangle rectangle3 = new Rectangle(10,0);
        System.out.println(rectangle3.getLength());
        System.out.println(rectangle3.calcArea());
        System.out.println(rectangle3);
    }
}
