package ch30_Collections.C03_Queue;

import java.util.*;

public class C02_Deque {
    public static void main(String[] args) {
          /*
        Deque: Double Ended Queue -> Queue'larda FİFO Deque'lerde hem FİFO hem LİFO geçerli
       LİFO : Last in First out

         */

        Deque< String > dq1 = new LinkedList<>(Arrays.asList("almanya","hollanda",
                "fransa","amerika","afrika","brezilya","yeni zellanda"));


        System.out.println("dq1 = " + dq1);
        //dq1 = [almanya, hollanda, fransa, amerika, afrika, brezilya, yeni zellanda]

        dq1.add("Turkiye");

        System.out.println("dq1 = " + dq1);
        //dq1 = [almanya, hollanda, fransa, amerika, afrika, brezilya, yeni zellanda, Turkiye]

        System.out.println("dq1.getFirst() = " + dq1.getFirst());  //dq1.getFirst() = almanya

        System.out.println("dq1.getLast() = " + dq1.getLast());   //dq1.getLast() = Turkiye

        System.out.println("dq1.peekFirst() = " + dq1.peekFirst());

        System.out.println("dq1.peekLast() = " + dq1.peekLast());

        System.out.println("dq1 = " + dq1);
        //dq1 = [almanya, hollanda, fransa, amerika, afrika, brezilya, yeni zellanda, Turkiye]

    /*
    Retrieves, but does not remove, the first element of this deque. This method differs
     from peekFirst only in that it throws an exception if this deque is empty.
     */

        /*
        Retrieves, but does not remove, the last element of this deque. This method differs from peekLast
        only in that it throws an exception if this deque is empty.
         */

        dq1.clear();

        System.out.println("dq1 = " + dq1);

        System.out.println("dq1.peekFirst() = " + dq1.peekFirst());//dq1.peekFirst() = null

      //CTE  System.out.println("dq1.getFirst() = " + dq1.getFirst());
        //Exception in thread "main" java.util.NoSuchElementException

        Deque < String > dq2 = new LinkedList<>(Arrays.asList("almanya","hollanda",
                "fransa","amerika","afrika","brezilya","yeni zellanda"));

        System.out.println("dq2.pollFirst() = " + dq2.pollFirst());//dq2.pollFirst() = almanya

        System.out.println("dq2 = " + dq2);//dq2 = [hollanda, fransa, amerika, afrika, brezilya, yeni zellanda]

        System.out.println("dq2.removeFirst() = " + dq2.removeFirst());//dq2.removeFirst() = hollanda

        System.out.println("dq2 = " + dq2); //dq2 = [fransa, amerika, afrika, brezilya, yeni zellanda]


        System.out.println("dq2.pollLast() = " + dq2.pollLast());

        System.out.println("dq2 = " + dq2);//dq2 = [hollanda, fransa, amerika, afrika, brezilya, yeni zellanda]

        System.out.println("dq2.removeLast() = " + dq2.removeLast());//dq2.removeLast() = brezilya


        dq2.clear();

        System.out.println("dq2.pollLast() = " + dq2.pollLast());//dq2.pollLast() = null

      //CTE  System.out.println("dq2.removeLast() = " + dq2.removeLast());
        //Exception in thread "main" java.util.NoSuchElementException


    }
}
