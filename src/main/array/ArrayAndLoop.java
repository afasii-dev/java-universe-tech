package main.array;

public class ArrayAndLoop {
    public static void main(String[] args) {
        iphoneLength();
        getConcat();
        getTrim();
        getEndWith();
        getToUpperCase();
        getToLowerCase();
        getEquals();
    }

    private static void iphoneLength() {
        System.out.println("\nLENGTH:");
        String[] iphones = {"Iphone 11", "Iphone 12", "Iphone 13"};
        int phoneNamesLength = 0;

        for (int i = 0; i < iphones.length; i++) {
            phoneNamesLength = phoneNamesLength + iphones[i].length();
        }
        System.out.println("The Length would be: " + phoneNamesLength);
    }

    private static void getConcat() {
        System.out.println("\nCONCAT: ");
        String[] stringArray = {"I didn't know that ", "learning java", " can be this much fun."};
        String result = "";

        for (int i = 0; i < stringArray.length; i++) {
            result = result.concat(stringArray[i]);
        }
        System.out.println(result);
    }

    private static void getTrim() {
        System.out.println("\nTRIM:");
        String[] trimString = {"  Create  ", "New     ", "  Project    "};

        for (int i = 0; i < trimString.length; i++) {
            System.out.println("Trimed: " + trimString[i].trim());
        }
    }

    private static void getEndWith() {
        System.out.println("\nENDWITH:");
        String[] findLetter = {"Having ", "Fun With ", "Java"};

        for (int i = 0; i < findLetter.length; i++) {
            if (findLetter[i].endsWith("a")) {
                System.out.println(findLetter[i]);
            }
        }
    }

    private static void getToUpperCase() {
        System.out.println("\nTO UPPER CASE:");
        String[] seasons = {" Winter", "Spring", "Summer", "Autumn"};

        for (int i = 1; i < seasons.length; i = i + 2) {
            System.out.println(seasons[i].toUpperCase());
        }
    }

    private static void getToLowerCase() {
        System.out.println("\nTO LOWER CASE:");
        String[] numbers = {" FIRST", " SECOND ", "THIRD ", "FOURTH", " FIFTH", " SIXTH"};

        for (int i = 2; i < numbers.length; i = i + 3) {
            System.out.println(numbers[i].toLowerCase());
        }
    }

    private static void getEquals() {
        System.out.println("\nEQUALS:");
        String[] chocolates = {"Mars", "Snickers", "Twix", "Mars", "Bounty"};
        String chocolate = "Mars";

        int counter = 0;

        for (int i = 0; i < chocolates.length; i++) {
            if (chocolates[i].equals(chocolate)) {
                counter++;
            }
        }
        System.out.println("Counter: " + counter);
    }
}