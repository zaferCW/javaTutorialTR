package ch31_Map;

import java.util.HashMap;

public class C02_keySet_values {
    /*
    keySet() yöntemi, harita içindeki tüm anahtarları içeren bir Set koleksiyonunu döndürür.
    Harita içindeki anahtarlar benzersizdir ve bu yöntem sayesinde onlara koleksiyon benzeri bir şekilde erişebiliriz.

    values() yöntemi de Map arabirimine aittir. Bu yöntem, harita içindeki tüm değerleri içeren bir Collection
     (genellikle ArrayList) koleksiyonunu döndürür. Harita içindeki değerler yinelenen olabilir
     ve bu yöntem sayesinde onlara koleksiyon benzeri bir şekilde erişebiliriz.
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
//hm = {null=125 $, Apple=250 $, null=null, Hp=200 $, Casper=101 $, Samsung=200 $, Huawei=150 $}

        //task = map in key ve value larini print ediniz

        System.out.println("hm.keySet() = " + hm.keySet());
        //hm.keySet() = [null, Apple, null, Hp, Casper, Samsung, Huawei]

        System.out.println("hm.values() = " + hm.values());
        //hm.values() = [125 $, 250 $, null, 200 $, 101 $, 200 $, 150 $]

        System.out.println("************* alt alta yazimi");
        for (String w : hm.keySet()   ) {
            System.out.print(w +" ");
        }//null Apple null Hp Casper Samsung Huawei

        System.out.println();

        for (String w :hm.values()     ) {
            System.out.print(w +" ");
        }//125 $ 250 $ null 200 $ 101 $ 200 $ 150 $

        //Tommy lee jones dan
        for (String w: hm.keySet()){
            System.out.println(w+" == "+hm.get(w));
        }







    }
}
