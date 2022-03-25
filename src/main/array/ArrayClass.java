package main.array;

public class ArrayClass {
    public static void main(String[] args) {

        segaLength();
        segaConcat();
        segaTrim();
        segaEndWith();
        segaToUpperCase();
        segaToLowerCase();
        segaEquals();

    }

    private static void segaToLowerCase() {
        String[] week = {" MONDAY", " TUESDAY ", "WEDNESDAY ", "THURSDAY", " FRIDAY", " SATURDAY", "SUNDAY"};

        for (int i = 2; i < week.length; i = i + 3) {
            System.out.println(week[i].toLowerCase());
        }

    }

    private static void segaEquals() {

        String[] pets = {"Dog", "Cat", "Rabbit", "Dog", "Parrot"};
        String myPet = "Dog";

        int petNone = 0;

        for (int i = 0; i < pets.length; i++) {
            if (pets[i].equals(myPet)) {
                petNone++;

        }
    }
        System.out.println("Result: " + petNone);
}

    private static void segaTrim() {
        String[] grade = {"  1 grade  ", "2 grade     ", "  3 grade    "};

        for (int i = 0; i < grade.length; i++) {
            System.out.println("Trimed: " + grade[i].trim());
        }
    }


    private static void segaLength() {
        String[] city = {"dushanbe", "bohtar", "vahdat"};
        int cityLength = 0;

        for (int i = 0; i < city.length; i++) {
            cityLength = cityLength + city[i].length();

        }
        System.out.println("Result: " + cityLength);
    }

    private static void segaConcat() {
        String[] stringApple = {"I ", "Love", " Apple."};
        String result = "";

        for (int i = 0; i < stringApple.length; i++) {
            result = result.concat(stringApple[i]);

        }
        System.out.println(result);


    }

    private static void segaEndWith() {
        String[] itsMe = {"This ", "is ", "Sega"};

        for (int i = 0; i < itsMe.length; i++) {

            if (itsMe[i].endsWith("a")) {
                System.out.println(itsMe[i]);
            }
        }
    }

    private static void segaToUpperCase() {
        String[] javaClass = {" String", "int ", "Array", "oop"};

        for (int i = 1; i < javaClass.length; i = i + 2) {
            System.out.println(javaClass[i].toUpperCase());
        }
    }
}