package ch13_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C06_set {//crUd update islemi icin kullanilir


    public static void main(String[] args) {

        ArrayList<String> country = new ArrayList<>(List.of("MADAGASKAR","ALMANYA","POLONYA","UGANDA","ITALYA"));
        System.out.println("country = " + country);

        System.out.println("country.size() = " + country.size());

        System.out.println("country.set(0,\"AMERIKA\") = " + country.set(0, "AMERIKA"));//country.set(0,"AMERIKA") = MADAGASKAR

        System.out.println("country = " + country);//country = [AMERIKA, ALMANYA, POLONYA, UGANDA, ITALYA]

        System.out.println("country.size() = " + country.size());//country.size() = 5



    }
}
