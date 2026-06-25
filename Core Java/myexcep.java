package JAVA;

class MyException extends Exception {

    private static final long serialVersionUID = 1L;
    String str1;

    MyException(String str2) {
        str1 = str2;
    }

    public String toString() {
        return ("MyException Occurred: " + str1);
    }
}

public class myexcep {

    public static void main(String args[]) {
        try {
            System.out.println("Try block");
            throw new MyException(" error occured");
        } catch (MyException exp) {
            System.out.println("Catch Block");
            System.out.println(exp);
        }
    }

}
