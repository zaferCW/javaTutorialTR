package ch17_PassByValue;

import java.util.ArrayList;

public class Task01 {
    public static void main(String[] args) {
        int x = 10;
        int y = x;
        x = 20;
        System.out.println("x = " + x);
        System.out.println("y = " + y);

        String s1 = "hello";
        String s2 = s1;
        s1 = "world";
        System.out.println("s1.toUpperCase() = " + s1.toUpperCase());

        System.out.println("s1 = " + s1);//world
        System.out.println("s2 = " + s2);

        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        ArrayList<Integer> list2 = list1;
        list1.add(3);

        System.out.println("list1 = " + list1);
        System.out.println("list2 = " + list2);

    }
}
