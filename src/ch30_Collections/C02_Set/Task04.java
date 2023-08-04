package ch30_Collections.C02_Set;

import java.util.HashSet;
import java.util.Random;
import java.util.TreeSet;

public class Task04 {

    public static void main(String[] args) {

        //treeSet ve HashSet e 100 adet random deger ekleyin
        //ve surelerini kiyaslayin
        //hashset ten set olusturup eleman ekleyip bunu tree set e cevirin

       long startTimeHashSet= System.nanoTime();

       HashSet <Integer>  hashSet = new HashSet<>();

       Random random = new Random();

        for (int i = 0; i <100 ; i++) {
            hashSet.add(random.nextInt(1000));//0 ile 999 arasi bir deger ekler
        }
        long endTimeHashSet= System.nanoTime();

        System.out.println("endTimeHashSet-startTimeHashSet = " + (endTimeHashSet - startTimeHashSet));
        System.out.println("hashSet = " + hashSet);


        long startTimeTreeSet= System.nanoTime();

        TreeSet <Integer>  treeSet = new TreeSet<>();

        for (int i = 0; i <100 ; i++) {
            treeSet.add(random.nextInt(1000));//0 ile 999 arasi bir deger ekler
        }
        long endTimeTreeSet= System.nanoTime();

        System.out.println("endTimeTreeSet-startTimeTreeSet = " + (endTimeTreeSet - startTimeTreeSet));


        TreeSet <Integer>  treeSet2 = new TreeSet<>(hashSet);

        System.out.println("treeSet2 = " + treeSet2);


    }
}
