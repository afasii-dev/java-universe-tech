package storeHomeWork;

import java.util.Scanner;

public class HomeWorkStore {
    public static void main(String[] args) {

        while (true) {
            showMenu();
            appleStore();
            System.out.println("----------------");
        }

    }

    private static void showMenu() {
        String menu = """
                   1) AirPods\n
                   2) Mac\n
                   3) iPhone\n
                   4) Apple Watch\n
                   5) Accessories\n
                   6)TV&Home\n
                   7) iPad \n
                """;
        System.out.println(menu);
    }

    private static void appleStore() {
        int categoryId = getNumber();
        switch (categoryId) {
            case 1:
                showAirPods();
                break;
            case 2:
                showMacBooks();
                break;
            case 3:
                showIphones();
                break;
            case 4:
                showWatches();
                break;
            case 5:
                showAccessories();
                break;
            case 6:
                showAppleHome();
                break;
            case 7:
                showIpad();
                break;
            default:
                System.out.println("Wrong category");
        }
    }

    private static void showIpad() {
        //Here iPad
        System.out.println(" 1)iPad mini\n 2)iPad Air\n 3)iPad Pro\n 4)iPad");
        int ipad = getNumber();
        if (ipad == 1) {
            System.out.println("Price 699$");
        } else if (ipad == 2) {
            System.out.println("Price 899$");
        } else if (ipad == 3) {
            System.out.println("Price 999$");
        } else if (ipad == 4) {
            System.out.println("Price 1499$");
        }
    }

    private static void showAppleHome() {
        //Here Apple Home
        System.out.println(" 1)Apple TV\n 2)HomePod mini");
        int appleTv = getNumber();
        if (appleTv == 1) {
            System.out.println("Price 149$");
        } else if (appleTv == 2) {
            System.out.println("Price 639$");
        }
    }

    private static void showAccessories() {
        //Here Apple Accessories
        System.out.println(" 1)MagSafe\n 2)Apple Watch bands\n 3)Apple Case");
        int appleAccessories = getNumber();
        if (appleAccessories == 1) {
            System.out.println("Price 400$");
        } else if (appleAccessories == 2) {
            System.out.println("Price 99$");
        } else if (appleAccessories == 4) {
            System.out.println("Price 199$");
        }
    }

    private static void showWatches() {
        //Here appleWatch;
        System.out.println(" 1)Apple Watch 7\n 2)Apple Watch Hermes\n 3)Apple Watch SE\n 4)Apple Watch 3");
        int appleWatch = getNumber();
        if (appleWatch == 1) {
            System.out.println("Price 399");
        } else if (appleWatch == 2) {
            System.out.println("Price 699$");
        } else if (appleWatch == 3) {
            System.out.println("Price 599$");
        } else if (appleWatch == 4) {
            System.out.println("Price 499$");
        }
    }

    private static void showIphones() {
        //Here iPhone
        System.out.println(" 1)iPhone SE\n 2)iPhone XR\n 3)iPhone 13\n 4)iPhone 13Pro mini\n 5)iPhone 13Pro\n 6)iPhone 13Pro Max");
        int iPhone = getNumber();
        if (iPhone == 1) {
            System.out.println("Price 599$");
        } else if (iPhone == 2) {
            System.out.println("Price 799$");
        } else if (iPhone == 3) {
            System.out.println("Price 1199$");
        } else if (iPhone == 4) {
            System.out.println("Price 1399$");
        } else if (iPhone == 5) {
            System.out.println("Price 1999$");
        } else if (iPhone == 6) {
            System.out.println("Price 2699$");
        }
    }

    private static void showMacBooks() {
        //Here Macs
        System.out.println("1)MacBook Air\n2)MacBook Pro\n3)Mac mini\n4)Mac Studio\n5)Mac Pro");
        int mac = getNumber();
        if (mac == 1) {
            System.out.println("Price 1599$");
        } else if (mac == 2) {
            System.out.println("Price 2999$");
        } else if (mac == 3) {
            System.out.println("Price 2199$");
        } else if (mac == 4) {
            System.out.println("Price 3499$");
        } else if (mac == 5) {
            System.out.println("Price 7899$");
        }
    }

    private static void showAirPods() {
        //Here AirPods
        System.out.println("1) AirPods2\n2) AirPods Pro\n3) Airpods3\n4)AirPods Max");
        int airPods = getNumber();
        if (airPods == 1) {
            System.out.println("Price 149$");
        } else if (airPods == 2) {
            System.out.println("Price 299$");
        } else if (airPods == 3) {
            System.out.println("Price 399$");
        } else if (airPods == 4) {
            System.out.println("Price 899$");
        }
    }

    private static int getNumber() {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        System.out.println();
        return number;
    }
}
