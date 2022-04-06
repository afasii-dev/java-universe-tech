package furnitureApp;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Chair chair = new Chair();
        chair.setIsCleaned(true);
        chair.clean();


        ArrayList<Color> tableColors = new ArrayList<>();
        tableColors.add(Color.BLACK);
        tableColors.add(Color.WHITE);
        Table table = new Table();
        table.setColors(tableColors);
        table.showColors();

        Chair chair2 = new Chair("Wood", 150.25, Color.BLACK, true);
        System.out.println(chair2.toString());

    }


}
