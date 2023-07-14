package ch21_StaticKeyword;

public class C01_Ogretmen {

    //fields
    String isim;
    int tecrube;
    static String okul ;

    public C01_Ogretmen(String isim, int tecrube) {
        this.isim = isim;
        this.tecrube = tecrube;
    }

    public static void maasHesapla(){
        System.out.println("maas sana yeterli");
    }

    public  void evlilikYilDonumu(){
        System.out.println("nice mutlu yillara");
    }

    @Override
    public String toString() {
        return "C01_Ogretmen{" +
                "isim='" + isim + '\'' +
                ", tecrube=" + tecrube +
                '}';
    }
}
