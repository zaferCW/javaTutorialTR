package ch31_Map.task31;

import java.util.HashMap;
import java.util.Map;

public class Task01 {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();

        map.put("Amazon",        230);
        map.put("Ebay",          301);
        map.put("Saturn",        326);
        map.put("MediaMarkt",    340);
        map.put("Apple Store",   320);

        // task -> urun fiyatları toplamını hesaplayan code create ediniz..
        int toplam =0;
        for (Map.Entry <String,Integer> each : map.entrySet() ) {
            toplam += each.getValue();

        }

        System.out.println("toplam = " + toplam);  //toplam = 1517



/*
fethiye hanim
double toplam=0;
        ArrayList<Integer> arrayList=new ArrayList<>(map.values());
        for (Integer w : arrayList) {
            toplam+=w;

        }
        System.out.println("toplam = " + toplam);.

        ahmet bey
        int top=0;
for (int value : map.values()) {
    top+=value;
}


System.out.println("top = " + top);
 */








    }
}
