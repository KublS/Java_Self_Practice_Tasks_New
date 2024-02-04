package day10_practice_tasks;

public class UpperCaseAndLowerCase {
    public static void main(String[] args) {
        String str = "JAVA java";
        boolean result = true;
        Integer counterUpperCase = 0,
                counterLowerCase = 0;
        for (char eachCharacter : str.toCharArray()) {
            if (Character.isUpperCase(eachCharacter)){
                counterUpperCase++;
            } else if (Character.isLowerCase(eachCharacter)) {
                counterLowerCase++;
            }
        }
        if (counterUpperCase == counterLowerCase){
            System.out.println(result);
        } else {
            System.out.println(!result);
        }
    }
}
