package ch07_StringManipulations;

import java.util.Scanner;

public class C06_substring {
    public static void main(String[] args) {
/*
        substring()
        Metin icinde, istenilen araliktaki bir parcasina ya da butunune ulasilabilir. Sonuc ise String dir.
        substring(i)->Method'a parametre olarak girilen  index'den sona kadar olan parcayi return eder

        substring(baslangicIndexi, bitisIndexi)->Method'a parametre olarak girilen  baslangicIndexi'den bitis
        indexi'e kadar parçayı return eder
        baslangic indexi ==> inclusive/dahil
        bitis indexi ==> eclusive/haric
         */

        String str = "Çalıştıkça daha çok şey bilmediğimi farkediyorum" ;
        System.out.println("str.substring(0,5) = " + str.substring(0, 5));
        //ilk girilen parametre dahildir ikincir parametre dahil edilmez

        //asagidaki kod 10. index ten sonrasiniz alir
        System.out.println("str.substring(10) = " + str.substring(10));

        // TASK str datasının son 12 karakterini print ediniz...
       int sonOnIkiKarakterIndexi =str.length() - 12 ;

        System.out.println("sonOnIkiKarakterIndexi = " + sonOnIkiKarakterIndexi);//sonOnIkiKarakterIndexi = 36

        System.out.println("str.charAt(sonOnIkiKarakterIndexi) = " + str.charAt(sonOnIkiKarakterIndexi));//str.charAt(sonOnIkiKarakterIndexi) = f

        System.out.println("str.substring(sonOnIkiKarakterIndexi) = " + str.substring(sonOnIkiKarakterIndexi));// str.substring(sonOnIkiKarakterIndexi) = farkediyorum


        //TASK str datasının ilk 10 (on dahil) karakterini print ediniz..(sonuc olark ilk 10 karakterin hepsi
        System.out.println("str.substring(0,10) = " + str.substring(0, 10));//str.substring(0,10) = Çalıştıkça

        //TASK str datasının sadece ilk  karakterini print ediniz..
        System.out.println("str.substring(0,1) = " + str.substring(0, 1));//str.substring(0,1) = Ç


        //task -> girilen 4 harfli kelimeyi tersten yan yana print eden code create ediniz
        Scanner input = new Scanner(System.in);
        System.out.println("4 harfli bir kelime gir ");

        String str5 = input.next();

        if (str5.length() != 4){
            System.out.println("yanlis kelime girdin 4 harfli gireceksin");
        }else {
            System.out.print(str5.substring(str5.length() - 1));//son karakter alindi

            System.out.print(str5.charAt(str5.length()- 2 ));//sondan 1. karakter alindi
         //   System.out.print(str5.substring( ( str5.length() - 2 )  , ( str5.length() -1 )    ));

            System.out.print(str5.substring( ( str5.length() - 3 )  , ( str5.length() -2 )    ));
          //  System.out.println(str5.substring(1,2));

            System.out.println(str5.substring(0,1));

        }


    }
}
