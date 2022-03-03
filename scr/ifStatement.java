import java.util.Scanner;

public class ifStatement {
    public static void main(String[] args) {
        runProgram(); runProgram(); runProgram();
        runProgram(); runProgram(); runProgram();
        runProgram(); runProgram(); runProgram();

    }

    private static void runProgram() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Country codes");
        int code = scan.nextInt();

        if (code == 992)
            System.out.println("Tajikistan");

        else if (code == 7) {
            System.out.println("Russia");
        }
        else if (code == 1) {
            System.out.println("USA");
        } else if (code == 93) {
            System.out.println("Afghanistan");
        } else if (code == 61) {
            System.out.println("Australia");
        } else if (code == 86) {
            System.out.println("China");
        } else if (code == 996) {
            System.out.println("Kyrgyzstan");
        } else if (code == 966) {
            System.out.println("Saudi Arabia");
        } else {
            System.out.println("NO CODE MATCHING: " + code);
        }
    }
}

