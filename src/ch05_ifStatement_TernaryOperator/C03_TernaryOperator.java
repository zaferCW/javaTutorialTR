package ch05_ifStatement_TernaryOperator;

import java.util.Scanner;

public class C03_TernaryOperator {
 /*  Ternary ile yapilan tum islemler if-else blok ile de yapilabilir
        ternary tercih edilmesi yapinin basit okunabilir ve anlasilabilir olmasi içindir -> clean code
        Ternary icerisinde kompleks kodlar yerine dogrudan sonuç üreten veya sonucu veren
        daha basic code'lar bulunur.

        */

    public static void main(String[] args) {
        //Example 1: Bir sayinin pozitif olup olmadigini ekrana yazdiran kodu yaziniz

        int a = 3;

        if ( a > 0 ){
            System.out.println("sayi pozitif");
        }else {
            System.out.println("sayi negatif");
        }
        //ternary ile
       //CTE atama yapmak lazim  a>0 ? "pozitif" : "negatif" ;   Not a statement

        String sonuc = a >0 ? "pozitif"  : "negatif";
        System.out.println(sonuc);

        //atama yapmadan nasil kullanilir
        System.out.println("atama yapmadan sonuc");
        System.out.println( a>0 ? "pozitif" : "negatif" );

        //Example 2: Iki sayidan kucuk olani secen kodu yaziniz ternary kullaniniz
        int sayi1 = 23 ;
        int sayi2 = 53 ;

        int min = sayi1 > sayi2  ? sayi2 : sayi1 ; //Can be replaced with 'Math.min()' call

        System.out.println("min = " + min);//min = 23


    //Example 3: Verilen bir sayinin mutlak degerini hesaplayan kodu yaziniz
        //           Pozitif sayilarin ve sifirin mutlak degeri kendileridir.
        //           Negatif sayilarin mutlak degeri -1 ile carpilmis halleridir.

        int d = -1 ;

        int abs = d < 0 ?  ( -1*d )   :    ( d)    ;

        System.out.println("abs = " + abs);//abs = 1
        System.out.println("Math.abs(d) = " + Math.abs(d));//Math.abs(d) = 1


        //Example 4: Iki tane sayi ayni isaretli ise bu sayilari carpiniz, // return type int
        // farkli isaretli ise "Islem yapamam" mesaji veriniz             //return type String

        int e =  12;
        int f = -23;

      Object obj=  (e>0  && f>0 )  ||  (e<0 && f<0 )  ? (e*f) : "Islem yapamam"  ;
        // eger sartlar iki farkli deger return ediyorsa atamayi parent class dan yapmak gerekir
        System.out.println("obj = " + obj);


        // TASK01 -> girilen bir tamsayının tek-çift olmasını kontrol eden code create ediniz.

        Scanner input = new Scanner(System.in);
        System.out.println("bir sayi gir");

        int sayi = input.nextInt();

       //bu ne demek -> sayi % 2 == 0  sayinin 2 ye bolumunden kalan 0 mi demek
      String result=  sayi % 2 ==0 ? "cift sayi"   : "tek sayi "   ;
        System.out.println("result = " + result);

    }

}
