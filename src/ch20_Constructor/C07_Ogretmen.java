package ch20_Constructor;

public class C07_Ogretmen {

    //fields
    String isim;
    int tecrube;
    int kidem;

    public C07_Ogretmen(String isim, int tecrube) {//2 pm li const
        this.isim = isim;
        this.tecrube = tecrube;
    }

   public void kidemHesapla(int kidem) {// in pm alan method
       System.out.println("kidem = " + (kidem*2)); //methida gelen int degeri alir 2 ile carpar


       System.out.println("this.kidem = " + this.kidem); //inst variable a islem yapildi
                //bu class daki kidem variable in default degeri  ile islem yapar

   }
}
