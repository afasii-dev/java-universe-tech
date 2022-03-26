package oop;

public class Bird {
    private String kind;
    private String weight;
    private String height;
    private int speedInKmH;

    public void run() {
        System.out.println("I run very fast.");
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public int getSpeedInKmH() {
        return speedInKmH;
    }

    public void setSpeedInKmH(int speedInKmH) {
        this.speedInKmH = speedInKmH;
    }

    public Bird() {

    }

    public Bird(String kind, String weight, String height, int speedInKmH) {
        this.kind = kind;
        this.weight = weight;
        this.height = height;
        this.speedInKmH = speedInKmH;
    }

    @Override
    public String toString() {
        return "kind : " + kind +
                "\nweigh : " + weight +
                "\nheight : " + height +
                "\nspeedInKmH : " + speedInKmH;
    }
}
