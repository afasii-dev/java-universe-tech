package oop;

public class Test {
    public static void main(String[] args){
        Cat cat = new Cat();
        Dog dog = new Dog();
        Bird bird = new Bird();


        cat.setName("pispis");
        cat.setAge(2);
        cat.setWeight(3);
        System.out.println("My cat's name "+ cat.getName() + ". It is " + cat.getAge() + " years old. "+ "weigth is " +cat.getWeight() );
        System.out.println("My cat can");
        cat.voice();
        cat.run();
        cat.go();
        cat.stop();
        System.out.println("--------------------------------");


        dog.setName("Layka");
        dog.setAge(2);
        dog.setWeight(13);
        System.out.println("My dog's name "+ dog.getName() + ". It is " + dog.getAge() + " years old. "+ "weigth is " +dog.getWeight() );
        System.out.println("My dog can");
        dog.voice();
        dog.run();
        dog.go();
        dog.stop();
        System.out.println("--------------------------------");

        bird.setName("Hirs");
        bird.setAge(8);
        bird.setWeight(150);
        System.out.println("bird's name "+ bird.getName() + ". It is " + bird.getAge() + " years old. "+ "weigth is " +bird.getWeight() );
        System.out.println("Bird can");
        bird.voice();
        bird.run();
        bird.go();
        bird.stop();
        System.out.println("--------------------------------");





    }
}
