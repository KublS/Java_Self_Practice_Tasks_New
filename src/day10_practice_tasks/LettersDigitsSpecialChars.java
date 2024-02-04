package day10_practice_tasks;

public class LettersDigitsSpecialChars {
    public static void main(String[] args) {
        String str = "Wooden Spoon123!";
        String letters = " ";
        String digits = " ";
        String specialCharacters = " ";
        String str2 = str.trim();

        for (char eachSingleChar : str2.toCharArray()) {
            if (Character.isLetter(eachSingleChar)){
                letters += eachSingleChar;
            } else if (Character.isDigit(eachSingleChar)){
                digits += eachSingleChar;
            } else if (!Character.isLetterOrDigit(eachSingleChar)){
                specialCharacters += eachSingleChar;
            }
        }
        System.out.println("letters = " + letters);
        System.out.println("Digits = " + digits);
        System.out.println("SpecialChars = " + specialCharacters);



        }


    }

