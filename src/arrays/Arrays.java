package arrays;

import java.net.SocketOption;

public class Arrays {
    public static void main(String[] args) {
        
       countryLength();
       getConcat();
       methodTrim();
       methodEndWith();
       methodToUpperCase();
       methodToLowerCase();
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

    public static void methodTrim() {
        String[] trimArray = {"Читайте! ", " читайте! ", "еще раз читайте! "};

        for (int i = 0; i < trimArray.length; i++) {
            System.out.println("triming " +trimArray[i].trim());
        }
    }

    public static void methodEndWith() {
        String[] andWithArray = {"nokia", " sony ", "apple"};

        for (int i = 0; i < andWithArray.length; i++) {
            if (andWithArray[i].endsWith("a")) {
                System.out.println("EndWith " +andWithArray[i].trim());
            }
        }
    }


    public static void methodToUpperCase() {
        String[] result = {"Nokia", "Sony ", "Apple", "Lenovo", "fly"};

        for (int i = 1; i < result.length; i = i + 2)
            System.out.println("methodToUpperCase " + result[i].toUpperCase());
    }

    public static void methodToLowerCase() {
        String[] resultLover = {"NOKIA", "SONY ", "APPLE", "LENOVO", "fly"};

        for (int i = 1; i < resultLover.length; i = i + 2)
            System.out.println("methodToLowerCase " + resultLover[i].toLowerCase());
    }

}
