package ch31_Map;

import java.util.HashMap;
import java.util.Map;

public class C10_remove {
/*
remove() yöntemi, belirtilen bir anahtara karşılık gelen değeri ve anahtarı kendisini haritadan kaldırmak için kullanılır.
 Eğer belirtilen anahtar haritada bulunmazsa, herhangi bir değişiklik yapılmaz ve bu yöntem null değeri döndürür.
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

        System.out.println("map.remove(\"Samsung\",\"200 $\") = " +
                map.remove("Samsung", "200 $"));
            //map.remove("Samsung","200 $") = true

        System.out.println("map.remove(null) = " +
                map.remove(null));
        //map.remove(null) = 125 $

        System.out.println("map = " + map);
        //map = {Apple=250 $, null=null, Hp=200 $, Casper=101 $, Huawei=150 $}


        System.out.println("map.remove(\"istanbul\") = " +
                map.remove("istanbul"));
        //map.remove("istanbul") = null


    }
}
