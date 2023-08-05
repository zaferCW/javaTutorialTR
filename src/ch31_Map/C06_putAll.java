package ch31_Map;

import java.util.HashMap;

public class C06_putAll {
/*
putAll() yöntemi, bir haritayı, başka bir haritaya veya bir Map nesnesine eklemek için kullanılır.
Bu yöntem, kaynak haritadaki tüm anahtar-değer çiftlerini hedef haritaya kopyalar. Eğer hedef harita
içinde önceden aynı anahtar varsa, o anahtarın eski değeri üzerine yazılır.
Eğer kaynak haritada olmayan yeni anahtarlar varsa, hedef haritaya bu anahtar-değer çiftleri eklenir.
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

        //task 2. bir map create ederek putAll methodu kullanip map leri print ediniz
        HashMap <String , String> hm1= new HashMap<>();

        hm1.put("kofteci " , "250 $");
        hm1.put("kebabci " , "200 $");
        hm1.put("cigerci " , "300 $");
        hm1.put("kelle paca " , "275 $");
        hm1.put("baklava " , "250 $");

        System.out.println("hm1 = " + hm1);
        //hm1 = {baklava =250 $, kebabci =200 $, kofteci =250 $, cigerci =300 $, kelle paca =275 $}

        hm.putAll(hm1);

        System.out.println("hm = " + hm);
//hm = {null=125 $, baklava =250 $, Apple=250 $, kebabci =200 $, null=null, kofteci =250 $,
// cigerci =300 $, Hp=200 $, Casper=101 $, kelle paca =275 $, Samsung=200 $, Huawei=150 $}

        System.out.println("hm1 = " + hm1);
  //hm1 = {baklava =250 $, kebabci =200 $, kofteci =250 $, cigerci =300 $, kelle paca =275 $}


        ///clean code
        HashMap <String , String> hm2= new HashMap<>( hm1);
        //hm2 hem create edildi hemde entry olarak hm1 map i parametre olarak atandi

        HashMap <String , String> hm3 = hm1;
        //hm3 tanimlandi map olarak ve hm1 map i atama yaoildi

        System.out.println("hm2 = " + hm2);
            //hm2 = {baklava =250 $, kebabci =200 $, kelle paca =275 $, kofteci =250 $, cigerci =300 $}

        System.out.println("hm3 = " + hm3);
        //hm3 = {baklava =250 $, kebabci =200 $, kofteci =250 $, cigerci =300 $, kelle paca =275 $}



     //CTE   HashMap < String , Integer > hm4= new HashMap<>( hm1) ;
        //data type lar uyusmadigi icin hm1 hm4 e atanamadi



    }
}
