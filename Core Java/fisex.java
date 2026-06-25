package JAVA;

import java.io.FileInputStream;

public class fisex {
    public static void main(String args[]) {
        try {
            FileInputStream fin = new FileInputStream("/home/padmeshbhalla/Documents/fosprac.docx");
            int i = 0;
            while ((i = fin.read()) != -1) {
                // The methods returns the next byte of data, or -1 if the end of the file is
                // reached
                System.out.print((char) i);
            }
            fin.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
