package furnitureApp;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Chair chair = new Chair();
        chair.setIsCleaned(false);
        chair.clean();


        ArrayList<Color> tableColors = new ArrayList<>();
        tableColors.add(Color.RED);
        tableColors.add(Color.YELLOW);
        Table table = new Table();
        table.setColors(tableColors);
        table.showColors();

        Chair chair2 = new Chair("Wood", 150.25, Color.RED, true);
        System.out.println(chair2.toString());
    }
}
