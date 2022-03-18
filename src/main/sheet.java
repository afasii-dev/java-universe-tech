package main;

public class sheet {
    public static void main(String[] args) {
        getiphone();

    }

    private static void getiphone() {
        String[] iphones = {"Iphone 11", "Iphone 12", "Iphone 13"};
        int phone = 0;

        for (int i = 0; i < iphones.length; i++) {
            phone = phone + iphones[i].length();

        }
        System.out.println(phone);

    }
}
