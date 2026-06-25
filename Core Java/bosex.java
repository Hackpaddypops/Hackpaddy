package JAVA;

import java.io.*;

public class bosex {
    public static void main(String args[]) throws Exception {
        FileOutputStream fout = new FileOutputStream("/home/padmeshbhalla/Documents/fosprac.docx");
        BufferedOutputStream bout = new BufferedOutputStream(fout);
        String s = "Padmesh Bhalla";
        byte b[] = s.getBytes();
        bout.write(b);
        bout.flush();
        bout.close();
        fout.close();
        System.out.println("Write Successful");
    }
}
