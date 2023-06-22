package ch13_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C08_isEmpty_clear {
    public static void main(String[] args) {
        //isEmpty();-> listin boş olmasını kontrol eder true/false return eder.
        //clear(); -> listin tum elelmalrını siler

        ArrayList<String> country = new ArrayList<>(List.of("MADAGASKAR","ALMANYA","POLONYA","UGANDA","ITALYA"));
        System.out.println("country = " + country);

        System.out.println("country.isEmpty() = " + country.isEmpty()); //country.isEmpty() = false
                //Returns true if this list contains no elements.

        country.clear();
        System.out.println("country = " + country);


        System.out.println("country.isEmpty() = " + country.isEmpty());//country.isEmpty() = true




    }
}
