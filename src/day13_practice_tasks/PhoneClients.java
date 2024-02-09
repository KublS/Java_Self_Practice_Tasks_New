package day13_practice_tasks;

public class PhoneClients {

    public static void main(String[] args) {

        IPhone iphone1 = new IPhone("IPhone", "13", "Max", 799, "Black" );
        System.out.println(iphone1);
        iphone1.faceTime();
        iphone1.call();
        System.out.println(iphone1.getColor());
        System.out.println("-------------------------------");

        Samsung samsung1 = new Samsung("Samsung", "NoteX", "Mini", 999.0, "White" );
        System.out.println(samsung1);
        samsung1.call();
        samsung1.text();
        System.out.println(samsung1.getPrice());
        System.out.println("--------------------------------");

        Nokia nokia1 = new Nokia("Nokia", "11-00", "Regular", 49.99, "Red");
        System.out.println(nokia1);
        nokia1.call();
        nokia1.text();
        System.out.println(nokia1.getModel() + " " + nokia1.getModel());
    }
}
