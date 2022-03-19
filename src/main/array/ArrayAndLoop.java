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
            int phone = 0;

            for (int i = 0; i < iphones.length; i++) {
                phone = phone + iphones[i].length();

            }
            System.out.println("The Length would be: " + phone);
        }
        private static void getConcat() {
            System.out.println("\nCONCAT:");
            String[] stringArray = {" I didn't know that ", "learning java", " can be this much fun."};

            for (int i = 0; i < 1; i++) {
               String result = stringArray[0].concat(stringArray[1].concat(stringArray[2]));
                System.out.println(result);
            }
        }
        private static void getTrim() {
            System.out.println("\nTRIM:");
            String[] trimString = {"  Create  ", "New     ", "  Project    "};

            for (int i = 0; i < 3; i++) {
                System.out.println("Trimed: " + trimString[i].trim());
            }
        }
        private static void getEndWith() {
            System.out.println("\nENDWITH:");
            String[] findLetter = {"Having ", "Fun With ", "Java"};

            if (findLetter[2].endsWith("a")) {
                System.out.println("Good: ");
            } else {
                System.out.println("Wrong");
            }
        }
        private static void getToUpperCase() {
            System.out.println("\nTO UPPER CASE:");
            String[] seasons = {" Winter", "Spring ", "Summer", " Autumn"};
            String getUpper = seasons[1].toUpperCase() + seasons[3].toUpperCase();

            for (int i = 1; i < 1; i++) {
                getUpper = getUpper + seasons[i].toUpperCase();
            }
            System.out.println(getUpper);
        }
        private static void getToLowerCase() {
            System.out.println("\nTO LOWER CASE:");
            String[] numbers = {" FIRST", " SECOND ", "THIRD ", "FOURTH", " FIFTH", " SIXTH"};
            String getLower = numbers[2].toLowerCase() + numbers[5].toLowerCase();

            for (int i = 2; i < 1; i++) {
                getLower = getLower + numbers[i].toLowerCase();
            }
            System.out.println(getLower);
        }
    private static void getEquals() {
        System.out.println("\nEQUALS:");
        String[] chocolates = {"Mars", "Snickers", "Twix", "Mars", "Bounty"};

        for (int i = 0; i < 1; i++) {
            boolean getEquals = chocolates[0].equals(chocolates[3]);
            System.out.println(i + " Result: " + getEquals);
        }
    }
    }