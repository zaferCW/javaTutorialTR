package ch28_Interface_Polymorphism.task28.Task03;

public class Main {

    public static void main(String[] args) {

//        IMuhendis muhendis1 = newIMuhendis(); // todo Interface den obje oluşturamayız. Sadece referans alabiliriz.

        PcMuhendisi muhendis1 = new PcMuhendisi(false, false);
//      IMuhendis muhendis1 = new PcMuhendisi(false,false); // todo Burada Interface i referans aldık.

        muhendis1.askerlik_durumu_sorgula();
        muhendis1.adli_sicil_sorgula();

        System.out.println(muhendis1.mezuniyet_ortalamasi(3.07));

        String[] tecrube = {"Vestel", "Havelsan", "Türksat"};
        muhendis1.is_tecrubesi(tecrube);
    }
}