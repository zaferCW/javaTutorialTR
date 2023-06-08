package ch07_StringManipulations;

public class C02_length {
    public static void main(String[] args) {
         /*
        length() methodu girilrn string'in uzunluğunu:içinde bulunan karakter sayısını return eder
        butun karakterleri(boşluk vs) sayıp adedini verir
         */

        String str = "clarusway ile java";
        System.out.println("str.length() = " + str.length());//str.length() = 18
        //method parantesi bos ise bu method parametresiz demektir

       int lengthOfStr= str.length();
        System.out.println("lengthOfStr = " + lengthOfStr);

        String str1 = "" ;
        System.out.println("str1.length() = " + str1.length()); // 0

        String str2 = " " ;
        System.out.println("str2.length() = " + str2.length());// 1

        String str3 = null ;
      //RTE  System.out.println("str3.length() = " + str3.length());
        //Method invocation 'length' will produce 'NullPointerException'
        //Exception in thread "main" java.lang.NullPointerException

      //RTE  System.out.println("str3.concat(str2) = " + str3.concat(str2));
        //Exception in thread "main" java.lang.NullPointerException

        String str4 = "null" ;
        System.out.println("str4.length() = " + str4.length());// str4.length() = 4
        System.out.println("str4 = " + str4);// str4 = null

        String str5 ;//atama yapilmamis bir variablle kulanilamaz
       //CTE System.out.println("str4.concat(str5) = " + str4.concat(str5));

    }
}
