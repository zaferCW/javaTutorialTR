package ch10_MethodCreation;

public class C04_MethodOverloading {
    /*

                   Java'da  methodlarin farkli olup olmadiklarini  icin
                        a)Method ismi  b)parametreler kontrol edilir..

                   Java da ayni isimle birden fazla method olusturulmasına overloading denir.
                   Overloading icin Method Signature'larinin farkli olmasi gerekir
                   Method Signature = isim + parametre sayisi + parametre data type

                 TRICK_01 : Access Modifier'lari degistirmek de method'lari Java  farkli methodlar olarak
                  derlemez
                   aynı method olarak derler   Cunku access modifier'lar method signature'a dahil degildir.

                  TRICK_02 : Method'larin body'sini degistirmek de method'lari Java  farkli methodlar
                  olarak derlemez
                   aynı method olarak derler. Cunku body'ler method signature'a dahil degildir.

                  TRICK_03 : Overloading "Compile Time Error" verir.

                  Overloading :
                  1)Parametrelerin sayisini degistirerek ayni isimli method'lar olusturabilirsiniz.
                  2)Parametre sayisini degistirmeden herhangi bir parametrenin data type'ini
                    degistirerek de ayni isimli methodlar olusturabilirsiniz.
                  Note: topla(2,3); cagrisi topla(double num1, int num2) var oldugu surece
                        topla(int num1, int num2) yi kullanir, cunku argument data type ile parametre
                        data type birebir ortusuyor. Fakat birebir ortusen data type yoksa auto widening'e
                        gore Java kullanacagi method'u secer. Auto widening'e gore kullanabilecegi bir method
                        yoksa Java hata verir.
                  3)FARKLI data type'indeki parametrelerin yerlerini degistirerek de ayni isimli
                    methodlar olusturabilirsiniz.
                   birbirini kapsayan data turleri oldugunda Java en optimum cozumu uretir
                   (bire bir uyan varsa o methodu calistirir, bire bir uyan yoksa en fazla uyan
                   methodu kullanir)
                   Eger kapsayan bir method da bulamazsa Java CTE verir

                */
    public static void main(String[] args) {

        String str ="tam oturmasi icin birkac ornek daha gerekir";

        System.out.println("str.indexOf(\"o\") = " + str.indexOf("o"));

        System.out.println("str.indexOf(25) = " + str.indexOf(5));


        System.out.println("overloading ");
        topla();

        topla(1,5);

        System.out.println("topla(1,2,4) = " + topla(1, 2, 4));

        System.out.println("topla('a', 'b','c') = " + topla('a', 'b', 'c'));

        System.out.println("topla(12,23.5) = " + topla(12, 23.5));

        System.out.println("topla(\"A\" , \"B\") = " + topla("A", "B"));


    }

    private static String topla(String a, String b) {
        System.out.println("iki pm si String olan method calisti");
        return a+b ;
    }

    private static double topla(int i, double v) {
        System.out.println("1. pm int 2. pm double olan meth calisti");
        return i + v ;
    }

    private static int topla(int i, int i1, int i2) {
        System.out.println("3 pm si int olan meth calisti");
        return  i + i1 + i2;
    }

    private static void topla(int i, int i1) {
        System.out.println("iki pm si int olan meth calisti");
        System.out.println(i+i1);
    }

    private static void topla() {
        System.out.println("pm siz meth calisti");
        System.out.println(35+85);
    }


}
