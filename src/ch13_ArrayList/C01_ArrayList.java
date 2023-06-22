package ch13_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C01_ArrayList {
     /*
     Array List genel Tanimi:

            ArrayList<Type> arrayListName = new ArrayList<Type>();
                 List<Type> arrayListName = new ArrayList<>();

             1. Type : String, Integer, Double, Long, Byte, Short, Boolean, Object, .... seklinde Class olmalidir
                - ArrayList<int> hatali bir tanimlamadir. Type Wrapper class dedigimiz object türünden olmalidir
                - primitive'lerin wrapper classlari Büyük harflar baslayan isimleridir
                - int'n wrapper class'i        --> Integer'dir
                - double'un wrapper class'i    --> Double'dir. vs...

            2.  - Arrayler tanimlanirken sabit bir .length;'de tanimlanir ve bu length degistirilemez
                - ArrayList'ler tanimlamada .size(); belirleme zorunlulugu yoktur degistirilebilir.
            3.  Intellij sonda bos biralikan <> yerine <~> seklinde ifade yazabilir bu ifade tanimdaki tür ile ayni anlamindadir.

    List declarations(tanımlama) :
    Array den farki boyut esnekleğidir.Array'lerde length sabittir, degistirilemez. ArrayList'lerde (List) length esnektir.
     eleman ekledikce List size'ini artirir,  eleman sildikce List size'ini azaltir.


    key word: List<Wrapper Class> name=

    List'e assaign etme(atama) :
    List'ler data type olarak primitive'leri kabul etmez. Primitive'lerde data type'ini non-primitive yapmak icin wrapper class'lari kullanilir.
    List<wrapper Class> name = new List<>()      *****yanlışşşşşşş (<> :jenerik wrapper Class dan parametre alır.)
    List<wrapper Class> name = new ArrayList<>() *****doğru
    List<wrapper Class> name = new ArrayList<Wrapper Class>() *****doğru->best practice
    ArrayList<wrapper Class> name = new ArrayList<>()  *****doğru

    List'e ilk değer atama (initialize):....
    1.yol : asList();
    ArrayList<Integer> sayı= new ArrayList<>(Arrays.asList(1,2,3)) demek 1,2,3 elemanlarini array olarak al demektir.
    2.yol : Listof();
    ArrayList<String> ulkeler= new ArrayList<String>( List.of("Almanya", "Fransa", "Ingiltere", "Ispanya", "Italya") );

    ArrayList ler array'lerin aksine direkt olarak ekrana yazdirilabilirler-->  print için:  System.out.println(name);
    Array'ler Arrayy.toString(arrayAdi); ile yazdirilabilir.


    Collections ==> Bir araya getirilmis parcalar anlamına gelir. ArrayList, Set, Vector, Queue ler java collections sınıfı nesneleridir.

 */

    public static void main(String[] args) {
        int sayi = 99;
        int [] arr = new int [5];
        int [][] arrMd= new int [5] [6] ;

        //ArraysList tanimlama ve create etme
        ArrayList <String > names= new ArrayList<>(); //boyut belirtmeye gerek yok
        ArrayList <Integer> numbers = new ArrayList<>();

        System.out.println("names = " + names);   //names = []
        System.out.println("numbers = " + numbers);  //numbers = []

        //arraysliste veri ekleme
        names.add("22");
        names.add("safak");
        names.add("iclal");
        names.add("rukiye");
        names.add("ali");
        names.add("burjuva");
        names.add("proleterya");

        System.out.println("names = " + names);//names = [22, safak, iclal, rukiye, ali, burjuva, proleterya]

        numbers.add(55);
        numbers.add(65);
        numbers.add(34);
        numbers.add(35);
        numbers.add(33);
        numbers.add(9);
        numbers.add(96);
        numbers.add(55);

        System.out.println("numbers = " + numbers); //numbers = [55, 65, 34, 35, 33, 9, 96, 55]


        //2. yol arrarListe eleman ekleme
        ArrayList<String> city = new ArrayList<>(Arrays.asList("Angara","erzurum","izmir","konya","bursa","mogadishu","aydin"));
        System.out.println("city = " + city);//city = [Angara, erzurum, izmir, konya, bursa, mogadishu, aydin]


        //3. yol List.of() methodu ile
        ArrayList <String> country = new ArrayList<>(List.of("MADAGASKAR","ALMANYA","POLONYA","UGANDA","ITALYA"));
        System.out.println("country = " + country);
        System.out.println("country.size() = " + country.size());

        country.add(1,"TURKIYE");
        System.out.println("country = " + country);//country = [MADAGASKAR, Turkiye, ALMANYA, POLONYA, UGANDA, ITALYA]
        System.out.println("country.size() = " + country.size());  // country.size() = 6



    }
}
