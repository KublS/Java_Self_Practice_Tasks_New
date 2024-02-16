package day14_practice_tasks;

import java.util.ArrayList;

public class CarShop {
    public static void main(String[] args) {
       Car2[] cars =
               {new Honda2("Pilot","White", 2010, 25000),
               new Audi2("Q6", "Red",2014, 32000),
               new Honda2("Accord", "White",2011, 20000  ),
               new Audi2("Q4", "Blue", 2015, 33000),
               new Audi2("A7", "Black",2019, 35000),
               new Audi2("Q8", "White",2018, 40000),
               new Audi2("Q5", "Purple",2009, 30000),
               new Audi2("A4", "Black", 2011, 30000),
               new Honda2("Civic", "Red",2018, 30000),
               new Honda2("CR-V", "Red", 2012, 23000),
               new Honda2("HR-V", "Blue",2019, 35000),
               new Tesla2("Model 3", "White", 2015, 45000),
               new Tesla2("Model Y", "Black", 2017, 65000),
               new Tesla2("Model X", "White", 2016, 48000),
               new Tesla2("Model X", "Blue",2014, 48000),

        };


        CarShop carShop = new CarShop(cars);


        System.out.println("All cars are available for recall");
        carShop.displayRecallClass();
        System.out.println("----------------------");
        System.out.println("The car with the highest prise is: " + carShop.displayHighestPrice());
        System.out.println("----------------------");
        System.out.println("The car with the lowest prise is: " + carShop.displayLowestPrice());
        System.out.println("----------------------");
        ArrayList<Tesla2> tesla2cars = carShop.getTeslaCars();
        System.out.println("Tesla cars: " + tesla2cars);



    }

    public Car2[] cars;

    public CarShop(Car2[] cars) {
        this.cars = cars;
    }

    public void displayRecallClass(){
        for (Car2 eachCar : cars) {
            if (eachCar.isEligibleForRecall()){
                System.out.println(eachCar);
            }
        }
    }

    public Car2 displayHighestPrice(){
        Car2 max = cars[0];
        for (Car2 eachCar : cars) {
            if (eachCar.price > max.price){
                max = eachCar;
            }

        }
        return max;
    }

    public Car2 displayLowestPrice(){
        Car2 min = cars[0];
        for (Car2 eachCar : cars) {
            if (eachCar.price < min.price){
                min = eachCar;
            }

        }
        return min;
    }

    public ArrayList<Tesla2> getTeslaCars(){
        ArrayList<Tesla2> tesla2cars = new ArrayList<>();
        for (Car2 eachCar : cars) {
            if (eachCar instanceof Tesla2){
                tesla2cars.add((Tesla2) eachCar);
            }
        }
        return tesla2cars;
    }
}
