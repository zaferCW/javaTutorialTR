package ch03_ScannerClass_TypeCasting;

import java.util.Scanner;

public class C01_ScannerClass {

    public static void main(String[] args) {


        //Scanner bir Java Class'idir, bu Class'i kullanabilmek icin
        // "import" etmek gerekir.
        //Scanner Class'i Java nin util kutuphanesindedir.

        //  Scanner input = new Scanner(System.in);//bu kod yazildiginda Scanner class i kirmizi yazar import ister

        //kullaniicidan veri almak istedigimizde adimlar:
        //1. adim Scanner clasdan obj create edilir

        //2. adim kullaniciya ne istedgimiz sorulur yani input istenir
        //    System.out.println("sifreni gir");

        //3. adim kullanicinin girdigi yani istegimiz verinin data type ina gore containe create edilir
        ///     String sifre = input.nextLine().replaceAll("\\d","*");//Scanner class dan create edilen obj
        // kulllanilarak String data
        // type inda sifre isimli variable atama yapildi

        //System.out.println("sifreniz " +sifre.replaceAll("\\d","*"));
        //     System.out.println("sifreniz " +sifre);

        Scanner input = new Scanner(System.in);//1. adim

     //  System.out.println("sifreni gir"); //2. adim

     //  String sifre = input.nextLine(); //3. adim

     //  System.out.println(sifre.replaceAll("\\d", "*"));

        //  \\d regex ifadesi rakamlari simgeler digit demek

        // Task -> Kullanıcının girdiği değere göre kare alanı ve cevresini hesaplayan bir code
        // create ediniz...
        //trick soru Scanner objesi create etmeli miyiz?
        //edebiliriz fakat gereksiz bellekte yer isgali olur

     //   System.out.println("karenin kenarini gir");//kullaniciya kenar girme komutu verildi
//
     //   int kenar = input.nextInt();//kullanicinin girdigi integer deger kenar variable ina atama yapildi
//
     //   int alan = kenar * kenar ; //kenari carparak alan variable ina atandi
//
     //   int cevre = kenar * 4 ;//kenari 4 ile carparak cevre variable ina atandi
//
//
     //   System.out.println("alan = " + alan);
//
     //   System.out.println("cevre = " + cevre);


 /*
        TASK  Kullanicinın  gunde içtiği  cay ve kullandığı  seker değerine göre
         Bir yilda kac kg seker kullandigini hesaplayan bir code create ediniz...

         1 KUP seker = 1.7 gr
         Ornek : Input : cay sayisi : 10 seker sayisi :15
                 Output : yilda tukettigin seker miktari kg olarak = 93.075
                (3*2*1.7*365)/1000 kg  cikiyor
         */

    //   System.out.println("gunluk cay sayini gir");//kullaniciya komut girildi
    //   int caySayisi= input.nextInt();//kullanicinin girdigi deger atamasi yapildi

    //   System.out.println("cay a kac seker atarsin");
    //   int sekerSayisi = input.nextInt();//kullanicinin girdigi seker sayisi atamasi yapildi

    //   System.out.println("yilda ictigin cay sayisi = " +(365*caySayisi)  +
    //                "\n yilda tukettigin seker miktari kg olarak = "+ (caySayisi*sekerSayisi*1.7*365)/1000 );


        //task kullanicidan ismini alip ilk harfini yazdirin
        System.out.println("ismini gir");
        String name = input.nextLine();//ismin tamamini alip name variable atandi
        System.out.println("name = " + name);

        char ilkHarf = name.charAt(0);//kullanicinin girdigi isim in ilk harfi char variabla atandi
        System.out.println("ilkHarf = " + ilkHarf);

        System.out.println("name.length() = " + name.length());//kactane harften olustugu yazdirildi

        //task ismin son harfi yazdirin
        char sonHarf = name.charAt(name.length()-1);///ismin son harfini atamasi yapildi
        System.out.println("sonHarf = " + sonHarf);


    }



}
