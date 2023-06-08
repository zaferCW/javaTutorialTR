package ch03_ScannerClass_TypeCasting;

import java.util.Scanner;

public class C02_TypeCasting {
    public static void main(String[] args) {
        /*
		 byte < short < int < long < float < double
			Auto Widening Casting -> Kucuk data type'larini buyuk data typlearina Java  otomatik olarak yapar.

		 */
        //Type Casting: Bir numeric data type'ini diger numeric data type'ina cevirmek demektir.
        //              byte < short < int < long < float < double
        //Note 1: Kucuk data type'ini buyuk data type'ine cevirmeye "Auto Widening" denir
        //Note 2: Buyuk data type'ini kucuk data type'ine cevirmeye "Explicit Narrowing" denir

        boolean basariliMi = true;
       //CTE  String basari = basariliMi; dogal uyum olmadigi icin hata verir
        String basari = String.valueOf(basariliMi);//boolean olan bir degeri Stringe cevrildi
        System.out.println("basari = " + basari);//basari = true


        double d = 17 ;//double container ina  int olan 17 degeri atandi Auto Widening yapildi

        System.out.println("d = " + d);// 17.0

        int sayi1 = 33;
        int sayi2 = 4;

        System.out.println("sayi1/sayi2 = " + (sayi1 / sayi2));//sayi1/sayi2 = 8
        //Zeynep Aytop => sonuç tamsayı olmasada int olduğu için virgül sonrasını vermez
        /*
        java iki int sayiyi biribirine böldugunuzde sonucu int verir
         eğer bölme işleminde ondalık sonuç çıkarsa ondalık kısmı siler
         */

        byte by = 127 ;
        int number = by; // kucuk kutuyu buyuk kutuya ekledik

        int num = 123;
        double d1 = 14;
        double d2  = d1/num ;
        System.out.println("d2 = " + d2);//d2 = 0.11382113821138211


        double db1 = 14.66;
        int i = (int) db1;  //buyuk olan kutu kucuk olan kutuya eklenmeye calisildi

        int num3 = 150;
        byte by1 = (byte) num3  ;

        System.out.println("by1 = " + by1);//by1 = -106
        //Ali byte 127ye kadar olani sayar sonra basa doner -128 den tekrar baslar


        /* task->
         * Kullanicidan bir character girmesini isteyin ve
         * girilen karakteri ve ascii degerini yazin
         *
         * Ornek : Input  : a
         *         Output : Girdiginiz ‘a’ karakterinin ascii degeri : 97
         */

        //1. adim
        Scanner input = new Scanner(System.in);//kullanicidan veri alabilmek icin Scanner objes create edildi

        //2. adim
        System.out.println("bir karakter gir");//kullaniciya komut verildi

        //3. adim
        char ch = input.nextLine().charAt(0);//kullanicinin girdigi ifadenin ilk karakteri alinip char variable a atandi
        //tek bir karakter alinabilmesi icin charAt() methodu kullanildi


        //4. adim
        System.out.println("ch = " + (ch+0));
        //char variable i bir sayi ile toplanirsa sonuc tam sayi olur

        //4. adim 2. yol
        System.out.println("ch = " +  ch);
        System.out.println("ch = " + (int) ch);


        //extra ascii degeri bulma methodu
        String str = "a";//tek karakter girilirse hashCode() methodu ile bualunabilir ascii degeri
        System.out.println("str.hashCode() = " + str.hashCode());//str.hashCode() = 97


    }
}
