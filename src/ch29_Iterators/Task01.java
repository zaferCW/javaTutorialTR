package ch29_Iterators;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class Task01 {

    public static void main(String[] args) {

          /*
        task -> Verilen bir integer listin tek  elemanrının karesini tersten iterator  print eden code create ediniz
         */
        List<Integer > numberList = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9));
        System.out.println("numberList in ilk hali= " + numberList);

        ListIterator <Integer> listIterator = numberList.listIterator();

        while (listIterator.hasNext()){
            listIterator.next();
        }

        while (listIterator.hasPrevious()){
            int a = listIterator.previous();
            System.out.print("a "+a);
            if (a % 2 ==1){
                listIterator.set( a * a);
            }else listIterator.remove();
        }

        System.out.println("numberList iin son hali = " + numberList);

        while (listIterator.hasNext()){
            listIterator.next();
        }

        while (listIterator.hasPrevious()){
            System.out.print(listIterator.previous()+" ");
        }





    }
}
