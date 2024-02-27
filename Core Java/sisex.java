package JAVA;

import java.io.*;

class sisex {
    public static void main(String args[]) throws Exception {
        FileInputStream fin1 = new FileInputStream("/home/padmeshbhalla/Documents/fosprac.docx");
        FileInputStream fin2 = new FileInputStream("/home/padmeshbhalla/Documents/fosprac.docx");
        FileOutputStream fout = new FileOutputStream("/home/padmeshbhalla/Documents/fosprac.docx");
        SequenceInputStream sis = new SequenceInputStream(fin1, fin2);
        int i;
        while ((i = sis.read()) != -1) {
            fout.write(i);
        }
        sis.close();
        fout.close();
        fin1.close();
        fin2.close();
        System.out.println("Write Successful");
    }
}