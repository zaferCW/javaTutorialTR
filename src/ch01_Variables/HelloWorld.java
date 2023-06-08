package ch01_Variables;

public class HelloWorld {

    public static void main(String[] args) {
        //JVM illk once static yapilari bulur calistirir.
        //eger static yapi sadece method da var ise once main methodu bulur run eder

        //konsola hello World yazdirin  comment line
        System.out.println("Hello World"); //bu code konsola yazdirma icin kullanilir

        //bu code iyi oldu yorum almak icin kullanildi
        /*
        yorumlariniz birden fazla satir olursa bu comment blck u kulnabilrisiniz


        ctrl+ d  bulundugunuz satiri bir alt satira dublicate eder
        ctrl+ d  bulundugunuz satiri bir alt satira dublicate eder


         */

        //TASK:  ad soyad yas memleket ve meslek print ediniz(console yazdırınız)
        System.out.println("ad soyad : zafer e");
        System.out.println("yas : 33");
        System.out.println("memleket : samsun");
        System.out.println("meslek : developer ");

        System.out.print("yanyana yazadirir print meth");
        System.out.print("yanyana yazadirir print meth");


            /*
     TRICK -> javada code satırı cümle(statement) sonuna mutlaka  ; koyulmalı
     code satırında kırmızı alt çizgi uyarısı "compile time error"
     CTE hatası uyarısı demektir.
     CTE düzeltimeden code yazılmaz yazılan code çalışmaz
    */


         /*
        TRICK ->
        print->   yazdırma işleminden sonraki komutu AYNI satırda devam ettirir.
        println-> yazdırma işleminden sonraki komutu ALT satırda devam ettirir.
        javada space "boşluk" bir character olarak tanımlanır

         */

        //sout yazip "enter a basarsaniz System.out.println(); methodu gelir
        /*
        ekrana bir sey yzdirmak icin iki yontem var
        1 println  --> koddan sonra alt satira iner
        2 print   --> alt satira inmez
         */


    }




}
