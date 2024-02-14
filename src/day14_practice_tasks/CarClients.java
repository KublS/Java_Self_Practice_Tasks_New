package day14_practice_tasks;

public class CarClients {
    public static void main(String[] args) {

        Toyota toyota1 = new Toyota("Toyota", "RAV4", 2019,35_000, "White");
        System.out.println(toyota1);
        toyota1.drive();
        toyota1.stop();
        toyota1.start();
        System.out.println(toyota1.getColor());

        System.out.println("---------------------");

        Honda honda1 = new Honda("Honda", "Civic", 2022, 29_500, "Red");
        System.out.println(honda1);
        honda1.drive();
        honda1.stop();
        honda1.start();
        System.out.println(honda1.getModel());

        System.out.println("---------------------");

        Car bmw1 = new BMW("BMW", "320", 2024, 41_800, "Blue");
        System.out.println(bmw1);
        bmw1.drive();
        bmw1.stop();
        bmw1.start();
        System.out.println(bmw1.getYear());

        System.out.println("---------------------");

        Audi audi1 = new Audi("Audi", "s3", 2017, 40_000, "Black");
        System.out.println(audi1);
        audi1.drive();
        audi1.stop();
        audi1.start();
        audi1.autoPark();
        System.out.println(audi1.getYear());

        System.out.println("---------------------");
        
        Mercedes mercedes1 = new Mercedes("Mercedes", "E350", 2019, 21_000, "White");
        System.out.println(mercedes1);
        mercedes1.drive();
        mercedes1.stop();
        mercedes1.start();
        mercedes1.autoPark();
        System.out.println(mercedes1.getYear());

        System.out.println("---------------------");
        
        Tesla tesla1 = new Tesla("Tesla", "3", 2022, 35_000, "Red");
        System.out.println(tesla1);
        tesla1.drive();
        tesla1.stop();
        tesla1.start();
        tesla1.autoPark();
        tesla1.selfDrive();
        System.out.println(tesla1.getMake());

        System.out.println("---------------------");

        Nio nio1 = new Nio("Nio", "100", 2022, 55_000, "White");
        System.out.println(nio1);
        nio1.drive();
        nio1.stop();
        nio1.start();
        nio1.autoPark();
        nio1.selfDrive();
        System.out.println(nio1.getModel());

        System.out.println("---------------------");
        
        CydeoCar cydeoCar1 = new CydeoCar("CydeoCar", "Plus", 2024, 100_000, "Black");
        System.out.println(cydeoCar1);
        cydeoCar1.drive();
        cydeoCar1.stop();
        cydeoCar1.start();
        cydeoCar1.autoPark();
        cydeoCar1.selfDrive();
        cydeoCar1.fly();
        System.out.println(cydeoCar1.getPrice());


    }
}
