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
    //fields
    int maxHiz;
    String model;

    public C05_Arac() {//pm siz const.
        this(30);    //pm si int olan tek pm li const. call ediyor
        System.out.println("pm siz const calisti");
    }
    public C05_Arac(int i) {//1 pm li const
        this(340, "Tesla");  //1. pm si int , 2. pm si string olan iki pm li const call eder.
        this.maxHiz = i;        //bu class daki maxHiz variable ina i degerini atar
        System.out.println("1 pm li const calisti");
    }
    public C05_Arac(int i, String marka) {//2 pm li const
        this("AUDI", 400);    //1/ pm si String 2. pm si int olan iki pm li const call edeir
        System.out.println(" 2 pm li const calisti int ve  String ");
        this.maxHiz = i;      //yine bu class daki maxhiz variable ina i degeri atanir
        this.model = marka; //yine bu class daki model variable ina marka degeri atanir

    }
    public C05_Arac(String marka, int i) {// 2 pm li const
        System.out.println(" 2 pm li const calisti String ve int");
        this.maxHiz = i;//yine bu class daki maxhiz variable ina i degeri atanir
        this.model = marka;  ////yine bu class daki model variable ina marka degeri atanir
    }
}
