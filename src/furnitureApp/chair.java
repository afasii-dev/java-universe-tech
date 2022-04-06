package furnitureApp;

public class chair extends furniture {
    @Override
    void clean() {
        if (super.getIsCleaned() == false) {
            System.out.println("Cleaning Chair!");
            super.setIsCleaned(true);
        } else {
            System.out.println("Chair is Clean!");
        }
    }

    @Override
    boolean build() {
        return false;
    }
}
