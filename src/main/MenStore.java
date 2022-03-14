package main;

import java.util.Scanner;

public class MenStore {
    public static void main(String[] args) {
        System.out.println("*MEN'S STORE*");
        while (true) {
            showMenu();
            menStore();

        }
    }

    private static void showMenu() {
        String menu = """
                \n-MAIN MENU-
                 1) Jeans
                 2) Shoes
                 3) Shirts
                 4) Coats           
                """;
        System.out.println(menu);
    }

    private static void menStore() {
        int categoryId = getNumber();
        switch (categoryId) {
            case 1:
                showJeans();
                break;
            case 2:
                showShoes();
                break;
            case 3:
                showShirts();
                break;
            case 4:
                showCoats();
                break;
            default:
                System.out.println("Wrong input");
        }
    }

    private static void showJeans() {
        // JEANS
        System.out.println("JEANS:");
        System.out.println("1)Relaxed Jeans\n2)Loose Jeans\n3)Slim Jeans");
        int jeans = getNumber();
        switch (jeans) {
            case 1:
                System.out.println("Relaxed Jeans:\nChoose Your Color!");
                chooseYourJeansColor();
                break;
            case 2:
                System.out.println("Loose Jeans:\nPrice 90$");
                break;
            case 3:
                System.out.println("Slim Jeans:\nPrice 80$");
                break;
            default:
                System.out.println("Wrong input");
        }
    }

    private static void chooseYourJeansColor() {
        System.out.println("1)Blue\n2)White\n3)Black");
        int color = getNumber();
        System.out.println("Your Choice");
        switch (color) {
            case 1:
                System.out.println("Price 100$");
        }
    }

    private static void showShoes() {
        // SHOES
        System.out.println("SHOES:");
        System.out.println("1)Boots\n2)Sneakers\n3)Slippers");
        int shoes = getNumber();
        System.out.println("Your Choice");
        switch (shoes) {
            case 1:
                System.out.println("Boots:\nPrice 110$");
                break;
            case 2:
                System.out.println("Sneakers:\nPrice 105$");
                break;
            case 3:
                System.out.println("Slippers:\nPrice 50$");
                break;
            default:
                System.out.println("Wrong input");
        }
    }

    private static void showShirts() {
        // SHIRTS
        System.out.println("SHIRTS:");
        System.out.println("1)Regular Fit\n2)Slim Fit\n3)Relaxed Fit");
        int shirts = getNumber();
        System.out.println("Your Choice");
        switch (shirts) {
            case 1:
                System.out.println("Regular Fit:\nPrice 80$");
                break;
            case 2:
                System.out.println("Slim Fit:\nPrice 70$");
                break;
            case 3:
                System.out.println("Relaxed Fit:\nPrice 55$");
                break;
            default:
                System.out.println("Wrong input");
        }
    }

    private static void showCoats() {
        // COATS
        System.out.println("COATS: ");
        System.out.println("1)Wool-blend coat\n2)Cashmere-blend coat\n3)Water-repellent coat");
        int coats = getNumber();
        System.out.println("Your Choice");
        switch (coats) {
            case 1:
                System.out.println("Wool-blend coat:\nPrice 400$");
                break;
            case 2:
                System.out.println("Cashmere-blend coat:\nPrice 300$");
                break;
            case 3:
                System.out.println("Water-repellent coat:\nPrice 350$");
                break;
            default:
                System.out.println("Wrong input");
        }
    }

    private static int getNumber() {
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        System.out.println();
        return number;
    }
}