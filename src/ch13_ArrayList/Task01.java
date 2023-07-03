package ch13_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class Task01 {
    /* TASK :

     * Input olarak verilen listteki isimlerden
     * icinde ‘a’ harfi bulunanlari silen bir code create ediniz.
     *
     * INPUT : list1={"Ali","Veli","Ayse","Fatma","Omer"}
     * OUTPUT : [Veli,Omer]
     */

    public static void main(String[] args) {

        ArrayList <String> names = new ArrayList<>(List.of("Ali","Serap","Zeynep","Fuat"));
        ArrayList <String> newNames = new ArrayList<>();

        System.out.println("names = " + names);//names = [Ali, Serap, Zeynep, Fuat]

        for (int i = 0; i <names.size() ; i++) {
            if ( ! names.get(i).toLowerCase().contains("a") ){//a harfi olmayanlari alir
                newNames.add(names.get(i));//a harfi olmayan her elemaniu namesListe e ekler
            }
        }
        System.out.println("newNames = " + newNames);//newNames = [Zeynep]
        names.clear();
        System.out.println("names = " + names); // names = []
        names.addAll(newNames);
        System.out.println("names = " + names);//names = [Zeynep]


    }
}
