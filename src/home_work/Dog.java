package home_work;

public class Dog {
    public Dog() {
    }

    @Override
    public String toString() {
        return "      DOG:\n" +
                "whose = " + whose +
                " \nname  = " + name +
                " \nage   = " + age  +
                " \ncolor = " + color +
                "";
    }
    private String whose;
    private String name;
    private int age;
    private String color;

    public void setWhose(String whose) {
        if (whose == null) {
            System.out.println("Insert whose!");
        }
        this.whose = whose;
    }

    public void setName(String name) {
        if (name == null) {
            System.out.println("Insert name!");
        }
        this.name = name;
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

    public void voice() {
        System.out.println("GAF- GAF");
    }
    public void go(){
        System.out.println("Go!");
    }
    public void run(){
        System.out.println("FASSSSS");
    }
    public void stop(){
        System.out.println("STOPPPPP!");
    }

    public void picture() {
        System.out.println("__________________________11¶¶¶¶______________ \n" +
                "________________________1¶¶¶¶1¶¶1_____________ \n" +
                "________________________1_____________________ \n" +
                "_________________________111¶¶¶1______________ \n" +
                "_____________________1¶¶¶¶¶¶¶¶¶¶1___¶1________ \n" +
                "___________________111¶¶¶¶¶¶¶¶¶¶1___1¶¶_______ \n" +
                "________________11111¶¶¶¶11111¶¶111___¶¶______ \n" +
                "____________11111¶¶¶¶¶¶¶1111¶11¶¶¶¶¶1_________ \n" +
                "______1111¶¶¶11111¶¶¶¶¶¶111111¶¶111¶¶¶11______ \n" +
                "__111¶¶¶¶¶¶1_11¶¶1¶¶¶¶¶111¶¶¶1¶¶11¶11¶11______ \n" +
                "_1¶¶¶¶¶¶¶11111¶¶¶¶¶¶¶¶111111111111111¶¶1______ \n" +
                "1¶¶¶111___11¶¶¶¶¶¶¶¶1¶¶¶¶¶¶¶¶1¶¶1¶1¶1¶¶¶¶_____ \n" +
                "¶¶¶¶1__¶¶¶1111¶¶¶¶¶¶____¶¶¶11¶¶¶¶¶¶¶1¶¶¶¶1____ \n" +
                "¶¶¶__11_1¶¶111111¶¶¶1______1¶¶1¶¶____¶¶¶¶1____ \n" +
                "1¶___¶¶__¶¶¶1_11111¶¶¶¶¶¶¶¶¶1111¶¶¶1¶¶1¶¶11___ \n" +
                "_____¶¶¶__¶¶¶¶11111111111__1¶¶¶11¶¶¶¶¶¶¶111___ \n" +
                "_____1¶11_¶¶¶¶¶1¶11____11¶¶¶¶¶¶¶¶1__1¶¶¶¶111__ \n" +
                "________¶¶1_¶¶¶¶1¶_¶1111¶¶¶¶¶¶¶¶¶¶¶¶¶1__1¶¶11¶¶¶1_ \n" +
                "________1¶¶1¶¶¶¶_1¶1¶1¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶1___¶¶¶¶¶1_ \n" +
                "_______¶¶1¶¶¶___¶11¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶11¶¶¶¶¶1 \n" +
                "_______1¶¶__¶____¶11¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶11__ \n" +
                "_______1¶¶__1¶___1¶1¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶_____ \n" +
                "_______1¶¶_1__¶¶__¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶______ \n" +
                "________1¶¶____1¶__1¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶________ \n" +
                "________11¶¶_____¶¶__¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶__________ \n" +
                "_________¶11¶1_____111_11¶¶¶¶¶1¶¶¶1___________ \n" +
                "________1¶¶¶¶¶¶______11__1____1¶¶_____________ \n" +
                "_______1¶¶¶¶¶¶¶¶¶1______1¶¶¶¶¶¶1______________ \n" +
                "_______1111¶1¶¶¶¶¶¶¶¶¶11¶¶11¶¶¶¶______________ \n" +
                "_______¶111¶11111¶¶¶¶¶¶¶¶¶¶¶¶¶¶1______________ \n" +
                "______1¶¶11¶1111_1¶¶¶¶¶¶¶¶¶¶1¶¶¶______________ \n" +
                "_____11¶¶¶¶1111¶11____11¶¶¶111¶¶1_____________ \n" +
                "_____1111111111¶1111¶1¶111¶1¶¶¶¶¶_____________ \n" +
                "_____111111¶¶¶¶¶¶111¶111¶¶¶¶¶¶¶1¶_____________ \n" +
                "_____111¶1111¶¶¶¶¶¶1111¶¶¶¶¶¶¶¶1¶_____________ \n" +
                "_____1111¶1111¶¶¶¶111¶¶¶¶¶¶¶¶¶1¶¶_____________ \n" +
                "_____1_1111¶1¶11¶111¶¶1¶¶1¶11111¶1____________ \n" +
                "_____1_11111¶11111¶¶¶111¶11¶¶111¶1____________ \n" +
                "____111111111¶1111111_1111111111¶_____________ \n" +
                "_____11111¶¶11¶¶¶¶1___111111111¶1_____________ \n" +
                "_____111111¶11111¶11_11¶¶¶11111¶¶_____________ \n" +
                "____11111¶1111111¶1111¶¶¶¶¶¶¶1¶¶¶_____________ \n" +
                "____111111111¶11111111111111111¶¶_____________ \n" +
                "____¶¶111111¶11111__1111¶1111¶11¶¶____________ \n" +
                "____1¶11¶¶11¶¶1111_1111¶¶1¶¶¶11¶11____________ \n" +
                "1¶¶¶1¶111¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶11¶111111_____________ \n" +
                "__111111¶1¶¶¶¶¶¶¶¶¶¶¶¶¶¶11¶111¶¶¶1____________ \n" +
                "____1¶111__¶¶¶¶¶¶¶____¶¶11111¶¶¶¶¶____________ \n" +
                "____1¶¶11¶¶¶¶¶¶¶_______¶111¶¶¶¶¶¶¶¶___________ \n" +
                "____¶¶¶¶¶¶¶¶¶¶________1¶¶¶¶¶¶11¶¶¶¶¶1_________ \n" +
                "____¶¶¶¶¶¶¶¶1_________¶¶¶¶¶¶1__¶¶11¶¶1________ \n" +
                "____¶¶¶¶1____________1¶¶¶¶¶¶1__¶¶¶1¶¶¶________ \n" +
                "____¶¶¶¶1____________11¶¶¶¶¶11__1¶¶¶¶1________ \n" +
                "___11¶¶¶¶____________1¶1¶¶¶¶11________________ \n" +
                "__1¶¶¶¶¶¶____________1¶11¶¶¶¶1________________ \n" +
                "__11111¶1____________1¶11¶¶¶¶11_______________ \n" +
                "1¶1¶¶1¶¶¶____________¶1¶1¶¶1¶¶1_______________ \n" +
                "11¶1¶1¶¶¶____________1¶¶¶¶¶¶1¶1_______________ \n" +
                "_11_¶¶1________________111_1__________________");
    }
}
