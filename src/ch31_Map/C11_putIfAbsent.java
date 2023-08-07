package ch31_Map;

import java.util.HashMap;
import java.util.Map;

public class C11_putIfAbsent {
/*
putIfAbsent() yöntemi, belirtilen bir anahtarın haritada bulunup bulunmadığını kontrol eder.
Eğer anahtar haritada yoksa, belirtilen değeri anahtarla ilişkilendirir ve haritaya ekler.
 Eğer anahtar zaten haritada varsa, hiçbir işlem yapmadan mevcut değeri döndürür.
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

        System.out.println("map.putIfAbsent(\"apple\",\"2500 $\") = " +
                map.putIfAbsent("apple", "2500 $"));

        System.out.println("map.putIfAbsent(\"Huawei\",\"1500 $\") = "
                + map.putIfAbsent("Huawei", "1500 $"));

        System.out.println("map.putIfAbsent(\"nokia\",\"100 $\") = " +
                map.putIfAbsent("nokia", "100 $"));


        System.out.println("map = " + map);
//map = {null=125 $, nokia=100 $, apple=2500 $, Apple=250 $, null=null, Hp=200 $,
// Casper=101 $, Samsung=200 $, Huawei=150 $}


    }
}
