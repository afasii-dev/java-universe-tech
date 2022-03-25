package arraysAndMethodsHomeWork;

import java.util.Scanner;

public class ArrayIntHomeWork {
    public static void main(String[] args) {
        while (true) {
            system();
        }

    }

    private static void system() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter array length: ");
        int number = input.nextInt();
        int[] array = new int[number];
        System.out.println("Insert array elements:");
        for (int i = 0; i < number; i++) {
            array[i] = input.nextInt();
        }
        if (number > 0) do {
            System.out.println("Choose:\n   1) LENGTH\n   2) ARRAYS");
            Scanner input2 = new Scanner(System.in);
            int i = input.nextInt();
            switch (i) {
                case 1:
                    System.out.println(" length : " + array.length);
                    break;
                case 2:
                    for (int j = 0; j < array.length; j++) {
                        System.out.println(array[j]);
                        break;
                    }
                    System.out.println();
            }
        } while (true);
    }
}
