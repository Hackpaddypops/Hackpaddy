package JAVA;

import java.util.*;

class datatype {
    public static void main(String[] argh) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int a = 2147483647;
        long b = 9223372036854775807L;

        for (int i = 0; i < t; i++) {

            try {
                long x = sc.nextLong();
                System.out.println(x + " can be fitted in:");
                if (x >= -128 && x <= 127)
                    System.out.println("* byte");
                if (x >= -32768 && x <= 32767)
                    System.out.println("* short");
                if (x >= (-a - 1) && x <= a)
                    System.out.println("* int");
                if (x >= (-b - 1) && x <= b)
                    System.out.println("* long");
            } catch (Exception e) {
                System.out.println(sc.next() + " can't be fitted anywhere.");
            }
            sc.close();
        }
    }
}
