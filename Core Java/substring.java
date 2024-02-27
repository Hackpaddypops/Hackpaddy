package JAVA;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class substring {

    public static String getSmallestAndLargest(String s, int k) {
        ArrayList<String> a = new ArrayList<String>();
        for (int i = 0; i <= (s.length() - k); i++) {

            a.add(s.substring(i, i + k));
        }
        Collections.sort(a);
        int j = a.size() - 1;
        String smallest = a.get(0);
        String largest = a.get(j);
        
        

        return smallest + "\n" + largest;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();

        System.out.println(getSmallestAndLargest(s, k));
    }
}