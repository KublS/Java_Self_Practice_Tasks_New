package day11_practice_tasks;

public class Carpet {

    double width, length, unitPrice;
    boolean isPersian;
    double cost;

    public Carpet(double width, double length, double unitPrice, boolean isPersian) {
        this.width = width;
        this.length = length;
        this.unitPrice = unitPrice;
        this.isPersian = isPersian;
        this.cost = calcCost(width, length, unitPrice, isPersian);
    }

    public static double calcCost (double width, double length, double unitPrice, boolean isPersian){
        double totalCost = 0.0;
        if (isPersian == true){
            totalCost = (width * length) * unitPrice + 200;
        } else {
            totalCost = (width * length) * unitPrice;
        }
        return totalCost;
    }

    public String toString() {
        return "Carpet width is: " + width + ", length is: "  + length + ", Unit Price is: $" + unitPrice +
                ", Persian: " + isPersian + ". Your final price is: $" + cost;
    }
}
