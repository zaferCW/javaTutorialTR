package ch30_Collections.C01_LinkedList;

import java.util.LinkedList;

public class C02_LinkedList {
    public static void main(String[] args) {

        //task    char String int veri ekleyevbleceginiz bir linkedlist create edin
        //ezgisuhanimdan
        LinkedList< Object > linkedList = new LinkedList<>();//bad practice
        //spesifik data type secilmeli

        linkedList.add("ezgisu");
        linkedList.add(35);
        linkedList.add('$');

        System.out.println("linkedList = " + linkedList);


    }
}
