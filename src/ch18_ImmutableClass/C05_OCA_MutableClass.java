package ch18_ImmutableClass;

import java.util.ArrayList;

public class C05_OCA_MutableClass {
    public static void main(String[] args) {

        ArrayList<Integer> values = new ArrayList<>();
        System.out.println("values = " + values);
        values.add(4);
        values.add(5);
        values.set(1,6);
        values.remove(0);

        for (Integer w :values   ) System.out.println(w);

        System.out.println("values = " + values);


    }
}
