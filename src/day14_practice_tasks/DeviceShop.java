package day14_practice_tasks;

public class DeviceShop {
    public static void main(String[] args) {

        Iphone iphone = new Iphone("Iphone", "14", 999.00, "Black", "Max",
                true, false);
        System.out.println(iphone);
        iphone.turnOn();
        iphone.turnOff();
        iphone.downloadApp();
        iphone.call(1546789034);
        iphone.text(1546789034);
        System.out.println(iphone.isHasPowerButton());
        System.out.println(Iphone.OS);

        System.out.println("--------------------------");
        
        Samsung samsung = new Samsung("Samsung", "Note 10", 1100.50, "Black", "Max",
                true, true);
        System.out.println(samsung);
        samsung.turnOn();
        samsung.turnOff();
        samsung.downloadApp();
        samsung.call(1546789034);
        samsung.text(1546789034);
        System.out.println(samsung.isHasPowerButton());
        System.out.println(samsung.OS);

        System.out.println("--------------------------");

        Google google = new Google("Google", "A1", 700.99, "Black", "Mini",
                true, true);
        System.out.println(google);
        google.turnOn();
        google.turnOff();
        google.downloadApp();
        google.call(1546789034);
        google.text(1546789034);
        System.out.println(google.isHasPowerButton());
        System.out.println(google.AppStoreName);

        System.out.println("--------------------------");
        
        Computer desktop = new Desktop("Dell", "S1000", 1599.99, "Grey", "Mini",
                true, true, 14);
        System.out.println(desktop);
        desktop.turnOn();
        desktop.turnOff();
        desktop.modifyPC();
        desktop.formatComputer();
        System.out.println(desktop.getSizeOfDisplay() + " " + desktop.getModel());

        System.out.println("--------------------------");

        Laptop laptop = new Laptop("Lenovo", "I500", 2100.00, "Blue", "Regular", true
        ,true, 17);
        System.out.println(laptop);
        laptop.turnOn();
        laptop.turnOff();
        laptop.modifyPC();
        laptop.formatComputer();
        System.out.println("$" + laptop.getPrice());
        
        
    }
}
