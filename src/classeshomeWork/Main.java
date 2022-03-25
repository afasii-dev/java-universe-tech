package classeshomeWork;

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
        String  sx = scanner();
        switch (sx){
            case " ":
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
        String sx = scanner();
        switch (sx){
            case " ":
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
        String sx = scanner();
        switch (sx){
            case " ":
                dog.picture();
            default:
                System.out.println("ERROR");
        }
    }

    private static String scanner() {
        System.out.println("to view picture press 'space' :");
        Scanner in = new Scanner(System.in);
        String x = in.nextLine();
        return x;
    }
}

