
import java.util.Scanner;

public class BasicMaths {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // System.out.println("Enter number : ");
        // int n = in.nextInt();
        int n= 7789;

        countDigits(n);
        reverseNum(n);
        palindrome(n);
    }

    private static void countDigits(int n) {
        int count = (int) Math.log10(n) + 1;
        System.out.println("n has these number of digits: "+count);
    }

    private static void reverseNum(int n) {
        while(n>0){
            System.out.print(n%10);
            n/=10;
        }
    }
    
}
