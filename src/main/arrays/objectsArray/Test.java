package main.arrays.objectsArray;

import main.oop.abstractClass.Cat;

public class Test {
    public static void main(String[] args) {

        Cat[] catArray = new Cat[3];
        catArray[0] = new Cat("Murzik", 1);
        catArray[1] = new Cat("Barsik", 2);
        catArray[2] = new Cat("Snejok", 3);

        for (int i = 0; i < catArray.length; i++) {
            catArray[i].voice();
        }

//        for (инициализация; условие; итерация) {
//            //actions
//        }

//
        for (Cat cat : catArray) {
            cat.voice();
        }
//
//        for (тип и название :название массива){
//            //actions
//        }


    }
}
