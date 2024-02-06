package day09_practice_tasks;

public class Items {
    public static void main(String[] args) {
        String[] items = {"Shoes", "Jacket", "Gloves", "AirPods", "iPad", "iPhone 12 case"};
        double[] prices = {99.99, 150.0, 9.99, 250.0, 439.50, 39.99};
        int[] itemIDs = {12345, 12346, 12347, 12348, 12349, 12350};

        System.out.println(firstIndexOf(items));
        System.out.println(containedInTheList(items));
        System.out.println("-------------------------------");
        finalOutput(items, prices, itemIDs);

    }

    public static int firstIndexOf(String[] items) { // How to improve this code (if items don't have "Gloves")
        int indexOfGloves = 0;
        for (int i = 0; i < items.length; i++) {
            if (items[i].equalsIgnoreCase("Gloves")) {
                indexOfGloves = i;
            }
        }return indexOfGloves;
    }
    public static String containedInTheList(String[] items){
        String answer = "";
        for (int i = 0; i < items.length; i++) {
            if (items[i].contains("iPad")){
                answer = "Yes";
                return answer;
            } else {
                answer = "No";
            }

        }
        return answer;
    }

    public static String finalOutput (String[] items, double[] prices, int[] itemsIDs){
        String result = "";
        for (int i = 0; i < items.length; i++) {
            result = items[i] + " - $" + prices[i] + " - " + itemsIDs[i];
            System.out.println(result);
        }return result;


    }


}
