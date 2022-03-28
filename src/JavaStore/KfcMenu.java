package JavaStore;

import java.util.Scanner;

public class KfcMenu {
        public static void main(String[] args) {

            while (true) {
                showMenu();
                chooseMenu();
                System.out.println("__________________________");
            }
        }

        private static void showMenu() {
            String menu = """
                1) Бургеры\n
                2) Курица\n
                3) Холодные напитки\n
                4) Горячие напитки\n
                5) Десерты\n
                """;
            System.out.println(menu);
        }

        private static void chooseMenu() {
            int categoryId = getNumber();
            switch (categoryId) {
                case 1:
                    showBurgers();
                    break;
                case 2:
                    showChickens();
                    break;
                case 3:
                    showColdDrinks();
                    break;
                case 4:
                    showHotDrinks();
                    break;
                case 5:
                    showDesserts();
                    break;
                default:
                    System.out.println("Empty ctegory");

            }
        }

        private static void showBurgers() {
            System.out.println("1) Чизбургер\n2) Чикенбургер\n3) БигМак\n4) МакЧикен");
            int burger = getNumber();
            switch (burger) {
                case 1:
                    System.out.println(" 1) Чизбургер - 69₽");
                    break;
                case 2:
                    System.out.println(" 2)  Чикенбургер -  79₽");
                    break;
                case 3:
                    System.out.println(" 3) БигМак - 99₽");
                    break;
                case 4:
                    System.out.println(" 4) МакЧикен - 109₽");
                    break;
                default:
                    System.out.println("Wrong");
            }
        }

        private static void showChickens() {
            System.out.println("1) Куриные крылышки\n2) Куриные стрипсы\n3) Наггетсы");
            int chicken = getNumber();
            switch (chicken) {
                case 1:
                    System.out.println(" 1) Куриные крылышки - 102₽");
                    break;
                case 2:
                    System.out.println(" 2) Куриные стрипсы - 189₽");
                    break;
                case 3:
                    System.out.println(" 3) Наггетсы - 80₽");
                    break;
                default:
                    System.out.println("Wrong");
            }
        }

        private static void showColdDrinks() {
            System.out.println("1) Pepsi\n2) Lipton\n3) Lemonade");
            int coldDrink = getNumber();
            switch (coldDrink) {
                case 1:
                    System.out.println(" 1) Pepsi - 50₽");
                    break;
                case 2:
                    System.out.println(" 2) Lipton - 30₽");
                    break;
                case 3:
                    System.out.println(" 3) Lemonade - 55₽");
                    break;
                default:
                    System.out.println("Wrong");
            }
        }

        private static void showHotDrinks() {
            System.out.println("1) Капучино\n2) Латте\n3) Чай");
            int hotDrink = getNumber();
            switch (hotDrink) {
                case 1:
                    System.out.println(" 1) Капучино - 89₽");
                    break;
                case 2:
                    System.out.println(" 2) Латте - 89₽");
                    break;
                case 3:
                    System.out.println(" 3) Чай - 49₽");
                    break;
                default:
                    System.out.println("Wrong");
            }
        }

        private static void showDesserts() {
            System.out.println("1) Донат\n2) Тарамису\n3) Чизкейк");
            int dessert = getNumber();
            switch (dessert) {
                case 1:
                    System.out.println(" 1) Донат - 69₽");
                    break;
                case 2:
                    System.out.println(" 2) Тирамису - 99₽");
                    break;
                case 3:
                    System.out.println(" 3) Чизкейк - 125₽");
                    break;
                default:
                    System.out.println("Wromg");
            }
        }

        private static int getNumber() {
            Scanner input = new Scanner(System.in);
            int number = input.nextInt();
            System.out.println();
            return number;
        }
    }