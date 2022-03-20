import java.util.Scanner;

public class SweetShop {
    public static void main(String[] args) {
        while (true) {
            System.out.println("Welcome to SweetShop!");
            showMenu();
            itemPrice();
        }
    }

    private static void showMenu() {
        String menu = """
                Choose Item:
                1.Cake
                2.Pastry
                3.Chocolate
                """;
        System.out.println(menu);
    }

    private static void itemPrice() {
        int category = getNumber();
        switch (category) {
            case 1:
                cake();
                break;
            case 2:
                pastry();
                break;
            case 3:
                chocolate();
                break;
            default:
                System.out.println("Error");
        }
    }


        private static void chocolate () {
            String chocoPrice = """
                    100g - 3.5$
                    500g - 14.99$
                    1kg  - 25.99$
                    """;
            System.out.println(chocoPrice);
        }

        private static void pastry () {
            String pastryPrice = """
                    Croissant - 2.0$
                    Baguette - 1.7$
                    Eclair - 0.55$
                    Macaron - 1.0$
                    """;
            System.out.println(pastryPrice);
        }

        private static void cake () {
            String cakePrice = """
                    Chocolate Cake - 26$
                    Cheesecake - 32$
                    Tiramisu  - 35$
                    Berries Cake - 30$
                    """;
            System.out.println(cakePrice);
        }

        private static int getNumber () {
            Scanner input = new Scanner(System.in);
            int number = input.nextInt();
            System.out.println();
            return number;
        }
    }