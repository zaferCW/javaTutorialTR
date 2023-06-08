package ch04_JavaOperators.jo01_ArithmeticOperators;

public class C04_MathMethods {

    public static void main(String[] args) {

        /*
     Math.abs(a)
     Girilen degerin mutlak degerini verir.

    Math.max(a, b)
    Girilen iki degerden buyuk olani verir.

    Math.min(a, b)
    Girilen iki degerden kucuk olani verir.

    Math.round(a)
    Girilen degerin en yakin tamsayiya yuvarlar.

    Math.sqrt(a)
    Girilen degerin karekokunu verir.

    Math.pow(a, b)
    Girilen a ve b degerini a uzeri b olarak verir.

    Math.ceil(a) 3.1 => 4
    Girilen bir ondalikli sayiyi bir sonraki en yakin tam sayiya yukseltir.

    Math.floor(a) 3.7 => 3
    Girilen bir ondalikli sayiyi bir onceki en yakin tam sayiya indirger.
     */

        int a = 9 ;
        System.out.println("Math.pow(a,2) = " + Math.pow(a, 2));//Math.pow(a,2) = 81.0

        System.out.println("Math.sqrt(a) = " + Math.sqrt(a));//Math.sqrt(a) = 3.0

        //bir method veya bir variable a ulasmak istersek ya O methodun bulundugu class in isminden gidicez
        //yada methodun bulundugu class dan obje create edip o objeden gidicez

    }
}
