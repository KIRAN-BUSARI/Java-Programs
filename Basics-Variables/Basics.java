// import java.util.*;

public class Basics{
    public static void main(String args[]) {
        System.out.println("Hello World.....!!!");
        // int a = 120;
        // int b = 12;
        // float sum = a + b;
        // // int sum = a + b;
        // System.out.println(sum);

        // Scanner sc = new Scanner(System.in);

        // boolean bool = sc.nextBoolean();
        // System.out.println(bool);

        // short s = sc.nextShort();
        // System.out.println(s);

        //  Square Pattern
        for (int i = 5; i > 0; i--) {
            for (int j = 5; j > 0; j--) {
                System.out.print(" *");
            }
            System.out.println();
        }

        // Triangle Pattern
        // for (int i = 1; i <= 5; ++i) {
        //     for (int k = 1; k < i; ++k) {
        //         System.out.print("* ");
        //         }
        //     System.out.println();
        // }

        int a = 12;
        int b = 34;
        int c = a + b;
        System.out.println(c);
    }
}