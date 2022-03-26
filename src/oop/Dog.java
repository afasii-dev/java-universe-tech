package oop;

public class Dog {
    private String kind;
    private int weightInKg;
    private int heightInCm;
    private String color;

    public void stop() {
        System.out.println("It stopped when saw meat.");
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public int getWeightInKg() {
        return weightInKg;
    }

    public void setWeightInKg(int weightInKg) {
        this.weightInKg = weightInKg;
    }

    public int getHeightInCm() {
        return heightInCm;
    }

    public void setHeightInCm(int heightInCm) {
        this.heightInCm = heightInCm;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Dog() {

    }

    public Dog(String kind, int weightInKg, int heightInCm, String color) {
        this.kind = kind;
        this.weightInKg = weightInKg;
        this.heightInCm = heightInCm;
        this.color = color;
    }

    @Override
    public String toString() {
        return "kind : " + kind +
                "\nweightInKg : " + weightInKg +
                "\nheighthInCm : " + heightInCm +
                "\ncolor : " + color;
    }
}

