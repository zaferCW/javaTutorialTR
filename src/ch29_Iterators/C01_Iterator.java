package ch29_Iterators;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class C01_Iterator {
    public static void main(String[] args) {

        List<String > list1 = new ArrayList<>(Arrays.asList("Zeynep ","Ahmet","Eren","Iclal","Safak","Fatih","Ali"));

        System.out.println("list1 in ilk hali  = " + list1);

        //task list1 in elemanlarini for loop ile yanyana print ediniz
        for (int i = 0; i < list1.size(); i++) {//rukiye hanimdan
            System.out.print(list1.get(i) + " ");

        }
        for (String avuc : list1) {//Ali beyden
            System.out.print(avuc + " ");

        }
        System.out.println();
        System.out.println("*********");

        //task list1 in herbir elemani for loop ile isimlere SDET ekleryerek kalici update ediniz
        for (int i = 0; i < list1.size(); i++) {//ezgisu hanimdan
            String name = list1.get(i);//herbir elemani alir getirir her dongude name isimli variabe atar
            list1.set( i  , name + " SDET");

        }
        System.out.println("list1 in son hali  = " + list1);

        System.out.println("*********");
        for ( String w :list1    ) {
            w = w +" QA";  //The value w +" QA" assigned to 'w' is never used
           // System.out.println("list1 foreach loop icinde"+list1);
        }
        System.out.println("list1 in en son hali  = " + list1);

        //list1 i iterator a alip print ediniz
        Iterator< String > list1Iterator = list1.iterator();//List dden iterator methodu kullanilarak
                                                // Iterator interface den list1Iterator variable tanimlandi

        while (list1Iterator.hasNext()){
            System.out.print(" "+ list1Iterator.next());
            //hasNext(); bir sonraki eleman var ise true return eder
            //next(); onunde oldugu elemani getirir
        }

        System.out.println();
        System.out.println("list1Iterator in while sonrasi hali = " + list1Iterator);
            //list1Iterator in while sonrasi hali = java.util.ArrayList$Itr@3fb6a447


    }
}
