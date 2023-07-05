package ch15_Varargs;

import java.util.Arrays;

public class C01_Varargs {

    public static void main(String[] args) {
        /*
        VARARGS :dillerdeki  yuklem gelmemisse veya daha ornek cogaltilacaksa kullanildigi gibi javada da
        ayni sekilde kullanilir
        var----variety cesitlilik args---arguments
        SYNTAX ->
        mathodName(parametre1,parametre2, dataType... dataName) {
        method body....

        }

	        1) Method parametre parantezi icinde birden çok parametre varsa, varargs daima en sona tanımlanmalıdır

		    2) Method parametre parantezi icinde 1'den fazla varargs ifade TANIM-LA-NA-MAZZZ :

           Method'da  argument sayisi sabitse standart normal  method tanımlanmalı..
           ancak argument sayisi belirli değilse  VARARGS ifade tercih edilmeli

        */

        // Task -> verilen iki sayı toplamını print eden METHOD create ediniz

        int sayi1 = 99;
        int sayi2 = 15;
        int sayi3 = 55;
        int sayi4 = 35;

        topla(sayi1,sayi2);
        topla(sayi3,sayi4);

        // Task -> verilen üç sayı toplamını print eden METHOD create ediniz
        topla(sayi3,sayi4,sayi1);

        System.out.println(" *** varargs ile ***");
        toplaVarargs(sayi1, sayi2,sayi4,33 );
        toplaVarargs(sayi1, sayi2,sayi4,33,35 );
        toplaVarargs(sayi1, sayi2, sayi4, 33 , sayi3, sayi1,22 );

        // Task -> verilen String'lerin en fazla karaktere sahip olanı print eden
        // METHOD create ediniz ->>
        // parametre saysı belirli değil : varargs
        String str1 = "java";
        String str2 = "react";
        String str3 = "spring";
        String str4 = "next.js";
        String str5 = "aws";

        enFazlaKarakter(str1,str5);
        enFazlaKarakter(str1,str2,str3);
        enFazlaKarakter(str1,str5,str4,str3,str2);
        enFazlaKarakter(str1,str4,str3,str2);
    }
    private static void enFazlaKarakter(String... str) {
        String enFazlaKarakterli="" ;
        for (String w : str    ) {
            if (w.length()  > enFazlaKarakterli.length()){
                enFazlaKarakterli = w;
            }
        }
        System.out.println("enFazlaKarakterli = " + enFazlaKarakterli);
    }

    // private static void toplaVarargs(int... i, String s) { //Vararg parameter must be the last in the list
   // }

    private static void toplaVarargs(int... i) { //varargs method
        System.out.println(i);  //Implicit call to 'toString()' on array 'i'
        System.out.println("Arrays.toString(i) = " + Arrays.toString(i));

        int toplam = 0;
        for (int w : i  ) {
            toplam += w;
        }
        System.out.println("varrags ile sayilarin toplami " + toplam);
    }

    private static void topla (int s, int ss, int sss) {
        System.out.println("uc sayinin toplami " +(s + ss +sss));
    }

    private static void topla (int s, int d) {
        System.out.println("iki sayinin toplami " + ( s + d ) );
    }

}
