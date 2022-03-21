package main.arrays.singleDimensionalArray;

public class hw {   
    public static void main(String[] args) {
        sumLength();
        concatArray();
        trimArray();
        endsWithA();
        uppArray();
        lowArray();
        findEquals();
    }

    private static String[] myArray(){
        String[] arr = {"Carola", " drank ", "the blood ", "as", " if", " she ", "were", " a ", "vampire."};
        return arr;
    }

    private static int arrLength() {
        String[] arr = myArray();
        return arr.length;
    }
    
    private static void sumLength() {
        int sum = 0;
        String[] arr = myArray();
        for (int i = 0; i < arrLength(); i++){
            sum += arr[i].length();
        }
        System.out.println("Sum:");
        System.out.println(sum);
        System.out.println();
    }
    
    private static void concatArray() {
        String[] arr = myArray();
        String res = "";
        for (int i = 0; i < arrLength(); i++){
            res = res.concat(arr[i]);
        }
        System.out.println("Concat Result:");
        System.out.println(res);
        System.out.println();
    }
    
    private static void trimArray() {
        String[] arr = myArray();
        System.out.println("Trimmed:");
        for (int i = 0; i < arrLength(); i++){
            System.out.println(arr[i].trim());
        }
        System.out.println();
    }
    
    private static void endsWithA() {
        String[] arr = myArray();
        System.out.println("Ends With A:");
        for (int i = 0; i < arrLength(); i++){
            if (arr[i].trim().endsWith("a")){
                System.out.println(arr[i].trim());
            }
        }
        System.out.println();
    }

    private static void uppArray() {
        String[] arr = myArray();
        System.out.println("Upped:");
        for (int i = 1; i < arrLength(); i+=2){
            arr[i] = arr[i].toUpperCase();
        }

        for (int i = 2; i < arrLength(); i++){
            System.out.print(arr[i]);
        }
        System.out.println();
    }

    private static void lowArray() {
        String[] arr = myArray();
        System.out.println("Lowed:");
        for (int i = 0; i < arrLength(); i+=3){
            arr[i] = arr[i].toLowerCase();
        }

        for (int i = 0; i < arrLength(); i++){
            System.out.print(arr[i]);
        }
        System.out.println();
    }
        
    private static void findEquals() {
        String[] arr = myArray();
        String var = "Drank";
        System.out.println("Equals:");
        for (int i = 0; i < arrLength(); i++){
            if (arr[i].trim().equalsIgnoreCase(var)){
                System.out.println(arr[i]);
            }
        }
    }

}