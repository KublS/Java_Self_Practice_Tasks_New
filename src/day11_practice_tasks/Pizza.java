package day11_practice_tasks;

public class Pizza {
    String size;
    int numberOfCheeseToppings, numberOfPepperoniToppings;
    double cost;


    public Pizza() {
        System.out.println("You haven't placed an order!");
    }

    public Pizza(String size){
        this.size = size;
        this.cost = calcCost(size, numberOfCheeseToppings, numberOfPepperoniToppings);
    }

    public Pizza(String size, int numberOfCheeseToppings) {
        this(size);
        this.numberOfCheeseToppings = numberOfCheeseToppings;
        this.cost = calcCost(size, numberOfCheeseToppings, numberOfPepperoniToppings);
    }


    public Pizza(String size, int numberOfCheeseToppings, int numberOfPepperoniToppings) {
        this(size, numberOfCheeseToppings);
        this.numberOfPepperoniToppings = numberOfPepperoniToppings;
        this.cost = calcCost(size, numberOfCheeseToppings, numberOfPepperoniToppings);

    }

    public static double calcCost (String size, int numberOfCheeseToppings, int numberOfPepperoniToppings){
        double totalCost = 0.0;
        switch (size.toLowerCase()){
            case "small" -> totalCost = 10 + 2 * numberOfCheeseToppings + 2*numberOfPepperoniToppings;
            case "medium" -> totalCost = 12 + 2 * numberOfCheeseToppings + 2*numberOfPepperoniToppings;
            case "large" -> totalCost = 14 + 2 * numberOfCheeseToppings + 2*numberOfPepperoniToppings;
        }
        return totalCost;
    }

    public String toString() {
        return size + ':' + "$2 per " + numberOfCheeseToppings + " toppings, and $2 per " +
                numberOfPepperoniToppings + " toppings. Your Total is: $" + cost;

    }
}

