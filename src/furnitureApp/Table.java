package furnitureApp;

import java.util.ArrayList;

public class Table extends Furniture {

    private ArrayList<Color> colors;

    public ArrayList<Color> getColors() {
        return colors;
    }

    public void setColors(ArrayList<Color> colors) {
        this.colors = colors;
    }

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
