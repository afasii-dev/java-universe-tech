package arraysAndMethodsHomeWork;


import java.util.Locale;

public class Methods {
    public static void main(String[] args) {
        matAll();
        String string = "My cat";
        String string1 = "My dog";
        getConcat(string);
        getCharAt(string);
        getSubsString(string);
        getTrim(string);
        getEndWith(string);
        getLowerCase(string);
        getUpperCase(string);
        getEquals(string,string1);
        getStarts(string);
        getContains(string);
        getIndexOf(string);
        getIsEmpty(string);
        getIsBlank(string);
        getLength1(string);
        getReplase();

    }


    private static void matAll() {
        matMethod();
        matRandom();
        matRound();
        matCeil();
        matFloor();
    }

    private static void matFloor() {
        double result = Math.random() * 10;
        result = Math.floor(result);
        System.out.println("It's floor = " + result);
    }

    private static void matCeil() {
        double result = Math.random() * 10;
        result = Math.ceil(result);
        System.out.println("It's ceil = " + result);
    }

    private static void matRound() {
        double result = Math.random() * 10;
        result = Math.round(result);
        System.out.println("It's round = " + result);
    }

    private static void matRandom() {
        double result = Math.random() * 10;
        System.out.println("It's mathRandom = " + result);
    }

    private static void matMethod() {
        int a = 4;
        int b = 6;
        int sum = getFormul(a,b);
        System.out.println("It's method = " + sum);
    }

    private static int getFormul(int a, int b) {
        return a*(a + b)/4;
    }



    // here String methods:(`-_-)

    private static void getReplase() {
        String string = "My cat";
        string = string.replace("cat", "dog");
        System.out.println("13 " + string);
    }

    private static void getLength1(String string) {
        System.out.println("13  " + string.length());
    }

    private static void getIsBlank(String string) {
        System.out.println("12  " + string.isBlank());
    }

    private static void getIsEmpty(String string) {
        System.out.println("12  " + string.isEmpty());
    }

    private static void getIndexOf(String string) {
        System.out.println("11  " + string.indexOf("c"));
    }

    private static void getContains(String string) {
        System.out.println("10  " + string.contains("M"));
    }

    private static void getStarts(String string) {
        System.out.println("9  " + string.startsWith("My"));
    }

    private static void getEquals(String string, String string1) {
        System.out.println("8  " + string.equals("dog"));
    }

    private static void getUpperCase(String string) {
        System.out.println("7  " + string.toUpperCase(Locale.ROOT));
    }

    private static void getLowerCase(String string) {
        System.out.println("6  " + string.toLowerCase(Locale.ROOT));
    }

    private static void getEndWith(String string) {
        System.out.println("5  " + string.endsWith("cat"));
    }

    private static void getTrim(String string) {
        System.out.println("4  " + string.trim());
    }

    private static void getSubsString(String string) {
        System.out.println("3  " + string.substring(3));
    }

    private static void getCharAt(String string) {
        System.out.println("2  " + string.charAt(3));
    }

    private static void getConcat(String string) {
        System.out.println("1  " + string.concat(" is pretty"));
    }
}
