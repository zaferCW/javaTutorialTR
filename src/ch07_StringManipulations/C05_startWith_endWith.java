package ch07_StringManipulations;

import java.util.Scanner;

public class C05_startWith_endWith {
    public static void main(String[] args) {

/**
 * startsWith()
 *  Metnin bas kisminin istenilen dizi ile eslesip eslesmedigini kontrol eder. Sonucu boolean dir.
 *  String'in basladigi characteri dogrular
 * endsWith()
 * Metnin son kisminin istenilen dizi ile eslesip eslesmedigini kontrol eder. Sonucu boolean dir.
 */

            String city = "Istanbul";

            // startsWith()
        System.out.println("city.startsWith(\"i\") = " + city.startsWith("i"));//city.startsWith("i") = false
        System.out.println("city.startsWith(\"Ist\") = " + city.startsWith("Ist"));//city.startsWith("Ist") = true
        System.out.println("city.startsWith(\"stanbu\") = " + city.startsWith("stanbu"));//city.startsWith("stanbu") = false

        System.out.println("city.startsWith(\"t\" , 3) = " + city.startsWith("t", 3));//city.startsWith("t" , 3) = false
        System.out.println("city.startsWith(\"t\", 2) = " + city.startsWith("t", 2));//city.startsWith("t", 2) = true
        // 2. parametre index i temsil eder. o index in girilen dizi ile baslayip baslamadigi kontrol ediilir

       // endsWith()
        System.out.println("city.endsWith(\"l\") = " + city.endsWith("l"));//city.endsWith("l") = true
        System.out.println("city.endsWith(\"bul\") = " + city.endsWith("bul"));//city.endsWith("bul") = true

        //iki string var. in kontrol edilmesi
        String str = "asd";
        System.out.println("city.endsWith(str) = " + city.endsWith(str));


        //Task -> girilen e-mail hesabının  @gmail.com ile  bitiyorsa "hesabınız onaylandı"
        // aksi durumda "geçerli hesap giriniz
        // print edn code creae ediniz.

        //note contains ile yaparsaniz true olur iceren herhangi bir karater girse true olur
        //bunu endsWith() ile yapiniz

        String mailSonu = "@gmail.com";//sistemde kayitli olan email hesabi sonu
        Scanner input = new Scanner(System.in);
        System.out.println("gmail ini gir");

        String gmail = input.next();

        if (gmail.endsWith(mailSonu)){
            System.out.println("hesabınız onaylandı");
        }else System.out.println("geçerli hesap giriniz");






    }
}
