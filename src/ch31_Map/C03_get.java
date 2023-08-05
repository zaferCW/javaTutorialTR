package ch31_Map;

import java.util.HashMap;

public class C03_get {
    /*
    get() yöntemi, bir harita içinde belirtilen anahtarın karşılık gelen değerini elde etmek için kullanılır.
     Eğer verilen anahtar haritada bulunmazsa, null değeri döndürür.

     */
    public static void main(String[] args) {

        HashMap<String, String> hm = new HashMap<>();
        // hm.put(); key ve value ekleme yapar map e

        hm.put("Apple", "250 $");
        hm.put("Samsung", "200 $");
        hm.put("Huawei", "150 $");
        hm.put(null, "125 $");
        hm.put("null", null);
        hm.put("Hp", "200 $");
        hm.put("Casper", "1000 $");
        hm.put("Casper", "101 $");//Dublicate Map key oldugu icin 101 $ oldu

        System.out.println("hm = " + hm);

        // task get methodu ile istedignz bir elemani (value) print ediniz

        System.out.println("hm.get(\"Apple\") = " + hm.get("Apple"));//hm.get("Apple") = 250 $

        System.out.println("hm.get(\"Xaoime\") = " + hm.get("Xaoime"));//hm.get("Xaoime") = null

        System.out.println("hm.get(12) = " + hm.get(12));//hm.get(12) = null
        //'HashMap<String, String>' may not contain keys of type 'Integer'

    }
}
