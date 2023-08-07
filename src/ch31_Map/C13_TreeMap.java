package ch31_Map;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class C13_TreeMap {
 /*
        TreeMap->
        1-TreeMap key'lrde null değer tanımlanamaz. Fakat value'larda null değer tanımlanabilir.
        2-TreeMap elemanlarının key NATUREL ORDER'a göre tanımlar.
        3-TreeMap synchronized ve thread-safe değildir
        4-TreeMap en yavaş map turudur.app hızı için kullanırken çooook dikkat edilmeli...
         */

    public static void main(String[] args) {
        TreeMap < Integer , String > tm = new TreeMap<>();
        tm.put(1000,"Omer");
        tm.put(1001,"emine");
        tm.put(1002,"eren");
        tm.put(1003,"derya");

        System.out.println("tm = " + tm);
        //tm = {1000=Omer, 1001=emine, 1002=eren, 1003=derya}

    //RTE    System.out.println("tm.put(null,\"Run time\") = " + tm.put(null, "Run time"));
        //Exception in thread "main" java.lang.NullPointerException


        Map<String, String> map = new HashMap<>();

        map.put("Apple", "250 $");
        map.put("Samsung", "200 $");
        map.put("Huawei", "150 $");
        map.put("Hp", "200 $");
        map.put("Casper", "1000 $");
        map.put("Casper", "101 $");

        System.out.println("map = " + map);
        //map = {Apple=250 $, Hp=200 $, Casper=101 $, Samsung=200 $, Huawei=150 $}

        //ikinci treemap create edildi
        TreeMap < String , String > tm1 = new TreeMap<>(map);

        System.out.println("tm1 = " + tm1);
        //tm1 = {Apple=250 $, Casper=101 $, Hp=200 $, Huawei=150 $, Samsung=200 $}


       //CTE TreeMap < String , String > tm2 = map;

        /**
         * Bu metot, belirtilen bir anahtarın veya anahtarın üstündeki en küçük anahtarı döndürür.
         * Yani, verilen bir anahtardan büyük veya eşit olan ilk anahtarı bulur.
         * Bu yöntem, sıralı bir haritada (örneğin, TreeMap) oldukça kullanışlıdır.
         */
        System.out.println("tm.ceilingKey(999) = " +
                tm.ceilingKey(999));//tm.ceilingKey(999) = 1000


        System.out.println("tm.ceilingKey(2000) = " +
                tm.ceilingKey(2000));
            //tm.ceilingKey(2000) = null


        //Ascending order, verilerin küçükten büyüğe doğru sıralandığı durumu ifade eder.
        //Descending order ise tam tersine, verilerin büyükten küçüğe doğru sıralandığı durumu ifade eder.

        System.out.println("tm.descendingKeySet() = " +
                tm.descendingKeySet());//tm.descendingKeySet() = [1003, 1002, 1001, 1000]


        System.out.println("tm.keySet() = " + tm.keySet());
        //tm.keySet() = [1000, 1001, 1002, 1003]

        System.out.println("tm.firstKey() = " + tm.firstKey());
        //tm.firstKey() = 1000

        System.out.println("tm.lastKey() = " + tm.lastKey());
        //tm.lastKey() = 1003

    }
}
