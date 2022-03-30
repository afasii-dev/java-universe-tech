package oop;

public class test {
    public static void main(String[] args){
        Cat cat = new Cat();
        Dog dog = new Dog();
        Bird bird = new Bird();


        cat.name = ("pispis");
        cat.age = 2;
        cat.weight = 3;
        System.out.println("My cat's name "+ cat.name + ". It is " + cat.age + " years old. "+ "weigth is " +cat.weight );
        System.out.println("My cat can");
        cat.voice();
        cat.run();
        cat.go();
        cat.stop();
        System.out.println("--------------------------------");


        dog.name = ("Layka");
        dog.age = 2;
        dog.weight = 13;
        System.out.println("My dog's name "+ dog.name + ". It is " + dog.age + " years old. "+ "weigth is " +dog.weight );
        System.out.println("My dog can");
        dog.voice();
        dog.run();
        dog.go();
        dog.stop();
        System.out.println("--------------------------------");

        bird.name = ("Hirs");
        bird.age = 8;
        bird.weight = 150;
        System.out.println("bird's name "+ bird.name + ". It is " + bird.age + " years old. "+ "weigth is " +bird.weight );
        System.out.println("Bird can");
        bird.voice();
        bird.run();
        bird.go();
        bird.stop();
        System.out.println("--------------------------------");





    }
}
