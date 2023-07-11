package ch20_Constructor;

public class C05_Arac {

    //Fields-> obj'nin uretilirken alacgı değer variables
    //bir class'da bir den çok cons tanımlanabilir
     /*   1) Constructor icinden baska bir Constructor cagirmak icin "this()"
      kullanirsaniz mutlaka ilk satira yazmalisiniz.
    Aksi takdirde Compile Time Error alirsiniz.
            2) Bir Constructor icinden sadece bir tane Constructor cagirisi
            yapabilirsiniz.Cunku iki tane cagri yaprsaz
    birisi ilk satirda olamayacaktir, bu da ilk kuralla celisir.
            */

    int maxHiz;
    String model;

    public C05_Arac() {
        this(30);
        System.out.println("pm siz const calisti");
    }


    public C05_Arac(int i) {//1 pm li const
        this(340, "Tesla");
        this.maxHiz = i;
        System.out.println("1 pm li const calisti");
    }

    public C05_Arac(int i, String marka) {//2 pm li const
        this("AUDI", 400);
        System.out.println(" 2 pm li const calisti int ve  String ");
        this.maxHiz = i;
        this.model = marka;

    }

    public C05_Arac(String marka, int i) {// 2 pm li const
        System.out.println(" 2 pm li const calisti String ve int");
        this.maxHiz = i;
        this.model = marka;
    }
}
