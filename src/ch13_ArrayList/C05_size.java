package ch13_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C05_size {

    public static void main(String[] args) {
//size() method arraylistin uzunlugunu verir yani elaman sayisini

        ArrayList<String> country = new ArrayList<>(List.of("MADAGASKAR","ALMANYA","POLONYA","UGANDA","ITALYA"));
        System.out.println("country = " + country);

        System.out.println("country.size() = " + country.size());



    }
}
