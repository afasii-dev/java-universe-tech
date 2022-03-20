package main.arrays;

import java.util.Locale;

public class ArraysHW1 {
    public static void main(String[] args) {
        stringArrayLenghtSum();
        stringArrayConcat();
        stringArrayTrim();
        stringArrayEndsWith();
        stringArrayToUpperCase();
        stringArrayToLowerCase();
        stringArrayEquals();
    }

    private static void stringArrayEquals() {
        String[] line = getLine();
        String example = "today";
        for (int i = 0; i < lineLenght(); i++){
             if (line[i].trim().equalsIgnoreCase(example)){
                 System.out.println(line[i]);
             }
        }
    }

    private static void stringArrayToLowerCase() {
        String[] line = getLine();
        for (int i = 0; i < lineLenght(); i+=3){
            line[i] = line[i].toLowerCase();}

        for (int i = 0; i < lineLenght(); i++){
            System.out.print(line[i] + " ");}
        System.out.println();
    }

    private static void stringArrayToUpperCase() {
        String[] line = getLine();
        for (int i = 0; i < lineLenght(); i+=2){
            line[i] = line[i].toUpperCase();}

        for (int i = 0; i < lineLenght(); i++){
            System.out.print(line[i] + " ");}
        System.out.println();
    }


    private static void stringArrayEndsWith() {
        String[] line = getLine();
        for (int i = 0; i < lineLenght(); i++){
            if (line[i].trim().endsWith("a")){
                System.out.println(line[i]);}
        }
    }

    private static void stringArrayTrim() {
        String[] line = getLine();
        for (int i = 0; i < lineLenght(); i++){
            System.out.print(line[i].trim());
        }
        System.out.println();
    }

    private static void stringArrayConcat() {
        String[] line = getLine();
        String s = "";
        for (int i = 0; i < lineLenght(); i++){
            s = s.concat(line[i]);
        }
        System.out.println(s);
    }

    private static String[] getLine(){
        String[] line = {"Mr. ", "Johns", "is  ", "in", " a   ", "WoNderFul ", "mood", " Today  "};
        return line;
    }
    private static int lineLenght() {
        String[] line = getLine();
        return line.length;
    }
    private static void stringArrayLenghtSum() {
        int sum = 0;
        String[] line = getLine();
        for (int i = 0; i < lineLenght(); i++){
            sum += line[i].length();
        }
        System.out.println(sum);
    }
}
