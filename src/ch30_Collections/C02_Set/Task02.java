package ch30_Collections.C02_Set;

import java.util.HashSet;
import java.util.TreeSet;

public class Task02 {
    public static void main(String[] args) {

        //interview question : eklenen String datalarin elemanlarini alfabetik print ediniz-> TreeSet'e atanır ...
        // hashSet ve treeSet tanımlayıp run surelerini karsılastırınız..
        // Trick run suresi için System.currentTimeMillis() meth. call ediniz...


        Long tsBasla = System.currentTimeMillis();

        TreeSet<String> ts = new TreeSet<>();
        ts.add("aragorn");
        ts.add("gimli");
        ts.add("jack");
        ts.add("legolas");
        ts.add("gandalf");

        System.out.println("ts = " + ts);//ts = [aragorn, gandalf, jack, legonas, yimli]

        Long tsBitis = System.currentTimeMillis();

        System.out.println("treeset runn suresi = " + (tsBitis - tsBasla));

        System.out.println("****************");

        Long hsBasla = System.currentTimeMillis();

        HashSet<String> hs = new HashSet<>();
        hs.add("white");
        hs.add("soul");
        hs.add("jack");
        hs.add("kimuti");
        hs.add("adam");

        System.out.println("hs = " + hs);

        Long hsBitis = System.currentTimeMillis();


        System.out.println("hashset runn suresi = " + (hsBitis - hsBasla));



    }
}
