package ch13_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C07_subList {
    public static void main(String[] args) {
        // subList() -> listenen istenen list parcasını return eder..

        ArrayList<String> country = new ArrayList<>(List.of("MADAGASKAR","ALMANYA","POLONYA","UGANDA","ITALYA"));
        System.out.println("country = " + country);

        System.out.println("country.subList(3,5) = " + country.subList(3, 5)); //country.subList(3,5) = [UGANDA, ITALYA]

        //yeni list olusturup eski listten eleman cekme
        ArrayList<String> yeniList = new ArrayList<>(country.subList(2,5));

        System.out.println("yeniList = " + yeniList);//yeniList = [POLONYA, UGANDA, ITALYA]


      //RTE   System.out.println("country.subList(3,6) = " + country.subList(3, 6));  java.lang.IndexOutOfBoundsException

    }
}
