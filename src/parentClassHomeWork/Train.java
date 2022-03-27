package parentClassHomeWork;

public class Train extends Vehicle {
    @Override
    public void start(){
        System.out.println("1)start Train");
    }
    @Override
    public void stop(){
        System.out.println("2)stop Train");
    }
    @Override
    public void action(){
        System.out.println("3)action Train");
    }
    @Override
    public void message(){
        System.out.println("4)message Train\n-------------");
    }
}
