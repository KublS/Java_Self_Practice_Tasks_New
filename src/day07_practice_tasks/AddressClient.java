package day07_practice_tasks;

public class AddressClient {
    public static void main(String[] args) {

        Address address1 = new Address();
        address1.buildingNumber = 123;
        address1.street = "Jones Branch Dr";
        address1.city = "McLean";
        address1.state = "VA";
        address1.zipCode = 22012;

        System.out.println(address1);
        System.out.println("---------------------");

        Address address2 = new Address();
        address2.buildingNumber = 45;
        address2.street = "Liberty Ave";
        address2.city = "Freeport";
        address2.state = "NC";
        address2.zipCode = 18694;

        System.out.println(address2);
    }
}
