package ch31_Map;

import java.util.HashMap;

public class C05_clear_size_isEmpty {
/*
clear() yöntemi, bir Map nesnesinin içindeki tüm anahtar-değer çiftlerini siler ve haritayı boşaltır.
Yani, haritanın içeriği tamamen temizlenir ve harita içindeki eleman sayısı sıfıra eşitlenir.

size() yöntemi, bir Map nesnesindeki anahtar-değer çiftlerinin sayısını döndürür.
Yani, harita içindeki elemanların toplam sayısını verir.

isEmpty() yöntemi, bir Map nesnesinin boş olup olmadığını kontrol eder. Eğer harita içinde hiçbir anahtar-değer çifti yoksa,
bu yöntem true değerini döndürür. Aksi takdirde, false döndürür.

 */
    public static void main(String[] args) {
        HashMap<String, String> hm = new HashMap<>();

        hm.put("Apple", "250 $");
        hm.put("Samsung", "200 $");
        hm.put("Huawei", "150 $");
        hm.put(null, "125 $");
        hm.put("null", null);
        hm.put("Hp", "200 $");
        hm.put("Casper", "1000 $");
        hm.put("Casper", "101 $");//Dublicate Map key oldugu icin 101 $ oldu

        System.out.println("hm = " + hm);
//hm = {null=125 $, Apple=250 $, null=null, Hp=200 $, Casper=101 $, Samsung=200 $, Huawei=150 $}

        System.out.println("hm.size() = " + hm.size());
//hm.size() = 7

        System.out.println("hm.isEmpty() = " + hm.isEmpty());
//hm.isEmpty() = false

        hm.clear();

        System.out.println("hm.isEmpty() = " + hm.isEmpty());
//hm.isEmpty() = true

        System.out.println("hm.size() = " + hm.size());
//hm.size() = 0

    }
}
