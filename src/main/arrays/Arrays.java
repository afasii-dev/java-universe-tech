package main.arrays;

public class Arrays {

    public static void main(String[] args) {
//        1) Массив (Array) - это переменная, в которую можно положить сразу несколько значений.
//        2) Все элементы массива имеют одинаковый тип.
//        3) При создании пустого массива присваиваются значения в зависимости от типа данных.
//        4) Размер массива нельзя изменить после его создания.


        int[] intArray = {55, 14, 109, 453}; // Значения
//                       [0,  1,  2,   3  ];  индексы значений

        String[] stringArray = {"BBL", "Rustam", "SEGA", "Shahzod"};

//      to get element at index 0:
        System.out.println("Первый элемент массива intArray : " + intArray[0]);
        System.out.println("Первый элемент массива stringArray : " + stringArray[0]);


        boolean[] children = new boolean[2];
//      boolean[] children = {false, false}; элементы по умолчанию, когда создаем новый массив
        System.out.println(children[0]);

//        default values depending on variable type:
//        int - 0
//        float, double - 0.0
//        String - null
//        char - /0
//        boolean - false

        int[] testArray = new int[3];
//      int[] testArray = {0,0,0}

//        testArray[0] = 5;
//        testArray[1] = 6;
//        testArray[2] = 7;
//      int[] testArray = {5,6,7}

//        -----------------------------------------

        boolean[] boolArray = new boolean[11];
        System.out.println("Array lenght : " + boolArray.length);
        int length = boolArray.length;

        for (int i = 0; i < length; i = i + 2) {
            System.out.println("Привет из цикла : " + i);
            boolArray[i] = true;
        }

        for (int i = 0; i < length; i++) {
            System.out.println(i);
            System.out.println(boolArray[i]);
        }

//        boolArray[11] = true; - Index out of bounds exception


//        -------------------------------

//    String methods:
//    lenght();
//    concat();
//    charAt();
//    subString();
//    trim();
//    endsWith();
//    toUpperCase();
//    toLowerCase();
//    equals();


        String[] myArray = {" I ", " Love ", " Java "};
        String string = "";
        for (int i = 0; i < myArray.length; i++) {
            System.out.println(myArray[i]);
            myArray[i] = myArray[i].trim();
            System.out.println(myArray[i]);
        }
    }
}
