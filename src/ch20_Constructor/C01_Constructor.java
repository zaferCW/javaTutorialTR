package ch20_Constructor;

public class C01_Constructor {

 /*
    1- constructor ismi Class name ile aynı olmalı.Buyuk harf ile başlamalı
    2- constructor create eedildigğinde name den sonra () {} mutlaka kullanılmalı
    3- eger p'li cons. create edilirse java default cons ezer(siler)
    4- cons. return type olmaz method'dan ayıran özelliğidir.
    5-Class create edildiginde java default cons. kendi create eder.
     */

    //fields
    String str ; //instance variable
    String selam = "hello World";

    //default constructor
      // public  C01_Constructor(){
      //
      // }

    public static void main(String[] args) {
        C01_Constructor obj1 = new C01_Constructor();
        //new C01_Constructor(); pm siz constructor call eder
        C01_Constructor obj2 = new C01_Constructor();
        C01_Constructor obj3 = new C01_Constructor();
        C01_Constructor obj4 = new C01_Constructor();

        System.out.println("obj1.str = " + obj1.str);  // obj1.str = null
        System.out.println("obj1.selam = " + obj1.selam);  //obj1.selam = hello World

        obj1.str = "javAslan";//str instance var. ' ina obj1 ile call edilerek yeni deger atandi
        obj2.str = "javAtar";
        System.out.println("obj3.selam = " + obj3.selam); //obj3.selam = hello World

        System.out.println("obj1.str = " + obj1.str); //obj1.str = javAslan
        System.out.println("obj2.str = " + obj2.str); //obj2.str = javAtar
        System.out.println("obj4.str = " + obj4.str);//obj4.str = null


        obj2.method();//object name ile static olmayan bir method call edildi static olan main method icerisinden
        obj4.method();


    }
    public void method(){
        System.out.println("methodddan merhaba ");
    }
}
