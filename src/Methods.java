import java.util.Locale;

public class Methods {

    public static void main(String[] args) {
        String statement = "Epistola nоn erubescit ";
        String translate = "Бумага всё стерпит";
        getLength();
        getConcat();
        getCharAt();
        getSubstring();
        getTrim();
        getEndsWith();
        getToUpperCase();
        getEquals();

    }

    private static void getToUpperCase(String statement) {
        System.out.println(statement.toUpperCase());
        System.out.println(statement.toLowerCase());
    }

    private static void getEquals(String statement, String translate) {
        if (statement.equals(translate)) {
            System.out.println("The string is equal");
        } else {
            System.out.println("The string is not equal");
        }
    }

    private static void getLength(String statement) {
        System.out.println(statement.length());
    }

    private static void getConcat(String statement, String translate) {
        System.out.println(statement.concat(translate));
    }

    private static void getCharAt(String statement) {
        System.out.println(statement.charAt(4));
    }

    private static void getSubstring(String translate) {
        System.out.println(translate.substring(7, 10));
    }

    private static void getTrim(String statement) {
        System.out.println(statement.trim());
    }

    private static void getEndsWith(String statement) {
        if (statement.endsWith("a")) {
            System.out.println(statement);
        } else {
            System.out.println("FAILED!");
        }
    }
}