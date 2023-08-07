package ch31_Map.task31;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Task04 {

    public static void main(String[] args) {
        //TaskSahaf.txt->   TreeMap Kullanarak Bir cumlenin içindeki karakterlerin frekansını(adetini)
        // hesaplayıp print  code create ediniz

        Scanner input = new Scanner(System.in);
        System.out.println("karakter analizi icin cumle gir");

        String cumle =input.nextLine();

        Map<Character , Integer > karakterlerMapi= new TreeMap<>();

        for (int i = 0; i <cumle.length(); i++) {

            char c = cumle.charAt(i);
            int count =1;

            if (karakterlerMapi.containsKey(c)){
                karakterlerMapi.replace(c,  karakterlerMapi.get(c) + 1  );
            }else {
                karakterlerMapi.put(c , 1);//bu karakter ilk defa map e giriyor
            }
        }
        for (Character c : karakterlerMapi.keySet()   ) {
            System.out.println(c+" : "+ karakterlerMapi.get(c));
        }

        System.out.println("diger for looop");

        for (Map.Entry<Character , Integer> entry: karakterlerMapi.entrySet() ) {

            System.out.println("karakter "+ entry.getKey() + " "+ entry.getValue()+ " tane var ***");
        }








    }
}
