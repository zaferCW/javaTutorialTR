package ch26_Exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class C02_FileInputException02 {
    public static final String R = "\u001B[35m";  //renklendirme icin

    public static void main(String[] args) {

        String filePath = "C:\\Users\\pc\\IdeaProjects\\JavaTutorialTR\\src\\javadanEsintiler";

        FileInputStream fis = null;
        try {
            fis = new FileInputStream(filePath);

            int c ;
         try {
            while ((c = fis.read()) != -1) {
                    System.out.print((char) c);
            }
             } catch (IOException e) {//dosya ya ulasilip okunamaz ise bu catch caliscak
                    System.out.println("dosya okunamiyor");
                    System.out.println("read methodu icineki catch"+ e.getMessage());

            }//bu kod input olarak verilen dosyadan son karaktere gelene kadar calis demek


        } catch (FileNotFoundException e) {//dosyaya ulasilamaz ise bu catch caliisir
            System.err.println("dosyaya ulasilamadi 404 not found");
            System.out.println(R+"dosya silinmis olabilir ");
        }

        System.out.println("tum dosya hatalari handle edildi");

        
    }


}
