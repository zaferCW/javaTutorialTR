package ch29_Iterators;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Task02 {
    public static void main(String[] args) {
        /*  task->
          Bir listedeki istenen sayi araliginda olmayan-> 20den kck 40 dan byk
        elementleri silip print eden code create ediniz
        (2. liste olusturmadan, gecerli liste uzerinde iterator ile islem yapiniz)
	    Orn : [2,13,56,23,45,14,40] istenen aralik 20 ile 40 arasi (sinirlar dahil)
	    output: [23]
         */

        List<Integer > numberList = new ArrayList<>(Arrays.asList(2,13,56,23,45,14,40));
        System.out.println("numberList in ilk hali= " + numberList);

        int altSinir = 20 ;
        int ustSinir = 40 ;

        Iterator <Integer > iterator = numberList.iterator();

        while (iterator.hasNext()){
            int num = iterator.next();
            if ( num <= altSinir || num >= ustSinir){
                iterator.remove();
            }
        }
        System.out.println("numberList in son hali= " + numberList);
















    }
}
