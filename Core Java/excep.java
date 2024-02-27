package JAVA;

public class excep {

    public static void main(String args[]) {
        try {
            int a = 30, b = 0;
            int c = a / b;
            System.out.println("Result = " + c);
        } catch (ArithmeticException e) {
            System.out.println("Can't divide a number by 0");
        }

        try {
            int a[] = new int[5];
            a[6] = 9;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Index is Out Of Bounds");
        }
    }

}
