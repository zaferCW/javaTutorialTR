package ch28_Interface_Polymorphism.task28.Task05;

public class MakineMuhendisi implements IMuhendis {

    private boolean askerlik;
    private boolean adliSicil;

    public MakineMuhendisi(boolean askerlik, boolean adliSicil) {
        this.askerlik = askerlik;
        this.adliSicil = adliSicil;
    }

    @Override
    public void askerlik_durumu_sorgula() {

        if (askerlik) {

            System.out.println("Askerliğimi yaptım");
        } else {
            System.out.println("Askerliğimi yapmadım");
        }

    }

    @Override
    public String mezuniyet_ortalamasi(double derece) {

        return "Ortalamam: " + derece;
    }

    @Override
    public void adli_sicil_sorgulama() {

        if (adliSicil) {
            System.out.println("Adli Sicil Kaydı Bulunuyor.");
        } else {
            System.out.println("Herhangi bir adli sicil kaydım bulunmuyor. ");
        }


    }

    @Override
    public void is_tecrubesi(String[] array) {

        if (array.length == 0) {

            System.out.println("Herhangi bir tecrübem yok...");
        } else {
            System.out.println("Makine mühendisi olarak şu şirketlerde çalıştım: ");

            for (String s : array) {
                System.out.println(s);
            }
        }


    }

    public void referansGetir(String[] array) {

        if (array.length == 0) {
            System.out.println("Herhangi bir referansım bulunmuyor..");
        } else {
            System.out.println("Referanslarım");

            for (String s : array) {
                System.out.println(s);
            }
        }
    }
}
