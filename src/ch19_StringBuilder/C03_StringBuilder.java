package ch19_StringBuilder;

public class C03_StringBuilder {
    public static void main(String[] args) {

        //String ile StringBuilder karsilastirmasi

        /*
        Compare iki sb'i esit mi diye kontrol etmek icin
        ilk harften baslayarak tum karakterleri karsilastirir
        Ayni olan karakterler icin bir sey return etmezken
        farkli olan ilk karakter icin ascii tablosuna gore kac deger geride veya ileride
        oldugunu print eder
        Tamamen ayni ise bize 0 return eder

        bir sb ile bir String'i compare etmek istersek Java CTE verir
         */

        StringBuilder sb1 = new StringBuilder("javAslan");
        StringBuilder sb2 = new StringBuilder("javAslan");
        String s = "javAslan";

        System.out.println("sb1.compareTo(sb2) = " + sb1.compareTo(sb2));//sb1.compareTo(sb2) = 0

      //CTE  System.out.println("sb2.compareTo(s) = " + sb2.compareTo(s));

        System.out.println("sb1.equals(sb2) = " + sb1.equals(sb2)); //sb1.equals(sb2) = false

        //sb1 ve sb2 yi equals ile karsilastirip asil true alirsiniz
        System.out.println("sb1.toString().equals(sb2.toString()) = " +
                sb1.toString().equals(sb2.toString()));// //sb1.toString().equals(sb2.toString()) = true





    }
}
