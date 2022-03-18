package main.arrays.multidimensionalArray;


public class MuldimensionalArray {
    public static void main(String[] args) {

        int[][] array = {
                {0, 1}, //0
                {2, 3}, //1
        };

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.println(array[i][j]);
            }
        }
    }
}
