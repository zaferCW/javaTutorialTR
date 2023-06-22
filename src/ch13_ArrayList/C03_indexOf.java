package ch13_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C03_indexOf {
    public static void main(String[] args) {
        //indexOf();-> list içinde istenen elemanın index değerin return eder

        ArrayList<String> city = new ArrayList<>(Arrays.asList("Angara","erzurum","izmir","konya","bursa","mogadishu","aydin"));
        System.out.println("city = " + city);

        ArrayList<String> country = new ArrayList<>(List.of("MADAGASKAR","ALMANYA","POLONYA","UGANDA","ITALYA"));
        System.out.println("country = " + country);

        System.out.println("city.indexOf(\"samsun\") = " + city.indexOf("samsun"));//city.indexOf("samsun") = -1

        System.out.println("city.indexOf(\"Angara\") = " + city.indexOf("Angara"));//city.indexOf("Angara") = 0


        country.add("Ingiltere");
        System.out.println("country.indexOf(\"Ingiltere\") = " + country.indexOf("Ingiltere"));//country.indexOf("Ingiltere") = 5
        System.out.println("country.lastIndexOf(\"Ingiltere\") = " + country.lastIndexOf("Ingiltere")); //country.lastIndexOf("Ingiltere") = 5

        country.add("ALMANYA");
        System.out.println("country.indexOf(\"ALMANYA\") = " + country.indexOf("ALMANYA"));//country.indexOf("ALMANYA") = 1
        System.out.println("country.lastIndexOf(\"ALMANYA\") = " + country.lastIndexOf("ALMANYA"));//country.lastIndexOf("ALMANYA") = 6

        System.out.println("country = " + country);
    }
}
