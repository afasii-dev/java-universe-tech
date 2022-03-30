package abstractClass;

public class Main {
    public static void main(String[] args) {
        Bmw bmw = new Bmw();
        Koenigsegg koenigsegg = new Koenigsegg();
        Pagani pagani = new Pagani();

        bmw.gas();
        bmw.setModel("BMW M5 CS");
        bmw.brake();
        bmw.getColor("Black");
        bmw.getMaxSpeed(289);

        koenigsegg.gas();
        koenigsegg.setModel("Rivera");
        koenigsegg.brake();
        koenigsegg.getColor("RED");
        koenigsegg.getMaxSpeed(320);

        pagani.gas();
        pagani.setModel("Zonda R");
        pagani.brake();
        pagani.getColor("Blue");
        pagani.getMaxSpeed(370);
    }
}
