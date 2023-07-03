package ch13_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class C14_ListConvertToArray {
    public static void main(String[] args) {
        //listi Array e cevirmek icin toArray() methodu kullanilir

        ArrayList<String> city = new ArrayList<>(Arrays.asList("Angara","erzurum","izmir","konya","bursa","mogadishu","aydin"));
        System.out.println("city = " + city);//city = [Angara, erzurum, izmir, konya, bursa, mogadishu, aydin]

        //1. yol donen deger Object class a atanirsa
        Object [] arrCity = city.toArray() ;

        System.out.println("arrCity = " + Arrays.toString(arrCity));//arrCity = [Angara, erzurum, izmir, konya, bursa, mogadishu, aydin]

        //2. yol toArray methodu ile
        String [] arrCity2 = city.toArray( new String[0] );
        System.out.println("arrCity2 = " + Arrays.toString(arrCity2));
        // aarCity2 = [Angara, erzurum, izmir, konya, bursa, mogadishu, aydin]







    }
}
