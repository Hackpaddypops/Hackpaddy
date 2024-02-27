package JAVA;

public class sbuilderprac {

    public static void main(String[] argv)

    {

        StringBuilder str = new StringBuilder();

        str.append("Paddy");

        StringBuilder reverseStr = str.reverse();

        System.out.println("Reverse String = " + reverseStr.toString());

        str.appendCodePoint(44);
        System.out.println("Modified StringBuilder = " + str);
        System.out.println("String = " + str.toString());

        StringBuilder str1 = new StringBuilder("HCL Tech");

        System.out.println("String1 = " + str1.toString());

        StringBuilder str2 = new StringBuilder(10);

        System.out.println("String2 capacity = " + str2.capacity());

        StringBuilder str3 = new StringBuilder(str1);
        System.out.println("String3 = " + str3.toString());

    }

}