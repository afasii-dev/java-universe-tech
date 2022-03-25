package arraysAndMethodsHomeWork;

import java.util.Locale;
import java.util.Scanner;

public class ArrayStringHomeWork {
    public static void main(String[] args) {
        while(true){
        system();
        }
    }

    private static void system() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter array length: ");
        int number = input.nextInt();
        number++;
        String[] string = new String[number];
        for (int i = 0; i < number; i++) {
            string[i] = input.nextLine();
        }
        if (number > 0){
            System.out.println("Choose method:\n   1) Arrays\n   2)toUpperCase\n   3)toTrim\n" +
                    "4)follow LIKE ");
            Scanner input2 = new Scanner(System.in);
            int l = input.nextInt();
            if (l == 1){
                for (int i = 0; i < number; i++) {
                    System.out.println(string[i]);
                }
            }else if (l == 2){
                for (int i = 0; i < string.length; i++) {
                    System.out.println(string[i].toUpperCase(Locale.ROOT));
                }
            }else if (l == 3) {
                for (int i = 0; i < string.length; i++) {
                    System.out.println(string[i].trim());
                }
            }else{
                System.out.println("╱╱┏╮╱╱╱╱╱╱╱╱╱╱\n" +
                        "╱╱┃┃╱╱┳╱┓┳╭┛┳┓\n" +
                        "▉━╯┗━╮┃╱┃┣┻╮┣╱\n" +
                        "▉┈┈┈┈┃┻┛┛┻╱┗┗┛\n" +
                        "▉╮┈┈┈┃▔▔▔▔▔▔▔▔\n" +
                        "╱╰━━━╯");
            }
        }
    }
}


