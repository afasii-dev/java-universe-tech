package main.arrays;

public class ArraysHomework {
    public static void main(String[] args) {
        foodLendth();
        foodConcat();
    }

    private static void foodLendth() {
        String[] foodName = {"Tomato", "Potatoes", "Onion", "Carrot"};
        int sum = 0;
        for (int i = 0; i < foodName.length; i++) {
            sum = sum + foodName[i].length();
        }
        System.out.println(sum);
    }


    private static void foodConcat() {
        String[] concatName = {"Tomato", "Potatoes", "Onion", "Carrot"};
        String sum = 0;
        for (String i = 0; i < concatName.length; i++) {
            sum = sum + concatName[i].length();
        }

    }
}