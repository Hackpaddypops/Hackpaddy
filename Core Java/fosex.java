package JAVA;

import java.io.FileOutputStream;

public class fosex {
    public static void main(String args[]) {
        try {
            FileOutputStream fout = new FileOutputStream("/home/padmeshbhalla/Documents/fosprac.docx");
            String s = "Padmesh Bhalla";
            byte b[] = s.getBytes();
            fout.write(b);
            fout.close();
            System.out.println("Write Successful");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}