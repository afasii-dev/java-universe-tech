package main.arrays;

public class ToUpperCase {
    public static void main(String[] args) {

        stringArrayToUpperCaseV2();
        stringArrayToLowerCaseV2();}
    //5. Имплементировать метод, который будет перезаписывать каждое второе значение элемента массива в верхний регистр (toUpperCase()). Вывести результат в консоль.
    //6. Имплементировать метод, который будет перезаписывать каждое третье значение элемента массива в нижний регистр. Вывести результат в консоль.

    private static void stringArrayToLowerCaseV2() {
        String[] line = getLine();
        for (int i = 0; i < lineLenght(); i++){
            for (int j = 2; j < line[i].length(); j+=3) {
                line[i] = line[i].replace(line[i].substring(j, j+1), line[i].substring(j, j+1).toLowerCase());
            }
        }

        for (int i = 0; i < lineLenght(); i++){
            System.out.print(line[i] + " ");}
        System.out.println();
    }

        private static void stringArrayToUpperCaseV2() {
            String[] line = getLine();
            for (String element: line) {
                System.out.print(element + " ");
            }
            System.out.println();
            for (int i = 0; i < lineLenght(); i++){
                for (int j = 1; j < line[i].length(); j+=2) {
                    line[i] = line[i].replace(line[i].substring(j, j+1), line[i].substring(j, j+1).toUpperCase());
                }
            }

            for (int i = 0; i < lineLenght(); i++){
                System.out.print(line[i] + " ");}
            System.out.println();
        }

    private static String[] getLine(){
        String[] line = {"Mr. ", "Johns", "is  ", "in", " a   ", "WoNderFul ", "mood", " Today  "};
        return line;
    }

    private static int lineLenght() {
        String[] line = getLine();
        return line.length;
    }

}
