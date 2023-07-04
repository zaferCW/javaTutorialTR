package ch14_ForEachLoop;

import java.util.ArrayList;
import java.util.List;

public class C03_forEachLoop {

    public static void main(String[] args) {
        // task-> iki string array eleamanlarının ortak olmasını kontrol eden varsa
        // ortaklari yazdiran code create ediniz.. with for-each

        String [] arr1 = {"zerrin" , "fatih" ,"mustafa" ,"zeynep","iclal" ,"musa" , "kasim" ,"john"};
        String [] arr2 = {"christina" , "bale" ,"mustafa" ,"zeynep","iclal" ,"moossa" , "reese" ,"angel"};

        List<String> ortakIsimler = new ArrayList<>();

        for (String str1 : arr1   ) {
            for (String str2 : arr2     ) {
                if (str1.equalsIgnoreCase(str2)){
                    ortakIsimler.add(str1);
                }
            }
        }

        if (ortakIsimler.isEmpty()){
            System.out.println("ortak isim yok " +ortakIsimler);
        }else System.out.println("ortakIsimler = " + ortakIsimler);


    }
}
