package ch12_Arrays;

import java.util.Arrays ;

public class C03_Arrays {

    public static void main(String[] args) {

        // String'i  array'a cevirme...split()-> girilen parametre değere göre String ifade parçalanır.

        String str = " tam oturmasi icin birkac ornek daha gerekir  "  ;

       String [] yeniArr =  str.trim().split(" ");// string array e cevrildi

        System.out.println("str = " + str);//str =  tam oturmasi icin birkac ornek daha gerekir
        System.out.println("Arrays.toString(yeniArr) = " + Arrays.toString(yeniArr));

        System.out.println("yeniArr.length = " + yeniArr.length);

        //task str objesinde  karakter sayisini kullanilmistir print etttirin
        System.out.println("str.length() = " + str.length());//str.length() = 46


        //task str objesinde kac tane harf kullanimistir print etttirin
        String bosluksuz = str.replaceAll("\\s" ,"");
        System.out.println("bosluksuz = " + bosluksuz);//bosluksuz = tamoturmasiicinbirkacornekdahagerekir

        String [] arrBosluksuz = bosluksuz.split("");

        System.out.println("Arrays.toString(arrBosluksuz) = " + Arrays.toString(arrBosluksuz));
        //Arrays.toString(arrBosluksuz) = [t, a, m, o, t, u, r, m, a, s, i, i, c, i, n, b, i, r, k, a, c, o, r, n, e, k, d, a, h, a, g, e, r, e, k, i, r]

        System.out.println("arrBosluksuz.length = " + arrBosluksuz.length);
        //arrBosluksuz.length = 37

        System.out.println("bosluksuz.split(\"\").length = " + bosluksuz.split("").length);
        //bosluksuz.split("").length = 37

    }
}
