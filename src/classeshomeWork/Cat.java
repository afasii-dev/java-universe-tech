package classeshomeWork;

public class Cat {
    private String name;
    private String whose;
    private int age;
    private String color;

    public Cat(String name, String whose, int age, String color) {
        this.name = name;
        this.whose = whose;
        this.age = age;
        this.color = color;
    }

    public Cat() {

    }

    @Override
    public String toString() {
        return "      CAT:\n" +
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
        System.out.println("JUMPing-JUMPing");
    }
    public void voice(){
        System.out.println("Meow-meow");
    }
    public void stop(){
        System.out.println("______");
    }
    public void picture(){
        System.out.println("\n" +
                "______________88_____________88\n" +
                "_____________8888___________8888\n" +
                "___________888__88_________88__88\n" +
                "___________88____88_______88____88\n" +
                "__________88______888888888______88\n" +
                "_________88_______________________88\n" +
                "________88_________________________88\n" +
                "_______88_____888____________888____88\n" +
                "______88_____88088_____8____88088____88\n" +
                "______88______888_____888____888_____88\n" +
                "______88_____________88888___________88\n" +
                "________88_________________________88\n" +
                "__________88_______888___888_____88\n" +
                "____________888______88888____888\n" +
                "_______________888_________888\n" +
                "__________________888888888\n" +
                "_________________88_______88\n" +
                "________________88_________88\n" +
                "_______________88___________88\n" +
                "____________88888___________88888\n" +
                "__________88_____88_______88_____88\n" +
                "____¶¶¶¶¶¶88_____88¶¶¶¶¶¶¶88_____88¶¶¶¶¶¶¶\n" +
                "__¶¶¶¶¶___88_____88_______88_____88____¶¶\n" +
                "_¶¶¶___¶¶___88888___________88888____¶¶\n" +
                "¶¶¶______¶¶___________(_)____________¶¶\n" +
                "¶¶¶_______¶¶________(_)0(_)_________¶¶\n" +
                "_¶¶¶_____¶¶___________(_)__________¶¶\n" +
                "__¶¶¶___¶¶__________________________¶¶\n" +
                "___¶¶¶_¶¶____________________________¶¶\n" +
                "_¶¶¶¶¶¶¶__88_88_______________________¶¶\n" +
                "¶¶¶¶_¶¶___8_8_8_888__888_888_8_8_888___¶¶\n" +
                "_____¶¶___8_8_8_8_8__8_8_8_8_88__8_8___¶¶\n" +
                "_____¶¶___8_8_8_8_8__8_8_8_8_8_8_8_8___¶¶\n" +
                "______¶¶__8___8_888_88_8_888_8_8_888__¶¶\n" +
                "_______¶¶____________________________¶¶\n" +
                "________¶¶__________________________¶¶\n" +
                "_________¶¶_______________________¶¶\n" +
                "___________¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶");
    }
}
