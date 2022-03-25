package arraysAndMethodsHomeWork;
import java.util.Locale;
import java.util.Scanner;

public class MethodNewHomeWork {
    public static void main(String[] args) {
        while (true) {
            menu();
            word();
        }
    }

    private static void word() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your sentence");
        String userName = input.nextLine();
        String abc = userName;
        Scanner input2 = new Scanner(System.in);
        System.out.println("Choose methods");
        int i = input.nextInt();
        switch (i) {
            case 1:
                System.out.println(abc.toUpperCase(Locale.ROOT));
                break;
            case 2:
                System.out.println(abc.toLowerCase(Locale.ROOT));
                break;
            case 3:
                System.out.println(abc.length());
                break;
            case 4:
                System.out.println(abc.trim());
                break;
            case 5:
                System.out.println(abc.concat(" + concat"));
                break;
            case 6:
                System.out.println(abc.substring(2));
                break;
            case 7:
                System.out.println(abc.endsWith("a"));
                break;
            case 8:
                System.out.println(abc.equals(1));
                break;
            case 9:
                System.out.println(abc.startsWith("a"));
                break;
            case 10:
                System.out.println(abc.indexOf(2));
                break;
            case 11:
                System.out.println(abc.isEmpty());
                break;
            case 12:
                System.out.println(abc.isBlank());
                break;
            case 13:
                System.out.println(abc.replace(" ", "hello"));
                break;
            case 14:
                System.out.println(abc.charAt(4));
                break;
            case 15:
                System.out.println(abc.contains("a"));
                break;
            default:
                System.out.println("ERROR");
        }
    }

    private static void menu() {
        String menu = """
                    Choose method:\n
                (1) toUpperCase\n 
                (2) toLowerCase\n
                (3) toLength\n
                (4) toTrim\n
                (5) toConcat\n
                (6) toSubsting\n
                (7) toEndWith\n
                (8) toEquals\n
                (9) toStarts\n
                (10) toIndexof\n
                (11) toIsEmpty\n
                (12) toIsBlank\n
                (13) toReplase\n
                (14) toCharAt\n
                (15) toContains
                """;
        System.out.println(menu);
    }
}
