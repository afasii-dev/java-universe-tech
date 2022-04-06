package furnitureApp;

public class Chair extends Furniture {

    @Override
    void clean() {
        if (super.getIsCleaned() == false) {
            System.out.println("Cleaning Chair!");
            super.setIsCleaned(true);
        } else {
            System.out.println("Chair is clean");
        }
    }

    @Override
    boolean build() {
        return false;
    }
}
