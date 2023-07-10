package ch19_StringBuilder;

import java.time.LocalTime;

public class C01_StringBuilder {

    public static void main(String[] args) {
 /*
   String = > daha yavas ,Immutable==> degisemez,
   String'lerde method kullanarak String'i degistirmek atama yapmadan mumkun degildir.

   1) Java pass-by-value kullanir
   2) String Class'i immutable Class'dir.

    StringBuffer =mutable==>degisebilir,less efficient/ daha yavas ,
    StringBuffer synchronized,thread safe.

   StringBuilders = mutable==>degisebilir ,
   not senkronized/not thread safe,fakat more efficient(daha etkili,ve hizli )

   1) String Class'i immutable(Degistirilemez)dir. Java mutable Stringler uretebilmemiz icin
   StringBuilder isimli bir class uretmistir.
   2) Java'da StringBuilder ile hemen hemen ayni isi yapan bir de StringBuffer classi vardir.
   "StringBuffer" Class'i StringBuilder Class'indan daha once uretilmistir.
   "StringBuffer" yavas calisan bir class'dir, "StringBuilder" ise hizli calisir.
   "StringBuffer"  "synchronize" islemlerini yapabilir, ama "StringBuilder" yapamaz.
   3) Ayni anda bir cok isin yapilmasina "multi threading" denir. "multi" = Cok, "thread"= Yapilan islerin herbiri
  	Multi threading varsa, bu islerin siraya konulmasi lazim. Islerin siraya konulmasina "synchronization" denir.

				 */

        String str = "javAslan";
        System.out.println("method oncesi str = " + str);
        strBirlestir(str);
        System.out.println("method sonrasi str = " + str);

        // task -> 50 000 tekrarlı bir loop ile String ve StringBuilder obj run time
        // surelerini karsılatırın.

        String s = "a";
        StringBuilder sb1 = new StringBuilder("");

        LocalTime str1Basla = LocalTime.now();
        System.out.println("string obj basladi " + str1Basla);
        for (int i = 0; i <50000 ; i++) {
            s += i;
        }
        LocalTime str1Bitti = LocalTime.now();
        System.out.println("string obj bitti " + str1Bitti);

        System.out.println("fark " + (str1Bitti.getNano() - str1Basla.getNano()));

        LocalTime sb1Basla = LocalTime.now();
        System.out.println("string builder obj basladi " + sb1Basla);
        for (int i = 0; i <50000 ; i++) {
           sb1.append(i);
        }
        LocalTime sb1Bitti = LocalTime.now();
        System.out.println("string obj bitti " + sb1Bitti);

        System.out.println("fark " + (sb1Bitti.getNano() - sb1Basla.getNano()));


    }

    private static void strBirlestir(String str) {
        System.out.println(str+ " selam method dan");
    }
}
