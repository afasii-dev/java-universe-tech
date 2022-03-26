import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Pink Floyd - Albums");
        while (true) {
            showMenu();
            showStore();
            System.out.println("---------------------");
        }
    }

    private static void showMenu() {
        String menu = """
                  1. The Dark Side of the Moon
                  2. The Wall
                """;
        System.out.println(menu);
    }

    private static void showStore() {
        int categoryId = getNumber();
        switch (categoryId) {
            case 1:
                showAlbum1();
                break;
            case 2:
                showAlbum2();
                break;
            default:
                System.out.println("No matches");
        }
    }

    private static void showAlbum1() {
        // The Dark Side of the Moon
        System.out.println("1. Speak to Me\n 2.	Breathe\n 3. On the Run\n 4. Time\n 5. The Great Gig in the Sky\n 6. Money\n 7. Us and Them\n 8. Any Colour You Like\n 9. Brain Damage\n 10. Eclipse");
        int album1 = getNumber();
        if (album1 == 1) {
            System.out.println("Speak to Me");
                } else if (album1 == 2) {
                    System.out.println("Breathe");
                } else if (album1 == 3) {
                    System.out.println("On the Run");
                } else if (album1 == 4) {
                    System.out.println("Time");
                } else if (album1 == 5) {
                    System.out.println("The Great Gig in the Sky");
                } else if (album1 == 6) {
                    System.out.println("Money");
                } else if (album1 == 7) {
                    System.out.println("Us and Them");
                } else if (album1 == 8) {
                    System.out.println("Any Colour You Like");
                } else if (album1 == 9) {
                    System.out.println("Brain Damage");
                } else if (album1 == 10) {
                    System.out.println("Eclipse");
                }
    }

    private static void showAlbum2() {
        System.out.println("1. In the Flesh?\n 2. The Thin Ice\n 3. Another Brick in the Wall\n 4. The Happiest Days of Our Lives\n 5. Another Brick in the Wall\n 6. Mother\n 7. Goodbye Blue Sky\n 8. Empty Spaces\n 9. Young Lust");
        int album2 = getNumber();
        if (album2 == 1) {
            System.out.println("In the Flesh?");
        } else if (album2 == 2) {
            System.out.println("The Thin Ice");
        } else if (album2 == 3) {
            System.out.println("Another Brick in the Wall");
        } else if (album2 == 4) {
            System.out.println("The Happiest Days of Our Lives");
        } else if (album2 == 5) {
            System.out.println("Another Brick in the Wall");
        } else if (album2 == 6) {
            System.out.println("Mother");
        } else if (album2 == 7) {
            System.out.println("Goodbye Blue Sky");
        } else if (album2 == 8) {
            System.out.println("Empty Spaces");
        } else if (album2 == 9) {
            System.out.println("Young Lust");
        }
    }

    private static int getNumber () {
            Scanner input = new Scanner(System.in);
            int number = input.nextInt();
            System.out.println();
            return number();
    }
}