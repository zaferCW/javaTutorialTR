package ch18_ImmutableClass;

import java.util.ArrayList;
import java.util.List;

public class C04_OCA_MutableClass {
    public static void main(String[] args) {

        List<String> list =new ArrayList<>();
        list.add("one");
        list.add("two");
        list.add("7");
       //   list.add(7);  //CTE //listimiz String oldugu icin int deger ekleyemeyiz

        for (String w: list    ) {
            System.out.println("w = " + w);
        }





    }
}
