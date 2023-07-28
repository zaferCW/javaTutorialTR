package ch28_Interface_Polymorphism.task28.Task04;

public class PcMuhendisi implements IMuhendis {

    private boolean askerlik;
    private boolean adli_sicil;

    public PcMuhendisi(boolean askerlik, boolean adli_sicil) {
        this.askerlik = askerlik;
        this.adli_sicil = adli_sicil;
    }

    @Override
    public void askerlik_durumu_sorgula() {

        if (askerlik) {

            System.out.println("Askerliğimi yaptım");
        } else {
            System.out.println("Askerliğimi yapmadım.");
        }

    }

    @Override
    public String mezuniyet_ortalamasi(double derece) {

        return "Ortalamam: " + derece;
    }

    @Override
    public void adli_sicil_sorgula() {

        if (adli_sicil) {
            System.out.println("Adli Sicil Kaydı Bulunuyor.");
        } else {
            System.out.println("Herhangi bir adli sicil kaydım bulunmuyor. ");
        }

    }

    @Override
    public void is_tecrubesi(String[] array) {

        System.out.println("Bilgisayar Mühendisi Olarak Şu Şirketlerde Çalıştım... ");

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);

        }

    }
}
