package ch28_Interface_Polymorphism.task28.Task04;

public class Main {

    public static void main(String[] args) {

//      IMuhendis muhendis1 = newIMuhendis(); // todo Interface den obje oluşturamayız. Sadece referans alabiliriz.

        PcMuhendisi muhendis1 = new PcMuhendisi(false, false);
//      IMuhendis muhendis1 = new PcMuhendisi(false,false); // todo Burada Interface i referans aldık.

        muhendis1.askerlik_durumu_sorgula();
        muhendis1.adli_sicil_sorgula();
        System.out.println(muhendis1.mezuniyet_ortalamasi(3.07));
        String[] tecrube = {"Vestel", "Havelsan", "Türksat"};
        muhendis1.is_tecrubesi(tecrube);

        System.out.println("----------------------------");

        MakineMuhendisi muhendis2 = new MakineMuhendisi(true, false);
        String[] tecrube2 = {};
        String[] referans = {"Mustafa Murat Coşkun", "Serhat Say"};
        muhendis2.adli_sicil_sorgula();
        muhendis2.askerlik_durumu_sorgula();
        System.out.println(muhendis2.mezuniyet_ortalamasi(2.31));
        muhendis2.is_tecrubesi(tecrube2);
        muhendis2.referans_getir(referans);

        System.out.println("----------------------------");

        IMuhendis muhendis3 = new MakineMuhendisi(true, false);
        // todo referansımızı interface den aldık.

//      muhendis3.muhendis2.referans_getir();
//      todo fakat makine mühendisine ait olan referans getir metodunu burada çağıramayız.

        muhendis2.calis(); // todo ICalisma adlı interface den metodu aldık.


    }
}