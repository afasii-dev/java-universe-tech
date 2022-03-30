package main.abstractt;

public class Main {
    public static void main(String[] args) {
        Athlete1 John = new Athlete1();
        Athlete2 Zane = new Athlete2();
        Athlete3 Frank = new Athlete3();

        John.warmUp();
        John.pushUps();
        John.place();

        Zane.warmUp();
        Zane.pushUps();
        Zane.place();

        Frank.warmUp();
        Frank.pushUps();
        Frank.place();
    }
}