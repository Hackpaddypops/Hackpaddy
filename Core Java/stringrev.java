package JAVA;

import java.util.*;

public class stringrev {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        char rev[] = new char[A.length()];
        char reverse[] = new char[A.length()];
        reverse = A.toCharArray();
        for (int i = reverse.length - 1, j = 0; i >= 0; i--, j++) {

            rev[j] = reverse[i];
        }

        if (Arrays.equals(rev, reverse)) {

            System.out.println("Yes");
        } else
            System.out.println("No");
        sc.close();
    }

}
