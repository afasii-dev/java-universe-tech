package StringMethods;

public class StringMethods {
    public static void main(String[] args) {
        String string = "Why did you choose Universe - Tech?";
        int a = 2;
        getRandomNumber();
        getLength(string);
        getCharAt(string);
        String orgName = getOrgName(string);
        System.out.println("-- Organization name: " + orgName);
        getStartsWith(string);
        getEndsWith(string);
        getContains(string);
        replaceString(string, " ", " ; ");

    }

    private static void replaceString(String string, String firstElement, String secondElement) {
        System.out.println("-- " + string.replace(firstElement, secondElement));
    }

    private static void getContains(String string) {
        System.out.println("-- " + string.contains("choose"));
    }

    private static void getEndsWith(String string) {
        System.out.println("-- " + string.endsWith("TECH"));
    }


    private static void getStartsWith(String string) {
        System.out.println("-- " + string.startsWith("Why"));
    }


    private static String getOrgName(String string) {
        return string.substring(19, 34);
    }

    private static void getCharAt(String string) {
        System.out.println("-- " + "19th index: " + "'" + string.charAt(19) + "'");
    }

    private static void getLength(String string) {
        System.out.println("-- String length: " + string.length());
    }

    private static void getRandomNumber() {
        int result = (int) (Math.random() * 2);
        System.out.println("-- Result: " + result);
        if (result == 0) {
            System.out.println("Because I want to learn IT.");
        } else if (result == 1) {
            System.out.println("It was random choose");
        }
    }
}
