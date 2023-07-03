package ch13_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class C12_remove {

    public static void main(String[] args) {
        //remove();-> list'ten istenen eleman siler

        ArrayList<String> country = new ArrayList<>(List.of("MADAGASKAR","ALMANYA","POLONYA","UGANDA","ITALYA"));
        System.out.println("country = " + country);//country = [MADAGASKAR, ALMANYA, POLONYA, UGANDA, ITALYA]

        Collections.sort(country);

        System.out.println("country.remove(\"Norvec\") = " + country.remove("Norway"));//country.remove("Norvec") = false

        System.out.println("country.remove(\"UGANDA\") = " + country.remove("UGANDA"));//country.remove("UGANDA") = true

        System.out.println("country.remove(0) = " + country.remove(0));//country.remove(0) = ALMANYA

        System.out.println("country = " + country);// country = [ITALYA, MADAGASKAR, POLONYA]

        country.add("Amerika");
        country.add("Hollanda");
        country.add("Ukrayna");
        country.add("Amerika");
        System.out.println("country = " + country);
        // country = [ITALYA, MADAGASKAR, POLONYA, Amerika, Hollanda, Ukrayna, Amerika]

        System.out.println("country.remove(\"Amerika\") = " + country.remove("Amerika"));//country.remove("Amerika") = true

        System.out.println("country = " + country);// country = [ITALYA, MADAGASKAR, POLONYA, Hollanda, Ukrayna, Amerika]

        ArrayList<String> city = new ArrayList<>(Arrays.asList("Angara","erzurum","izmir","konya","bursa","mogadishu","aydin"));
        System.out.println("city = " + city);//city = [Angara, erzurum, izmir, konya, bursa, mogadishu, aydin]

        country.addAll(city);

        System.out.println("country = " + country);//
        //ountry = [ITALYA, MADAGASKAR, POLONYA, Hollanda, Ukrayna, Amerika, Angara, erzurum, izmir, konya, bursa, mogadishu, aydin]

        System.out.println("country.removeAll(city) = " + country.removeAll(city));//country.removeAll(city) = true

        System.out.println("city = " + city);// city = [Angara, erzurum, izmir, konya, bursa, mogadishu, aydin]

        System.out.println("country = " + country);// country = [ITALYA, MADAGASKAR, POLONYA, Hollanda, Ukrayna, Amerika]

    }
}
