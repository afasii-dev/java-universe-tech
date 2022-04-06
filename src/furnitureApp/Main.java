package furnitureApp;

public class Main {
    public static void main(String[] args) {
        Chair chair = new Chair();
        chair.setIsCleaned(false);
        chair.clean();
    }
}
