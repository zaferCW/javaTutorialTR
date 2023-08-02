package ch30_Collections.C02_Set;


import java.util.*;

public class Task01 {
    public static void main(String[] args) {
         /*
         Deger ataması yapılan Array'i arraylist'e ceviren method create ediniz
         main içersinde meth return ettiği arryList'i HashSet, LinkedHashSet ve TreeSet'e atayınız.
         */
        String [] arr = {"Çalıştıkça","daha", "çok", "şey", "bilmediğimi", "farkediyorum"};

        System.out.println("arrayCovertToList(arr) = " + arrayCovertToList(arr));

        HashSet <String> hs =new HashSet<>(              arrayCovertToList(arr)                    );
        LinkedHashSet <String> lhs=new LinkedHashSet<>(   arrayCovertToList(arr)                 );
        TreeSet <String > ts = new TreeSet<>(            arrayCovertToList(arr)                );

        System.out.println("hs = " + hs);
        System.out.println("lhs = " + lhs);
        System.out.println("ts = " + ts);

    }
    private static ArrayList<String> arrayCovertToList(String[] arr) {
        ArrayList<String> arrList =new ArrayList<>(List.of(arr));
     //  ArrayList<String> arrList1 =new ArrayList<>(Arrays.asList(arr));
        return arrList;
    }
}
