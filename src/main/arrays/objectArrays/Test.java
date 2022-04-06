package main.arrays.objectArrays;

import main.oop.abstractClass.Car;
import main.oop.abstractClass.Truck;
import main.oop.abstractClass.Van;

public class Test {
    public static void main(String[] args) {
        Car[] carArray = new Car[3];
        carArray[0] = new Car();
        carArray[1] = new Car();
        carArray[2] = new Car();

        Truck truck = new Truck();
        Van van = new Van();

        truck.drive();
        van.leftAndRight();
        carArray[0].back();
        carArray[1].stop();
        carArray[2].drive();
    }
}
