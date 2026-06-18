
import java.util.Scanner;

public class BasicMaths {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // System.out.println("Enter number : ");
        // int n = in.nextInt();
        int n = 36;

        countDigits(n);
        reverseNum(n);
        palindrome(n);
        gcd(12, 15);
        armsStrongNum(153);
        printAllDivisors(n);
        primeNumber(n);
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

        //Best approach
        while (num1 != 0 && num2 != 0) {
            if (num1 > num2) {
                num1 %= num2;
            } else {
                num2 %= num1;
            }
        }
        if(num1 == 0){
            gcd = num2;
        } else
            gcd = num1;
        System.out.println("GCD is " + gcd);

    }

    private static void armsStrongNum(int i) {
        int digitCount = (int) Math.log10(i) + 1;
        int armNum = 0;
        int origNum = i;
        while(i>0){
            armNum += Math.pow((i%10), digitCount);
            i/=10;
        }
        if(origNum == armNum){
            System.out.println(origNum + " is an armstrong number.");
        } else
            System.out.println(origNum + " is not an armstrong number.");

    }

    private static void printAllDivisors(int n) {
        System.out.print(n + " is divisible by 1");
        for(int i = 2; i*i<n;i++ ){
            if(n%i==0){
                System.out.print(","+i);
                if(i != (n/i)){
                    System.out.print(","+n/i);
                }
            }
        }
        System.out.println(","+n+".");
    }

    private static void primeNumber(int n) {
        if(n<4){
            System.out.println(n + " is a prime number");
        } else{
            for(int i = 2; i*i<n;i++ ){
            if(n%i==0){
                System.out.println(n + " is not a prime number");
                return;
            }
        }
        }
        System.out.println(n + " is a prime number");
        
    }

}
