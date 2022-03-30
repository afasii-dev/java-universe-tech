package main.oop.abstractClass;

public class Car extends Vehicle{
        String type;
        int year;

        public Car(String type, int year) {
            this.type = type;
            this.year = year;
        }

        @Override
        public void fuelType() {
            System.out.println("Gas!");
        }
    }
}
