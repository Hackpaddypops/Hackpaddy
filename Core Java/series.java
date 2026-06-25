package JAVA;

import java.util.*;

public class series {

    public static void main(String[] argh) {
        Scanner in = new Scanner(System.in);

        System.out.println("No of combinations you need?");
        int t = in.nextInt();
        int result = 0;
        for (int i = 0; i < t; i++) {
            System.out.println("Enter value of a: ");
            int a = in.nextInt();
            System.out.println("Enter value of b: ");

            int b = in.nextInt();
            System.out.println("Enter value of n: ");

            int n = in.nextInt();
            for (int j = 0; j < n; j++) {

                result += (Math.pow(2, j)) * b;
                int f = result + a;
                System.out.print(f + " ");
            }
            System.out.println();
            result = 0;

        }
        in.close();
    }

}
