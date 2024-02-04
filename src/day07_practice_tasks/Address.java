package day07_practice_tasks;

public class Address {
    public int buildingNumber, zipCode;
    public String street, city, state;

    public String toString() {
        return buildingNumber + " " + street +
                "\n"+ city + " " + state + ", " + zipCode;
    }
}
