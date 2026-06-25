
public class Recursion {

    public static void main(String[] args) {
        nTimes(5);
    }

    private static void nTimes(int i) {
        int count = 0;
        System.out.println("nTimesNameRecursion");
        nTimesNameRecursion(i, count);
        System.out.println("printOneToN");
        printOneToN(i, ++count);
        System.out.println("printNToOne");
        printNToOne(i, 0);
        System.out.println("printOneToNBT");
        printOneToNBT(i, ++count);
        System.out.println("printNToOneBT");
        printNToOneBT(i, 0);
    }

    private static void printNToOneBT(int i, int count) {
        // Backtracking approach

        if (i == count) {
            return;
        }
        printNToOne(i--, count);
        System.out.println(i);
    }

    private static void printOneToNBT(int i, int count) {
        // Backtracking approach

        if (i == count) {
            return;
        }
        printNToOne(i, count--);
        System.out.println(count);
    }

    private static void printNToOne(int i, int count) {

        if (i == count) {
            return;
        }
        System.out.println(i);
        i--;
        printNToOne(i, count);
    }

    private static void printOneToN(int i, int count) {

        if (count == i) {
            return;
        }
        System.out.println(count);
        count++;
        printOneToN(i, count);
    }

    private static void nTimesNameRecursion(int i, int count) {

        if (count == i) {
            return;
        }
        System.out.println("Padmesh");
        count++;
        nTimesNameRecursion(i, count);
    }
}
