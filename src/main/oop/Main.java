package main.oop;

public class Main {
    public static void main(String[] args) {

        Human kiyom = new Human();
        kiyom.setName("Kiyom");
        kiyom.setAge(33);
        kiyom.setSex("Male");
        kiyom.setProfession("Tester");

        kiyom.go();
        kiyom.stop();

    }
}
