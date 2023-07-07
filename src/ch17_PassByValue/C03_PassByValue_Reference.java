package ch17_PassByValue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C03_PassByValue_Reference {
    public static void main(String[] args) {

         /*
        java non-primitive(Class array list-> refrans ) data turlerinde obj
        kendisi değil de dataları geğişirse
        obj referans ve kendisi değişmediği dataları değişikliğini kalıcı yapar.
         */

        // Task -> list elemanları 24,20,87 iki farklı method ile list elemanlarını
        //      update yapan print eden code create ediniz.
        //1. method-> with for each   2. method-> set(index,value)
        List<Integer> list = new ArrayList<>(Arrays.asList(24,20,87));

        System.out.println("operasyon oncesi list = " + list );  // operasyon oncesi list = [24, 20, 87]

        listUpdate1(list);                  //list Update1 methodu icinden list [24, 20, 87]
        System.out.println("listUpdate1 methodu calisti ");

        listUpdate2(list);              //        list Update2 methodu icinden list [48, 40, 174]
        System.out.println("listUpdate2 methodu calisti ");

        System.out.println("operasyon sonrasi list = " + list);         //operasyon sonrasi list = [48, 40, 174]
    }

    private static void listUpdate2(List<Integer> list) {
        for (int i = 0; i <list.size() ; i++) {
            list.set(i, list.get(i) * 2);
        }
        System.out.println("list Update2 methodu icinden list " +list); // 48 40 174

    }

    private static void listUpdate1(List<Integer> list) {
        for (Integer w : list   ) {
            w += 2;
        }
        System.out.println("list Update1 methodu icinden list " +list); // 24 20 87
    }
}
