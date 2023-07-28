package ch28_Interface_Polymorphism.task28.Task05;

public class IsbasvuruMain {

    public static void main(String[] args) {


        BilgisayarMuhendisi muhendisi1 = new BilgisayarMuhendisi(false, false);

        muhendisi1.askerlik_durumu_sorgula();
        muhendisi1.adli_sicil_sorgulama();
        System.out.println(muhendisi1.mezuniyet_ortalamasi(3.07));
        String[] tecrube = {"Vestel", "Havelsan", "Türksat", "Denizbank"};
        muhendisi1.is_tecrubesi(tecrube);

        System.out.println("----------------------------------------");

        MakineMuhendisi muhendis2 = new MakineMuhendisi(true, true);

        muhendis2.askerlik_durumu_sorgula();
        muhendis2.adli_sicil_sorgulama();
        System.out.println(muhendis2.mezuniyet_ortalamasi(3.5));

        String[] tecrube2 = {};
        muhendis2.is_tecrubesi(tecrube2);
        muhendis2.referansGetir(tecrube2);

        System.out.println("-------------------------------------------");

        IMuhendis muhendis3 = new BilgisayarMuhendisi(false, false);
        IMuhendis muhendis4 = new MakineMuhendisi(false, false);


    }
}
