package furnitureApp;

import java.util.ArrayList;

public class Table extends Furniture {

    private ArrayList<Color> Colors;

    public ArrayList<Color> getColors() {
        return Colors;
    }

    public void setColors(ArrayList<Color> Colors) {
        this.Colors = Colors;
    }

    @Override
    void clean() {
        if (!super.getIsCleaned()) {
            System.out.println("Cleaning Table!");
            super.setIsCleaned(true);
        }
    }

    @Override
    boolean build() {
        return false;
    }

    public void showColors(){
        System.out.println("Colors Available:");
        for (Color color : getColors()) {
            System.out.println(color);
        }
    }
}
