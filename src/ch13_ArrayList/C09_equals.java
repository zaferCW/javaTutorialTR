package ch13_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class C09_equals {
    public static void main(String[] args) {
        //equals(); -> iki listin index ve elelman eşitliğini montrol eder true/false return

        ArrayList <String> list1 = new ArrayList<>(Arrays.asList("a","b")) ; // eleman eklendi  [a,b]
        ArrayList <String> list2 = new ArrayList<>(Arrays.asList("A","b")) ; // eleman eklendi  [A,b]
        ArrayList <String> list3 = new ArrayList<>(Arrays.asList("a","b")) ; // eleman eklendi  [a,b]
        ArrayList <String> list4 = new ArrayList<>(Arrays.asList("b","a")) ; // eleman eklendi  [b,a]

        System.out.println("list1.equals(list2) = " + list1.equals(list2));   // list1.equals(list2) = false
        System.out.println("list1.equals(list3) = " + list1.equals(list3));  //  list1.equals(list3) = true
        System.out.println("list1.equals(list4) = " + list1.equals(list4));  //  list1.equals(list4) = false


    }
}
