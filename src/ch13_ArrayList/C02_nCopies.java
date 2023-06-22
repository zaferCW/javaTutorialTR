package ch13_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class C02_nCopies {
    public static void main(String[] args) {

        //nCopies methodu kopyalamak istediginiz degeri verdiginiz sayi kadar copy ediyior

        ArrayList<String> city = new ArrayList<>(Arrays.asList("Angara","erzurum","izmir","konya","bursa","mogadishu","aydin"));
        System.out.println("city = " + city);//city = [Angara, erzurum, izmir, konya, bursa, mogadishu, aydin]

        ArrayList<String> country = new ArrayList<>(List.of("MADAGASKAR","ALMANYA","POLONYA","UGANDA","ITALYA"));
        System.out.println("country = " + country);


        ArrayList<String> yeniList = new ArrayList<>  (Collections.nCopies(7,"NEW ZEALAND")) ;
        System.out.println("yeniList = " + yeniList);//yeniList = [NEW ZEILAND, NEW ZEILAND, NEW ZEILAND, NEW ZEILAND, NEW ZEILAND, NEW ZEILAND, NEW ZEILAND]

        //addAll methodu iki
    //    city.addAll(country);
    //    System.out.println("city = " + city);//city = [Angara, erzurum, izmir, konya, bursa, mogadishu, aydin, MADAGASKAR, ALMANYA, POLONYA, UGANDA, ITALYA]

        //belirlenen index e ekleme

        city.addAll(1,country);
       System.out.println("city = " + city);  //city = [Angara, MADAGASKAR, ALMANYA, POLONYA, UGANDA, ITALYA, erzurum, izmir, konya, bursa, mogadishu, aydin]
        System.out.println("country = " + country);


    }
}
