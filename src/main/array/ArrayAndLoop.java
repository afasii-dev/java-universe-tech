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
            String[] conTask = new String[3];

            conTask[0] = " I didn't know that ";
            conTask[1] = "learning java";
            conTask[2] = " can be this much fun.";
            String result = (conTask[0].concat(conTask[1].concat(conTask[2])));

            for (int i = 0; i < 1; i++) {
                System.out.println(i + result);
            }

        }

        private static void getTrim() {
            System.out.println("\nTRIM:");
            String[] trimTask = {"  Create  ", "New     ", "  Project    "};

            for (int i = 0; i < 3; i++) {
                System.out.println("Trimed: " + trimTask[i].trim());
            }

        }

        private static void getEndWith() {
            System.out.println("\nENDWITH:");
            String[] endWTask = {"Having ", "Fun With ", "Java"};

            if (endWTask[2].endsWith("a")) {
                System.out.println("Good: ");
            } else {
                System.out.println("Wrong");
            }

        }

        private static void getToUpperCase() {
            System.out.println("\nTO UPPER CASE:");
            String[] seasons = {" Winter", " Spring ", "Summer", " Autumn"};

            for (int i = 0; i < 1; i++) {
                String getToUpCa = seasons[0] + seasons[1].toUpperCase() + seasons[2] + seasons[3].toUpperCase();
                System.out.println(i + getToUpCa);

            }

        }

        private static void getToLowerCase() {
            System.out.println("\nTO LOWER CASE:");
            String[] numbers = {" FIRST", " SECOND ", "THIRD ", "FOURTH", " FIFTH", " SIXTH"};

            for (int i = 0; i < 1; i++) {
                String getToLoCase = numbers[0] + numbers[1] + numbers[2].toLowerCase() + numbers[3] + numbers[4] + numbers[5].toLowerCase();
                System.out.println(i + getToLoCase);

            }

        }

    private static void getEquals() {
        System.out.println("\nEQUALS:");
        String getEquals = "Intellij IDEA";
        String getEquals2 = "Intellij IDEA";

        for (int i = 0; i < 1; i++) {
            boolean equalsResl = getEquals.equals(getEquals2);
            System.out.println(i + " Result: " + equalsResl);

        }

    }

    }
