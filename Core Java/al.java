package JAVA;

import java.util.*;

public class al {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter Number of lines you need: ");
        int n = scan.nextInt();
        ArrayList<ArrayList<Integer>> x = new ArrayList<ArrayList<Integer>>();
        for (int i = 0; i < n; i++) {
            ArrayList<Integer> a = new ArrayList<Integer>();
            System.out.println("Enter Number of digits you will enter in this line: ");
            int d = scan.nextInt();
            for (int j = 0; j < d; j++) {
                System.out.println("This numbe will be entered at: " + i + " row and " + j + " column.");
                int v = scan.nextInt();
                a.add(j, v);

            }
            System.out.println(a);

            x.add(a);
            System.out.println(x);

        }
        System.out.println("Enter number of queries:");
        int q = scan.nextInt();
        

        for (int i = 0; i < q; i++) {
            System.out.println("Enter x index:");
            int c = scan.nextInt();
            System.out.println("Enter y index:");
            int y = scan.nextInt();
            try {
                System.out.println(x.get(c).get(y));
            } catch (Exception e) {
                System.out.println("ERROR!");
            }
        }
        scan.close();
    }

}
