
import java.util.Scanner;

public class BasicMaths {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // System.out.println("Enter number : ");
        // int n = in.nextInt();
        int n = 4624;

        countDigits(n);
        reverseNum(n);
        palindrome(n);
        gcd(12, 15);
    }

    private static void countDigits(int n) {
        int count = (int) Math.log10(n) + 1;
        System.out.println("n has these number of digits: " + count);
    }

    private static void reverseNum(int n) {
        int revNum = 0;
        while (n != 0) {
            if (revNum > Integer.MAX_VALUE || revNum < Integer.MIN_VALUE) {
                System.out.println(0);
                break;
            }
            revNum = (revNum * 10) + (n % 10);
            n /= 10;
        }
        System.out.println(revNum);
    }

    private static void palindrome(int n) {
        int revNum = 0;
        int origNum = n;
        while (n > 0) {
            int id = n % 10;
            revNum = (revNum * 10) + id;
            n /= 10;
        }
        if (origNum == revNum) {
            System.out.println(origNum + " is a palindrome");
        } else {
            System.out.println(origNum + " is not a palindrome");
        }

    }

    private static void gcd(int num1, int num2) {
        int gcd = 0;
        int min = 0;
        if (num1 > num2) {
            min = num2;
        } else {
            min = num1;
        }
        //Better approach
        for (int i = min; i >= 1; i--) {
            if (num1 % i == 0 && num2 % i == 0) {
                gcd = i;
                break;
            }
        }
        System.out.println("GCD of " + num1 + " and " + num2 + " is " + gcd);

    }

}
