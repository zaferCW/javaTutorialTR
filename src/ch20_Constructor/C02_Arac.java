package ch20_Constructor;

public class C02_Arac {

    //fields
    String marka;
    String model;
    int km;
    double motorHacmi;
    boolean vitesAuto;
    boolean ikinciEl;
    int yil;
    String tramer;

    public static void main(String[] args) {

        C02_Arac arac1 = new C02_Arac();//pm siz const.  kullanilarak arac1 objesi create edildi

        arac1.ikinciEl = true;
        arac1.marka ="mercedes";
        arac1.km = 50000;
        arac1.model = "CLA";
        arac1.motorHacmi = 2.0;
        arac1.tramer= "5 kaza var";
        arac1.yil = 2022;

        System.out.println("arac1 = " + arac1);  //arac1 = ch20_Constructor.C02_Arac@6aaa5eb0

        System.out.println(arac1.marka + " "+ arac1.tramer+" "+arac1.ikinciEl+" "+arac1.km+" " + arac1.model+ " "
             +   arac1.motorHacmi+" "+  arac1.yil);


        //task -> 2. bir aracın tum field'larını atayarak print ediniz.

        //Ali bey in araci
        C02_Arac arac2 = new C02_Arac();
        arac2.ikinciEl = false;
        arac2.marka = "BMW";
        arac2.km = 105000;
        arac2.model = "M3";
        arac2.motorHacmi = 3.5;
        arac2.tramer = " kaza yok";
        arac2.yil = 2023;

        System.out.println("Ali bey in arac2 = " + arac2);


    }

    @Override
    public String toString() {
        return "C02_Arac{" +
                "marka='" + marka + '\'' +
                ", model='" + model + '\'' +
                ", km=" + km +
                ", motorHacmi=" + motorHacmi +
                ", vitesAuto=" + vitesAuto +
                ", ikiciEl=" + ikinciEl +
                ", yil=" + yil +
                ", tramer='" + tramer + '\'' +
                '}';
    }
}
