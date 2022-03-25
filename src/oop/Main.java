package oop;

public class Main {
    public static void main(String[] args) {
        Cat chaus = new Cat();
        chaus.setKind("Хаус");
        chaus.setWeightInKg(3);
        chaus.setLengthInCm(80);
        chaus.setColor("Желтый, Коричневый");

        System.out.println(chaus.toString());
        chaus.go();
        System.out.println("_____________________________\n");

        Dog husky = new Dog();
        husky.setKind("Сибирский хаски");
        husky.setWeightInKg(20);
        husky.setHeightInCm(55);
        husky.setColor("Беллый, Чёрный, Серый");

        System.out.println(husky.toString());
        husky.stop();
        System.out.println("_____________________________\n");

        Bird straus = new Bird();
        straus.setKind("Африканский страус");
        straus.setWeight("До 175 кг");
        straus.setHeight("До 2.7 м");
        straus.setSpeedInKmH(50);

        System.out.println(straus.toString());
        straus.run();
        System.out.println("_____________________________");
    }

}
