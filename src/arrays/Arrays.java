package arrays;

import java.net.SocketOption;

public class Arrays {
    public static void main(String[] args) {
        
       countryLength();
       getConcat();
       metodTrim();
       metodEndWith();
       metodToUpperCase();
       metodToLowerCase();
    }

    public static void countryLength() {
        String[] myCountry = {"My", "country", "is", "Tajikistan"};
        int summaLength = 0;

        for (int i = 0; i < myCountry.length; i++){
            summaLength = summaLength + myCountry[i].length();
        }
        System.out.println("Summa Length: " + summaLength);
    }

    public static void getConcat() {
        String[] concatArray = { "Я стану программистом!", " Очень хорошим программистом!"};
        String resultConcat = "";

        for (int i = 0; i < concatArray.length; i++) {
            resultConcat = resultConcat.concat(concatArray[i]);
        }
        System.out.println("Concating " + resultConcat);
    }

    public static void metodTrim() {
        String[] trimArray = {"Читайте! ", " читайте! ", "еще раз читайте! "};

        for (int i = 0; i < trimArray.length; i++) {
            System.out.println("triming " +trimArray[i].trim());
        }
    }

    public static void metodEndWith() {
        String[] EndWithArray = {"nokia", " sony ", "apple"};

        for (int i = 0; i < EndWithArray.length; i++) {
            if (EndWithArray[i].endsWith("a")) {
                System.out.println("EndWith " +EndWithArray[i].trim());
            }
        }
    }


    public static void metodToUpperCase() {
        String[] result = {"Nokia", "Sony ", "Apple", "Lenovo", "fly"};

        for (int i = 1; i < result.length; i = i + 2)
            System.out.println("metodToUpperCase " + result[i].toUpperCase());
    }

    public static void metodToLowerCase() {
        String[] resultLover = {"NOKIA", "SONY ", "APPLE", "LENOVO", "fly"};

        for (int i = 1; i < resultLover.length; i = i + 2)
            System.out.println("metodToLowerCase " + resultLover[i].toLowerCase());
    }

}
