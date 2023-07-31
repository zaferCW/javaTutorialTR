package ch29_Iterators;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class C03_ListIterator {
    public static void main(String[] args) {
        System.out.println("*********** C03_ListIterator ***********");
        List<String > list1 = new ArrayList<>(Arrays.asList("Zeynep ","Ahmet","Eren","Iclal","Safak","Fatih","Ali"));
        System.out.println("list1 in ilk hali  = " + list1);

        //task yukaridaki LIST o ListIterator a atama yaparak SDET eklereyek update kalici ediniz..

        ListIterator <String > listIterator = list1.listIterator();//list iterator tanimlandi

        while (listIterator.hasNext()){
            listIterator.set( listIterator.next() + " SDET"   );
        }

        System.out.println("list1 in son hali  = " + list1);


    //task yeni list create ediniz
        //list1 i iterator a atayini
        //list2 yi add methodu ile list1 e ekleyin
        //herbir elemani prin ediniz

    List <String> list2 = new ArrayList<>(Arrays.asList("offerlariniz geliyor"));
        System.out.println("list2 nin ilk hali = " + list2);

        ListIterator <String> listIterator2 = list1.listIterator();

        while (listIterator2.hasNext()){
            listIterator2.set(listIterator2.next().toUpperCase().charAt(0)+ "*****");
            //herbi ismi getirir ilk harfi alir gerisini yildiz ekler
            listIterator2.add(list2.toString());
        }
        System.out.println("list2 nin son hali= " + list2);


        System.out.println("list1 in en son hali  = " + list1);

    }
}
