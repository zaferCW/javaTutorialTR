package ch30_Collections.C03_Queue;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class C01_Queue {

    public static void main(String[] args) {

        /*
      Queue coll. interface oldg için child calss olan LinkedList ve PriorityQueue
      ile obj uretilir.
      Eczane yemekhane bank vs belirli şart ile aksiyon alan elemanlar için kullanılır.
      Cons seçimine göre queue obj özelliklieri belirlenir.
      FİFO -> first in first out: Coll. ilk giren eleman ilk çıkar.Elemen en sona eklenişr enbaştan silinir

      peek()-> copt-paste gibi ilk elemanı return eder ama silmez
     poll()-> cut-paste gibi ilk elemanı siler ve  return eder
     element() -> ilk elemanı silmeden return eder.
     remove() -> ilk elemnı siler ve return eder..
       */

        Queue < String > q1 = new LinkedList<>(Arrays.asList("almanya","hollanda",
                "fransa","amerika","afrika","brezilya","yeni zellanda"));

        System.out.println("q1 = " + q1);
        //q1 = [almanya, hollanda, fransa, amerika, afrika, brezilya, yeni zellanda]

        q1.add("turkiye");

        System.out.println("q1 = " + q1);
        //q1 = [almanya, hollanda, fransa, amerika, afrika, brezilya, yeni zellanda, turkiye]



        Queue < String > q2 = new PriorityQueue<>(Arrays.asList("almanya","hollanda",
                "fransa","amerika","afrika","brezilya","yeni zellanda"));

        System.out.println("q2 = " + q2);
//q2 = [afrika, almanya, brezilya, amerika, hollanda, fransa, yeni zellanda]

        q2.add("Turkiye");
        q2.add("andorra");

        System.out.println("q2 = " + q2);
        //q2 = [Turkiye, afrika, brezilya, almanya, hollanda, fransa, yeni zellanda, amerika, andorra]


        System.out.println("q2.peek() = " + q2.peek()); //q2.peek() = Turkiye
        System.out.println("q2.remove() = " + q2.remove());  //q2.remove() = Turkiye

        System.out.println("q2 = " + q2);
        //q2 = [afrika, almanya, brezilya, amerika, hollanda, fransa, yeni zellanda, andorra]


        System.out.println("q2.poll() = " + q2.poll());  //q2.poll() = afrika

        System.out.println("q2 = " + q2);
        //q2 = [almanya, amerika, brezilya, andorra, hollanda, fransa, yeni zellanda]

        System.out.println("q2.element() = " + q2.element());
        //q2.element() = almanya

        System.out.println("q2 = " + q2);
        //q2 = [almanya, amerika, brezilya, andorra, hollanda, fransa, yeni zellanda]

        //poll ve remove farki => eger Queue bos ise
        //remove methodu nullpointerexcetion atar
        //poll ise null return ederr

        q1.clear();
        System.out.println("q1 = " + q1);//q1 = []


      // peek()-> copt-paste gibi ilk elemanı return eder ama silmez
      // poll()-> cut-paste gibi ilk elemanı siler ve  return eder
      // element() -> ilk elemanı silmeden return eder.
      // remove() -> ilk elemnı siler ve return eder..


        System.out.println("q1.poll() = " + q1.poll());  //q1.poll() = null

     //   System.out.println("q1.remove() = " + q1.remove());
        //Exception in thread "main" java.util.NoSuchElementException


        System.out.println("q1.offer(\"madagaskar\") = " + q1.offer("madagaskar")); //q1.offer("madagaskar") = true

        System.out.println("q1 = " + q1); //q1 = [madagaskar]

        //offer add farki
        //eger eleman kisitlamasi var ise add methodu exception firlatir   offer methodu false return eder
        //add  add IllegalStateException ediyor ali beyin deneyimi

    }
}
