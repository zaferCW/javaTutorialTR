package ch13_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class C04_get {
    public static void main(String[] args) {
        //get();-> listte istenen index elemanı return eder ( arr[3]  ->arrr'in 3 .indexdeki elemanı ver)

        ArrayList<String> city = new ArrayList<>(Arrays.asList("Angara","erzurum","izmir","konya","bursa","mogadishu","aydin"));
        System.out.println("city = " + city);

        System.out.println("city.get(1) = " + city.get(1));

    //    System.out.println("city.get(20) = " + city.get(20));  // java.lang.IndexOutOfBoundsException




    }
}
