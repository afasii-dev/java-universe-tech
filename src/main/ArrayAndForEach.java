package arrayAndForeach;

public class ArrayAndForEach {
    public static void main(String[] args) {
        iphoneLength();
        getConcat();
        getTrim();
        getEndWith(); // ?????
        getToUpperCase();
        getToLowerCase();
        getEquals();
    }

    private static void iphoneLength() {
        System.out.println("\nLENGTH:");
        String[] iphones = {"Iphone 11 ", "Iphone 12 ", "Iphone 13 "};

        for (String phone : iphones) {
            System.out.println("Result: " + phone);
        }
    }

    private static void getConcat() {
        System.out.println("\nCONCAT:");
        String[] stringArray = {" I didn't know that ", "learning java", " can be this much fun."};

        for (String concat : stringArray) {
            String result = stringArray[0].concat(stringArray[1].concat(stringArray[2]));
            concat = concat + result;
            System.out.println(result);
        }
    }

    private static void getTrim() {
        System.out.println("\nTRIM:");
        String[] trimString = {"  Create New Project    "};

        for (String trim : trimString) {
            System.out.println("Trimed: " + trimString[0].trim());
        }
    }

    private static void getEndWith() { //?????????
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

        for (String upperCase : seasons) {
            upperCase = seasons[1].toUpperCase() + seasons[3].toUpperCase();
            System.out.println(upperCase);
        }
    }

    private static void getToLowerCase() {
        System.out.println("\nTO LOWER CASE:");
        String[] numbers = {" FIRST", " SECOND ", "THIRD ", "FOURTH", " FIFTH", " SIXTH"};

        for (String lowerCase : numbers) {
            lowerCase = numbers[2].toLowerCase() + numbers[5].toLowerCase();
            System.out.println(lowerCase);
        }
    }

    private static void getEquals() {
        System.out.println("\nEQUALS:");
        String[] chocolates = {"Mars", "Snickers", "Twix", "Mars", "Bounty"};

        for (String equals : chocolates) {
            System.out.println(equals.equals(chocolates[0]));

        }
    }
}