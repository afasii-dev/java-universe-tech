package main.abstractHW;

public class Main {
    public static void main(String[] args) {
        HeavyWeight John = new HeavyWeight();
        MiddleWeight Zane = new MiddleWeight();
        LightWeight Frank = new LightWeight();

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