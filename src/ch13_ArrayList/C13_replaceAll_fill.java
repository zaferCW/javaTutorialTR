package ch13_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class C13_replaceAll_fill {
    public static void main(String[] args) {

        //replaceAll();-> listte belirli bir elemanı belirli bir değer ile update eder
        //fill();->listte tüm elelmanları belirli bir değere update der.

        ArrayList<Integer> listNumber = new ArrayList<>(Arrays.asList(1,2,1,5,1,4,3,66,99,55,88,35,34));
        System.out.println("listNumber = " + listNumber);

        System.out.println("Collections.replaceAll(listNumber , 1 , 111) = " +
                Collections.replaceAll(listNumber, 1, 111));

        System.out.println("listNumber = " + listNumber);
        //listNumber = [111, 2, 111, 5, 111, 4, 3, 66, 99, 55, 88, 35, 34]

        Collections.fill(listNumber, 33);
        System.out.println("listNumber = " + listNumber);
        //listNumber = [33, 33, 33, 33, 33, 33, 33, 33, 33, 33, 33, 33, 33]

        // hepsi 33


    }
}
