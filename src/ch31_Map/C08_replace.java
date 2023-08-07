package ch31_Map;

import java.util.HashMap;
import java.util.Map;

public class C08_replace {
    /*
    replace() yöntemi, belirtilen bir anahtarın mevcut değerini başka bir değerle değiştirmek için kullanılır.
    Eğer belirtilen anahtar zaten haritada bulunuyorsa,
     bu yöntem eski değeri yeni değerle değiştirir. Eğer anahtar bulunmazsa, herhangi bir değişiklik yapmaz.

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

        System.out.println("map.replace(\"Apple\",\"500 $\") = " + map.replace("Apple", "500 $"));
            //map.replace("Apple","500 $") = 250 $

        System.out.println("map.replace(\"apple\" ,\"550 $\") = " + map.replace("apple", "550 $"));
        //map.replace("apple" ,"550 $") = null

        System.out.println("map = " + map);
        //map = {null=125 $, Apple=500 $, null=null, Hp=200 $, Casper=101 $, Samsung=200 $, Huawei=150 $}

      //  Q4174-Zeynep Aytop
      //  hocam 250 yi 550 ye replace edince, 250 döndürür ama değeri de 550 yapar.
      //      daha sonra 550 yi 1000'e replace edersek, 550 döndürür ama yeni değer 1000 olur

        //task replace methodu ile istedigniz bir key in value sunu update ediniz














    }
}
