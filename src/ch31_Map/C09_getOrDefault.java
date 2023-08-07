package ch31_Map;

import java.util.HashMap;
import java.util.Map;

public class C09_getOrDefault {

    /*
    getOrDefault() yöntemi, belirtilen bir anahtarın değerini alırken, eğer anahtar haritada
    bulunmuyorsa varsayılan bir değer döndürmek için kullanılır.
     Eğer anahtar haritada varsa, o anahtarın mevcut değerini döndürür.
     */
    public static void main(String[] args) {

        Map<String, String> map = new HashMap<>();

        map.put("Apple", "250 $");
        map.put("Samsung", "200 $");
        map.put("Huawei", "150 $");
        map.put(null, "125 $");
        map.put("null", null);
        map.put("Hp", "200 $");
        map.put("Casper", "1000 $");
        map.put("Casper", "101 $");//Dublicate Map key oldugu icin 101 $ oldu

        System.out.println("map = " + map);
        //map = {null=125 $, Apple=250 $, null=null, Hp=200 $, Casper=101 $, Samsung=200 $, Huawei=150 $}


        System.out.println("map.getOrDefault(\"Hp\",\"50000 $\") = " +
                map.getOrDefault("Hp", "50000 $"));
        //map.getOrDefault("Hp","50000 $") = 200 $

        System.out.println("map.getOrDefault(\"hp\",\"500000 $\") = " +
                map.getOrDefault("hp", "500 000 $"));
        //map.getOrDefault("hp","500000 $") = 500 000 $


    }
}
