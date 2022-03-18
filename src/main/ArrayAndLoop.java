package main;

public class ArrayAndLoop {
    public static void main(String[] args) {

        System.out.println("\nLENGTH:");
        int[] iphones = new int[4];

        iphones[0] = 10;
        iphones[1] = 11;
        iphones[2] = 12;
        iphones[3] = 13;

        System.out.println("Latest Phones in the Store: " + iphones.length);
        for (int i = 0; i < 4; i++) {
            System.out.println(i + " - Iphone " + iphones[i] + " Pro");
        }
// -------------------------------------------------------------------------

        System.out.println("\nCONCAT, TRIM, CharAt, SubString and StartWith:");
        String[] stconcat = new String[3];

        stconcat[0] = "   I didn't know that ";
        stconcat[1] = "learning java";
        stconcat[2] = " can be this much fun.      ";

        String result = (stconcat[0].concat(stconcat[1].concat(stconcat[2])));
        System.out.println(result.trim());
        System.out.println(stconcat[1].charAt(7));
        System.out.println(stconcat[2].substring(8));
        System.out.println(stconcat[0].startsWith(" "));

//  ---------------------------------------------------------------------------

        System.out.println("\nENDWITH:");
        String[] arrayEnd = {"Having", "Fun  ", "With", "Java"};
        boolean trimstr = endMethod(arrayEnd[3]);
        System.out.println(trimstr);

//  ------------------------------------------------------------------------

        System.out.println("\nToUpperCase:");
        String[] seasons = {"Winter", "Spring ", "Summer", "Autumn"};
        String result1 = seasons[1] + seasons[3];
        upMethod(result1);

//  ------------------------------------------------------------------------

        System.out.println("\nToLowerCase:");
        String[] numbers = {"FIRST", "SECOND ", "THIRD ", "FOURTH", "FIFTH", "SIXTH"};
        String result2 = numbers[2] + numbers[5];
        lowerMethod(result2);

    }

    private static boolean endMethod(String arrayEnd) {
        return arrayEnd.endsWith("a");

    }


    private static void upMethod(String result) {
        System.out.println(result.toUpperCase());
    }


    private static void lowerMethod(String result) {
        System.out.println(result.toLowerCase());
    }
}
