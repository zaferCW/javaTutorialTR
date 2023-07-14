package ch22_Scope;

public class C02_StaticVariable {
     /*  instance variable'lar obje'ye bagimlidir ve her obje farkli degerler alabilir
        ogrenci notlari veya ogretmen branslari gibi
        bir objeye ait bir variable'in son degerini bulmak icin sadece o objeyi dikkate aliriz

       Static variabler ise class variable olarak tanimlanir
       ve tum class uyeleri icin aynidir. Okul ismi, okul mudurunun adi gibi
       eger static variable'in degeri degistirilirse herkes icin degisir.-> güneş misali

     */

    static String firmaName;
    static int firmaId;
    static boolean yerliMi;

    public static void main(String[] args) {
        System.out.println("firmaId = " + firmaId);
        firmaId = 1001;
        System.out.println("firmaId = " + firmaId);

        C02_StaticVariable.firmaName = "zaararina satislar";
        yerliMi = false;

        staticMethod();

     //   nonStaticMethod();Non-static method 'nonStaticMethod()' cannot be referenced from a static context

        C02_StaticVariable obj = new C02_StaticVariable();
        obj.nonStaticMethod();

        System.out.println("firmaName = " + firmaName);  //firmaName = nefes
        System.out.println("firmaId = " + firmaId);     //firmaId = 3003
    }
    public void nonStaticMethod(){
        System.out.println("static olmayan meth calisti");
        firmaName = "nefes";
        firmaId = 3003;
    }
    public  static void staticMethod(){
        System.out.println("static olan meth calisti");
        firmaName="continental";
        firmaId = 2002;
        //    nonStaticMethod();  Non-static method 'nonStaticMethod()' cannot be referenced from a static context
    }
}
