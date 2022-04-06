import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        String[] array = {"Beat", "Let", "Control", "The", "Body", "Your"};
        FileWriter fileWriter = new FileWriter("songName.txt");
        for (String string : array) {
            fileWriter.write(string.concat("\n"));
        }
        fileWriter.close();

        FileReader fileReader = new FileReader("songName.txt");
        Scanner scanner = new Scanner(fileReader);
        while (scanner.hasNext()) {
            System.out.println(scanner.nextLine());
        }
    }

}