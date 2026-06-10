
import java.util.Scanner;

public class BasicMaths {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // System.out.println("Enter number : ");
        // int n = in.nextInt();
        int n= 4554;

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
            System.out.println(n%10);
            n/=10;
        }
    }

    private static void palindrome(int n) {
        int revNum = 0;
        int origNum = n;
        while(n>0){
            int id = n%10;
            revNum = (revNum*10)+id;
            n/=10;
        }
        if(origNum==revNum){
            System.out.println(origNum + " is a palindrome");
        }
            
    }
    
}
