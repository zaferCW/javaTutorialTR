package ch31_Map;

import java.util.HashMap;

public class C01_HashMap {
     /*  Map bir interface'dir. Map interface'inin 3 tane child class'i vardir

        1) HashMap: HashMap key-value yapisini kullanir. Key ve value   programci tarafindan yazilir.
        Key değeri benzersiz(unique) olmalı
                     dublicate kabul etnez
                     Key ve value'da null degeri kullanilabilir. Key'de  1'den fazla null degeri kullanilirsa
                      son kullanilan
                    null'i kabul eder. Value'da 1'den fazla null degeri kullanilabilir.
                    HashMap console'a yazdirildiginda hem key degerleri hem de value degerleri
                    aralarina = sembolu konularak yazdirilir
                    HashMap'ler tanımlanırken rastgele siralama yapar  HasMap map'ler arasinda en hizlisidir.
                    HashMap'ler "thread safe" degildir.
         */
    public static void main(String[] args) {

        HashMap <String , String> hm = new HashMap<>();
       // hm.put(); key ve value ekleme yapar map e

        hm.put("Apple"     ,     "250 $");
        hm.put("Samsung"   ,      "200 $");
        hm.put("Huawei"    ,      "150 $");
        hm.put( null        ,      "125 $");
        hm.put("null"      ,        null);
        hm.put("Hp"       ,       "200 $");
        hm.put("Casper"    ,        "1000 $");
        hm.put("Casper"    ,        "101 $");//Dublicate Map key oldugu icin 101 $ oldu

        System.out.println("hm = " + hm);
//hm = {null=125 $, Apple=250 $, null=null, Hp=200 $, Casper=101 $, Samsung=200 $, Huawei=150 $}






    }

}
