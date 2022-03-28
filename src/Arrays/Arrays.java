package Arrays;

public class Arrays {
    public static void main(String[] args) {

//        getLength();
//        getConcat();
//        getTrim();
//        getEndWith();
//        getToUpperCase();
//        getToLowerCase();
        getEquals();

    }

    private static void getEquals() {
        String[] letters = {"ABC", "DEF", "GHI"};
        String word = "ABC";
        int count = 0;
        for (int i = 0; i < letters.length; i++) {
            if (letters[i].equals(word)) {
                count++;
            }
            System.out.println("No matches");
        }
        System.out.println(count);
    }
}
