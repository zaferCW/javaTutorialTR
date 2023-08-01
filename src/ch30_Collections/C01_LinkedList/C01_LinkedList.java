package ch30_Collections.C01_LinkedList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class C01_LinkedList {

    public static void main(String[] args) {
        /*
        LinkedList .....
        1- LinkedList'de elemanlar "data" ve "adress" olmak uzere iki ksımdan oluşur ve eleman yerine "node"
        olarak tanımlanır.
        2- LinkedList'te ilk node data barındırmayan sadece adres bulunduran head node tanımlanmıştır.
        3- LinkedList'te son node adres kısmı null olan sadece data bulunduran tail node tanımlanmıştır.
        4- ArrayList searching LinkedList node ekleme ve silmede daha avantıjlıdır.Linkedlist eleman bulmada
        index yapısı olmadıgı için başarısıdır.
        5-LİnkedLİst -> tren vagon ilşikisi baglantısı gibi düşümülebilir
        6- Collection obj tanımlanırken cons Class(LinkedList,ArrayList...) olmalı interface(List, Queue ...)
         olmamasına diakkat edilmeli
            Ancak obj DataType olarak parent interface tanımlanabilir.
        7- LinkedList clss iki tane parent interface'den(List,Queue) implement etmiştir.
         */

        LinkedList <String > linkedList1= new LinkedList<>(Arrays.asList("berlin",
                "ankara","izmir","dortmund","istanbul","newyork"));

        ///print
        System.out.println("linkedList1 = " + linkedList1);//linkedList1 = [berlin, ankara, izmir, dortmund, istanbul, newyork]
        linkedList1.add("manheim");

        //add sonrasi print
        System.out.println("linkedList1 = " + linkedList1);//linkedList1 = [berlin, ankara, izmir, dortmund, istanbul, newyork, manheim]

        linkedList1.add(2,"sose");

        System.out.println("linkedList1 = " + linkedList1);
        //linkedList1 = [berlin, ankara, sose, izmir, dortmund, istanbul, newyork, manheim]

        linkedList1.addFirst("javAslan");
        System.out.println("linkedList1 = " + linkedList1);
    //linkedList1 = [javAslan, berlin, ankara, sose, izmir, dortmund, istanbul, newyork, manheim]

        linkedList1.addLast("sonDurak");
        System.out.println("linkedList1 = " + linkedList1);
        //linkedList1 = [javAslan, berlin, ankara, sose, izmir, dortmund, istanbul, newyork, manheim, sonDurak]


        //polymorphism e ornek olmasi icin linkedlist ve list kullanararak obje creaet edin

        List< String > list2 = new LinkedList<>(List.of("almanya","amerika","fransa","hollanda","ingiltere"));

        linkedList1.addAll(list2);
        System.out.println("linkedList1 = " + linkedList1);
       // linkedList1 = [javAslan, berlin, ankara, sose, izmir, dortmund, istanbul, newyork, manheim, sonDurak, almanya, amerika, fransa, hollanda, ingiltere]


    }
}
