package ch31_Map;

import java.util.Hashtable;

public class C12_HashTable {
    /*
            HashTable ->
            HashMap'e kullanılan  tüm methodlar hashTable obj ile de call edilir.
            1- HashMap ve TreeMap thread-safe ve synchronized olmadıgı için Map'lar arasında thread-safe ve synchronize
            olam bir map'e ihityaç oldugundan Hashtable tanımlanmıştır.
            2-HashTable HashMap'e göre daha yavaştır
            3-HashTable key ve value'lerda null değere izin vermez.
            4-HashTable eleman atamsı yapılırken  HashMap randum(rastgele: hurra )  yapar.
             */

    /*
    HashTable, Java'da sunulan bir sınıftır ve Map arabirimini uygulayan bir veri yapısıdır.
     HashTable, anahtar-değer çiftlerini saklamak için kullanılır ve anahtarlara dayalı hızlı arama ve erişim sağlar.
    Eski bir veri yapısıdır ve genellikle HashMap gibi daha modern alternatifler kullanılsa da, hala kullanımı yaygındır.
     */
    public static void main(String[] args) {

        Hashtable <String , String> ht = new Hashtable<>();

        ht.put("Zeynep", "123456789");
        ht.put("fatih", "82875252885");
        ht.put("kemal", "282828282");
        ht.put("ali", "85283863");
        ht.put("iclal", "28282852852");
        ht.put("safak", "828282852");

        System.out.println("ht = " + ht);
      //  ht = {safak=828282852, Zeynep=123456789, fatih=82875252885, iclal=28282852852, ali=85283863, kemal=282828282}


        ht.put("null", "828282852");
     //RTE   ht.put(null, "828282852");
        //Exception in thread "main" java.lang.NullPointerException

        System.out.println("ht = " + ht);
        //ht = {safak=828282852, null=828282852, Zeynep=123456789, fatih=82875252885,
        // iclal=28282852852, ali=85283863, kemal=282828282}

        //task ikinci bir hastable create edeek putAll methodunu calisiniz
        Hashtable <String , String> ht2 = new Hashtable<>();
        ht2.put("zafer","654565121");
        ht2.put("omer","584585456");
        ht2.put("ziya","000000000");

        ht.putAll(ht2);

        System.out.println("ht = " + ht);
        //ht = {iclal=28282852852, zafer=654565121, Zeynep=123456789, null=828282852,
        // safak=828282852, kemal=282828282, omer=584585456, ziya=000000000, ali=85283863, fatih=82875252885}

    }
}
