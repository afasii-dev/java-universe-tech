package home_work;

public class Bird {
    private String name;
    private String whose;
    private int age;
    private String color;

    public Bird(String name, String whose, int age, String color) {
        this.name = name;
        this.whose = whose;
        this.age = age;
        this.color = color;
    }

    @Override
    public String toString() {
        return "      BIRD:\n" +
                "whose = " + whose +
                " \nname  = " + name +
                " \nage   = " + age  +
                " \ncolor = " + color +
                "";
    }

    public void setName(String name) {
        if (name == null) {
            System.out.println("Insert name!");
        }
        this.name = name;
    }

    public void setWhose(String whose) {
        if (whose == null) {
            System.out.println("Insert whose!");
        }
        this.whose = whose;
    }

    public void setAge(int age) {
        if (age < 0) {
            System.out.println("ERROR!!!");
        }
        this.age = age;
    }

    public void setColor(String color) {
        if (color == null) {
            System.out.println("Insert color");
        }
        this.color = color;
    }
    public void go(){
        System.out.println("Flying-FLYY");
    }
    public void voice(){
        System.out.println("Chirp -chirp");
    }
    public void stop(){
        System.out.println("______");
    }
    public void picture() {
        System.out.println("\n" +
                "__________________________________________________ \n" +
                "___________________________111¶111________________ \n" +
                "____________11__________1¶¶¶¶¶¶¶¶¶¶¶¶1____________ \n" +
                "______¶¶111¶¶¶¶¶¶1_____¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶1_________ \n" +
                "______1¶¶¶¶¶¶¶¶¶¶¶¶1__¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶1_______ \n" +
                "_________1¶¶¶¶¶¶¶¶¶¶¶1¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶1_____ \n" +
                "___________¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶____ \n" +
                "____1¶¶¶¶¶11¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶1_____111¶¶¶¶¶__ \n" +
                "___¶¶¶¶¶¶¶¶¶¶¶¶____11¶¶¶¶¶¶¶¶¶¶¶1_____________¶¶¶_ \n" +
                "__¶¶¶¶¶¶¶¶¶¶¶¶1_______1¶¶¶¶¶¶¶1___________________ \n" +
                "__¶¶¶¶¶¶¶¶¶¶¶¶¶__________¶¶¶¶1____________________ \n" +
                "__¶¶¶¶¶¶¶¶¶¶¶¶¶1__________1¶¶¶____________________ \n" +
                "__¶¶¶¶¶¶¶¶¶¶¶¶¶¶1__________1¶¶¶___________________ \n" +
                "__1¶¶¶¶¶¶¶¶¶¶111¶¶__________¶¶¶¶__________________ \n" +
                "___¶¶¶¶¶¶¶¶______¶¶¶_________¶¶¶1_________________ \n" +
                "___1¶¶¶¶1__________¶¶¶1______1¶¶¶1________________ \n" +
                "____¶¶¶¶_____________1¶¶¶¶____¶¶¶¶1_______________ \n" +
                "_____¶¶1________________1¶¶¶¶¶¶¶¶¶¶¶______________ \n" +
                "_____1¶1____________________¶¶¶¶¶¶¶¶¶1____________ \n" +
                "______¶¶_______________________1¶¶11¶¶¶___________ \n" +
                "_______¶1________________________¶¶__¶¶¶__________ \n" +
                "__________________________________¶1___¶¶¶________ \n" +
                "__________________________________¶¶____1¶¶_______ \n" +
                "___________________________________¶¶_____________ \n" +
                "__________________________________________________ ");
    }
}
