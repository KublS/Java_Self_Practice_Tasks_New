package day04_practice_tasks;

public class Task1ChooseLanguage {
    public static void main(String[] args) {
        /*
        for 1: Hello, thank you for your call
		for 2: Hola, gracias por llamar
		for 3: Merhaba, aradığınız için teşekkürler
		for 4: Привет, спасибо за ваш звонок
		for 5: Merci, pour votre appel
         */

        int selection = 3;

        if (selection == 1) {
            System.out.println("Hello, thank you for your call");
        } else if (selection == 2) {
            System.out.println("Hola, gracias por llamar");
        } else if (selection == 3) {
            System.out.println("Merhaba, aradığınız için teşekkürler");
        } else if (selection == 4) {
            System.out.println("Привет, спасибо за ваш звонок");
        } else if (selection == 5) {
            System.out.println("Merci, pour votre appel");
        } else {
            System.out.println("Please choose from options 1 to 5");
        }
    }
}
