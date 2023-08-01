package ch30_Collections.C01_LinkedList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class C03_LinkedList {
    public static void main(String[] args) {
        LinkedList<String > linkedList1= new LinkedList<>(Arrays.asList("berlin",
                "ankara","izmir","dortmund","istanbul","newyork"));

        ///print
        System.out.println("linkedList1 = " + linkedList1);

        //remove() buldugu ilk  node u siler
        System.out.println("linkedList1.remove() = " + linkedList1.remove());
            //linkedList1.remove() = berlin

        System.out.println("linkedList1 = " + linkedList1);
        //linkedList1 = [ankara, izmir, dortmund, istanbul, newyork]

        System.out.println("linkedList1.remove(2) = " + linkedList1.remove(2));
        //linkedList1.remove(2) = dortmund

        System.out.println("linkedList1 = " + linkedList1);
        //linkedList1 = [ankara, izmir, istanbul, newyork]

        System.out.println("linkedList1.remove(\"ankara\") = " + linkedList1.remove("ankara"));
        //linkedList1.remove("ankara") = true
        System.out.println("linkedList1 = " + linkedList1);//linkedList1 = [izmir, istanbul, newyork]


        System.out.println("linkedList1.remove(\"ankara\") = " + linkedList1.remove("ankara"));
            //linkedList1.remove("ankara") = false

        linkedList1.add("izmir");
        System.out.println("linkedList1 = " + linkedList1);//linkedList1 = [izmir, istanbul, newyork, izmir]

        System.out.println("linkedList1.removeFirstOccurrence(\"izmir\") = " + linkedList1.removeFirstOccurrence("izmir"));
        //linkedList1.removeFirstOccurrence("izmir") = true
        System.out.println("linkedList1 = " + linkedList1);//linkedList1 = [istanbul, newyork, izmir]


        linkedList1.add("newyork");
        System.out.println("linkedList1 = " + linkedList1);// linkedList1 = [istanbul, newyork, izmir, newyork]

        System.out.println("linkedList1.removeLastOccurrence(\"newyork\") = "
                + linkedList1.removeLastOccurrence("newyork")); //linkedList1.removeLastOccurrence("newyork") = true

       System.out.println("linkedList1 = " + linkedList1);//linkedList1 = [istanbul, newyork, izmir]
        //linkedList1 = [istanbul, newyork, izmir]

        System.out.println("linkedList1.element() = " + linkedList1.element());//linkedList1.element() = istanbul


        System.out.println("linkedList1.getLast() = " + linkedList1.getLast());
        //linkedList1.getLast() = izmir
        System.out.println("linkedList1.getFirst() = " + linkedList1.getFirst());
        //linkedList1.getFirst() = istanbul


        //iki list create edin

        LinkedList<String > linkedList2= new LinkedList<>(Arrays.asList("bilecik",
                "pursaklar","menemen","dortmund","istanbul","newyork"));

        LinkedList<String > linkedList3= new LinkedList<>(Arrays.asList("hatay",
                "dublin","zigetvar","plevne","arnavutluk","paris"));

        linkedList2.addAll(linkedList3);
        System.out.println("linkedList2 = " + linkedList2);
        //linkedList2 = [bilecik, pursaklar, menemen, dortmund, istanbul, newyork, hatay, dublin, zigetvar, plevne, arnavutluk, paris]

        linkedList2.removeAll(linkedList3);
        System.out.println("linkedList2 = " + linkedList2);
    //linkedList2 = [bilecik, pursaklar, menemen, dortmund, istanbul, newyork]

        //task integer list create edin remove islemi yapin

        System.out.println("linkedList2.getClass() = " + linkedList2.getClass());
        //linkedList2.getClass() = class java.util.LinkedList
    //zeynephanimdan
        LinkedList<Integer> linkedList4 = new LinkedList<>(Arrays.asList(1,2,5,6,3,4,7));
        linkedList4.remove(5);
        System.out.println("linkedList4 = " + linkedList4);


    }
}
