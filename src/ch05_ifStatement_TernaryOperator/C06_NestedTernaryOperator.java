package ch05_ifStatement_TernaryOperator;

import java.util.Scanner;

public class C06_NestedTernaryOperator {
    public static void main(String[] args) {
         /*
        TASK :
       Kullanicidan bir sayi aliniz
       Sayi 0 dan buyuk esit ise //nested burada devereye giricek
       10 dan kucuk olup olmadigini kontrol ediniz.

       10 dan kucuk ise ekrana "Rakam" yazdiriniz degilse "Pozitif Sayi" yazdiriniz.

       Sayi 0 dan kucuk ise ekrana "Negatif Sayi" yazdiriniz.
        */
        Scanner input = new Scanner(System.in);
        System.out.println("bir sayi gir");

        int sayi = input.nextInt();
     String result=   sayi >=0 ? //en distaki ternary operaotor sarti
                (sayi < 10 ? "Rakam " : "pozitif tamsayi")//icteki ternary operator sarti
                : //distaki sartin false olma ihtimali
                "Negatif Sayi"  ;

        System.out.println("result = " + result);


    }
}
