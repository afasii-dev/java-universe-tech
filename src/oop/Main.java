package oop;

public class Main {
    public static void main(String[] args) {
        Cat persianCat = new Cat();
        persianCat.setBreed("Persian cat");
        persianCat.setLifespan("12 - 17 years");
        persianCat.setColor("White");
        persianCat.setWeight(12);

        System.out.println(persianCat.toString());
        persianCat.voice();

        Dog bulldog = new Dog();
        bulldog.setBreed("Bulldog");
        bulldog.setLifespan("8 - 10 years");
        bulldog.setColor("Black");
        bulldog.setWeight(23);

        System.out.println(bulldog.toString());
        bulldog.run();

        Bird eagle = new Bird();
        eagle.setName("Eagle");
        eagle.setLifespan("20 years (in the wild)");
        eagle.setDivingSpeed("120 – 160 km/h");
        eagle.setWeight(5.5f);

        System.out.println(eagle.toString());
        eagle.fly();
    }
}