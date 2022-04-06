package main;

import java.util.Scanner;

public class GameStore {
    public static void main(String[] args) {
        System.out.println("\nGame Store*");
        while (true) {
            showMenu();
            GameStore();
        }
    }

    private static void showMenu() {
        String menu = """
                1) Action\n
                2) RPG\n
                3) Racing\n
                4)Fight\n
                5)Simulation\n
                """;
        System.out.println(menu);
    }

    public static void GameStore() {
        int categoryId = getNumber();
        switch (categoryId) {
            case 1:
                showAction();
                break;
            case 2:
                showRPG();
                break;
            case 3:
                showRacing();
                break;
            case 4:
                showFight();
                break;
            case 5:
                showSimulation();
                break;
        }
    }

    private static void showRPG() {
        //Here RPG
        System.out.println("1) Skyrim\n 2) Fallout 3\n 3) Dragon Age IV");
        int RPG = getNumber();
        if (RPG == 1) {
            System.out.println("Price 15.99$");
        } else if (RPG == 2) {
            System.out.println("Price 25.99$");
        } else if (RPG == 3) {
            System.out.println("Price 89.99$");
        }


    }

    private static void showRacing() {
        //Here Racing
        System.out.println("1) Need For Speed Rivals\n 2) Forza Horizon 4\n 3) The Crew\n");
        int Racing = getNumber();
        if (Racing == 1) {
            System.out.println("Price 49.99$");
        } else if (Racing == 2) {
            System.out.println("Price 39.99$");
        } else if (Racing == 3) {
            System.out.println("Price 69.99$");
        }

    }

    private static void showFight() {
        //Here Fight
        System.out.println("1) Mortal Kombat\n 2)Takken\n 3) Injustice: Gods Among Us\n");
        int Fight = getNumber();
        if (Fight == 1) {
            System.out.println("Price 59.99$");
        } else if (Fight == 2) {
            System.out.println("Price 29.99$");
        } else if (Fight == 3) {
            System.out.println("Price 79.99$");
        }

    }

    private static void showSimulation() {
        //Here Simulation
        System.out.println("1) Microsoft Flight Simulator\n 2) FIFA 2022\n 3) Cities Skyline\n");
        int Simulation = getNumber();
        if (Simulation == 1) {
            System.out.println("Price 99.99$");
        } else if (Simulation == 2) {
            System.out.println("Price 59.99$");
        } else if (Simulation == 3) {
            System.out.println("Price 49.99$");
        }
    }

    private static void showAction() {
        //Here Action
        System.out.println("1) Call of Duty\n 2) GTA V\n 3) Counter-Strike GO\n");
        int Action = getNumber();
        if (Action == 1) {
            System.out.println("Price 59.99$");
        } else if (Action == 2) {
            System.out.println("Price 29.99$");
        } else if (Action == 3) {
            System.out.println("Price 19.99$");
        }
    }


    private static int getNumber() {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        System.out.println();
        return number;
    }
}
