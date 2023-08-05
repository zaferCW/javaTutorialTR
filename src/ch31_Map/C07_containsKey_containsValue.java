package ch31_Map;

import java.util.HashMap;

public class C07_containsKey_containsValue {
/*
containsKey(Object key):
Bu yöntem, belirtilen anahtarın haritada bulunup bulunmadığını kontrol eder.
Eğer haritada böyle bir anahtar varsa true, yoksa false değeri döndürür.

containsValue(Object value):
Bu yöntem, belirtilen değerin haritada bulunup bulunmadığını kontrol eder.
 Eğer haritada böyle bir değer varsa true, yoksa false değeri döndürür.
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

        //task map de istedigiz key ve value nun olup olmadigini kontrol ediniz

        System.out.println("hm.containsKey(\"Apple\") = " + hm.containsKey("Apple"));
        //hm.containsKey("Apple") = true

        System.out.println("hm.containsKey(\"apple\") = " + hm.containsKey("apple"));
        //hm.containsKey("apple") = false

        System.out.println("hm.containsValue(\"250$\") = " + hm.containsValue("250$"));
        //hm.containsValue("250$") = false

        System.out.println("hm.containsValue(\"200 $\") = " + hm.containsValue("200 $"));
        //hm.containsValue("200 $") = true

        System.out.println("hm.containsValue(null) = " + hm.containsValue(null));
        //hm.containsValue(null) = true


    }
}
