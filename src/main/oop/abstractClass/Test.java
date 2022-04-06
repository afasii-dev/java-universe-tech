package main.oop.abstractClass;

public class Test {
    public static void main(String[] args) {

        int[] intArray = new int[3];
        for (int i = 0; i < intArray.length; i++) {
//            System.out.println(intArray[i]);
        }

        Cat[] catArray = new Cat[3];
        catArray[0] = new Cat("Murzik", 1);
        catArray[1] = new Cat("Barsik", 2);
        catArray[2] = new Cat("Snejok", 3);

        for (int i = 0; i < catArray.length; i++) {
            catArray[i].voice();
        }

    }
}
