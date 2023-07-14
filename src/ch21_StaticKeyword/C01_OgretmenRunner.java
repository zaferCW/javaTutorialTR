package ch21_StaticKeyword;

public class C01_OgretmenRunner {
    public static void main(String[] args) {

        C01_Ogretmen.okul="tayyar mehmet pasa okulu";

        C01_Ogretmen ogretmen =
                new C01_Ogretmen("Mustafa bey",35);

        System.out.println("ogretmen = " + ogretmen);
        System.out.println("ogretmen.isim = " + ogretmen.isim);
        System.out.println("ogretmen.tecrube = " + ogretmen.tecrube);
        System.out.println("ogretmen.okul = " + ogretmen.okul);
        //okul static oldugu icin oobje den call edilmemeli

        System.out.println("ogretmen.okul = " + C01_Ogretmen.okul);

        C01_Ogretmen ogretmen2 =
                new C01_Ogretmen("Zeynep hanim",35);

        C01_Ogretmen.okul="yildiz teknik okulu";

        System.out.println("ogretmen = " + ogretmen2);
        System.out.println("ogretmen.isim = " + ogretmen2.isim);
        System.out.println("ogretmen.tecrube = " + ogretmen2.tecrube);

        System.out.println("ogretmen.okul = " + C01_Ogretmen.okul);

        //static methoda class name ile call edildi
        C01_Ogretmen.maasHesapla();
        //non static method obje ile call edildi
        ogretmen2.evlilikYilDonumu();

    }
}
