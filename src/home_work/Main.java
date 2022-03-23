package home_work;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        while(true){
        dog();
        cat();
        bird();
        scanner();

        }
    }

    private static void bird() {
        Bird bird = new Bird("Jellow","Mom's",1,"Yellow");
        System.out.println(bird);
        int sx = scanner();
        switch (sx){
            case 1:
                bird.picture();
            default:
                System.out.println("ERROR");
        }
    }

    private static void cat() {
        Cat cat = new Cat();
        cat.setAge(4);
        cat.setColor("white");
        cat.setName("lis");
        cat.setWhose("Mine");
        System.out.println(cat);
        int sx = scanner();
        switch (sx){
            case 1:
                cat.picture();
            default:
                System.out.println("ERROR");
        }
    }

    private static void dog() {
        Dog dog = new Dog();
        dog.setName("Vaka");
        dog.setAge(3);
        dog.setColor("black");
        dog.setWhose("Sister's");
        System.out.println(dog);
        int sx = scanner();
        switch (sx){
            case 1:
                dog.picture();
            default:
                System.out.println("ERROR");
        }
    }

    private static int scanner() {
        System.out.println("to view picture insert '1' :");
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        return x;
    }
}

