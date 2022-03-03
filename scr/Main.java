package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        while (true){
            int food = getPriceFromDataBase();
            dominoFastFood(food);
        }
    }
    private static int getPriceFromDataBase() {
        System.out.print("Введите сумму:$- ");
        Scanner input = new Scanner(System.in);
        int food = input.nextInt();
        return food;
    }
    private static int dominoFastFood(int food){
        if (food < 100){
            System.out.println("döner");
        }else if (food <=300){
            System.out.println("kebap");
        }else if (food <=500){
            System.out.println("Шаурма");
        }else {
            System.out.println("Пицца");
        }
        return food;
    }
}
