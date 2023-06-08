package ch07_StringManipulations;

import java.util.Scanner;

public class C04_contains {
    public static void main(String[] args) {

         /*
        String icersinde istenen stringin varlığını kontrol eder boolean return eder..

         */

        String str ="java ile gunler";

        System.out.println("str = " + str);

      //CTE  System.out.println("str.contains('java') = " + str.contains('j'));  parametere String olmali

        System.out.println("str.contains(\"java\") = " + str.contains("java"));//str.contains("java") = true

        System.out.println("str.contains(\"Java\") = " + str.contains("Java"));//str.contains("Java") = false
        //case sensitive oldugu buyuk kucuk harf e dikkat edilmezi

        System.out.println("str.contains(\" \") = " + str.contains(" "));//str.contains(" ") = true

        System.out.println("str.contains(\"\") = " + str.contains(""));//str.contains("") = true

        System.out.println("\"\".length() = " + "".length());//"".length() = 0


        // task-> girilen urunun var olup olmaidgini kontrol eden bir code create ediniz -> ternary kullanınız
        String buzDolap = "elma peynir yumurta zeytin bal kaymak";
        Scanner input = new Scanner(System.in);

        System.out.println("urun gir");
        String urun = input.nextLine();

        String result = buzDolap.contains(urun) ? "evet bu urun dolap ta var" : "bu urun dolab da yok" ;

        System.out.println("result = " + result);

        //TASK giirlen sifrenin dogru ise erisim izni verin yanlis ise vermeyin
        // ternary ile switch ile if ile yapiniz
        //contains methodu sifre kontrol islemlerinde KULLANILMAMALI

        String password = "123456789";//baslangicta banka da olan sifre atandi

        System.out.println("sifreni gir");
        String sifre = input.nextLine();

        if (sifre.contains(password)){
            System.out.println("you can log in");
        }else System.out.println(" you can not log in");

        //burada ki BUG i bulunuz
        //+ - karakter girildiginde de kabul eder
        //1234567890 olarak girersem de sifreyi kabul eder ama contains old için
        //1  girsem  erişim sağlarım

        String result2 = sifre.contains(password) ? "you can log in with ternary" : "bye bye happeness"  ;
        System.out.println("result2 = " + result2);

        switch (sifre) {
            case "123456789":
                System.out.println("you can log in via switch case");
                break;
            default:
                System.out.println("you entered wrong value");
                break;
        }
    }
}