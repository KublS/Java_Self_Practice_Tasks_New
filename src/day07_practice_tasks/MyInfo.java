package day07_practice_tasks;

import java.util.Scanner;

public class MyInfo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Pleas, provide your info: \n1.Age 2.Gender 3.Full Name 4.Phone Number 5.Zip code \n6.School name " +
                "7. City Name 8.State Name 9.Building Number 10.Street Name");
        int age = input.nextInt();
        String gender = input.next();
        input.nextLine();
        String fullName = input.nextLine();
        long phoneNumber = input.nextLong();
        int zipCode = input.nextInt();
        input.nextLine();
        String schoolName = input.nextLine();
        String cityName = input.nextLine();
        String stateName = input.next();
        int buildingNumber = input.nextInt();
        input.nextLine();
        String streetName = input.nextLine();
        input.close();

        System.out.println("Full Name: " + fullName + "\nAge: " + age + "\nGender: " + gender + "\nPhone Number: " + phoneNumber + "\nAddress:" +
                "\n\t" + buildingNumber + " " + streetName + "\n\t" + cityName + ", " + stateName + " " + zipCode);


    }
}
