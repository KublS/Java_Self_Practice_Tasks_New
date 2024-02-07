package day12_practice_tasks;
import static java.lang.Math.*;
public class Rectangle {
    private int width, length;

    public Rectangle(int width, int length) {
        setWidth(width);
        setLength(length);
    }

    public int getWidth() {
        return width;
    }

    public int getLength() {
        return length;
    }

    public void setWidth(int width) {
        if (width < 1){
            System.err.println("Invalid Input!");
            System.exit(1);
        }
        this.width = width;
    }

    public void setLength(int length) {
        if (length < 1){
            System.err.println("Invalid Input!");
            System.exit(1);
        }
        this.length = length;
    }

    public int calcArea (){
        int areaEquals = length * width;
        return areaEquals;
    }
    public int calcPerimeter(){
        int perimeterEquals = 2 * (length + width);
        return perimeterEquals;
    }

    public String toString() {
        return "Rectangle width: " + width +
                ", length: " + length + ", area: " + calcArea() + ", perimeter: " + calcPerimeter();
    }
}
