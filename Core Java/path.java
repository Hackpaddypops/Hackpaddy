package JAVA;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.*;
import java.util.List;

public class path {
    public static void main(String[] args) throws IOException {
        Path p = Paths.get("/home/padmeshbhalla/Documents/fosprac.docx");
        System.out.println(p.getParent());
        System.out.println(p.getNameCount());
        System.out.println(p.isAbsolute());
        System.out.println(p.toString());
        System.out.println(p.getRoot());
        System.out.println(p.getName(0));
        System.out.println(p.subpath(0, 2));
        System.out.println(p.getFileName());
        System.out.println(p.toAbsolutePath().toString());
        
        Charset cs = Charset.forName("ISO-8859-1");
      try {
         List<String> lines = Files.readAllLines(p, cs);
         for (String line : lines) {
            System.out.println(line);
         }
      } 
      catch (IOException e) {
         System.out.println(e);
      }
     }
}
