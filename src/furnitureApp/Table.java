package furnitureApp;

public class Table extends Furniture {

    @Override
    void clean() {
        if (super.getIsCleaned() == false) {
            System.out.println("Cleaning Table!");
            super.setIsCleaned(true);
        }
    }

    @Override
    boolean build() {
        return false;
    }
}
