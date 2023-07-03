package ch13_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C11_contains {
    public static void main(String[] args) {
        //contains(); -> method list'te istenen elelmanın varlıgını  kontrol eder true/false return

        ArrayList<String> country = new ArrayList<>(List.of("MADAGASKAR","ALMANYA","POLONYA","UGANDA","ITALYA"));
        System.out.println("country = " + country);//country = [MADAGASKAR, ALMANYA, POLONYA, UGANDA, ITALYA]

        System.out.println("country.contains(\"almanya\") = " +
                country.contains("almanya"));//country.contains("almanya") = false

        System.out.println("country.contains(\"UGANDA\") = " + country.contains("UGANDA"));//country.contains("UGANDA") = true


    }
}
