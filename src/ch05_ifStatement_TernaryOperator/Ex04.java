package ch05_ifStatement_TernaryOperator;

import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
         /*
          TASK -> girilen bir ifadenin ilk karakterinin harf  olup olmadığını  kontrol eden code create ediniz..

         */

        Scanner input = new Scanner(System.in);
        System.out.println("bir ifade gir");

        char ilkKarakter = input.next().charAt(0);//girilen ifadenin ilk karakteri charAt(0) ile alinip atandi
        //onemli hatirlatma char variable lar matemtiksel ve karsilaastirmali islemlerde ASCII degerine gore islem yapar

        //bu ne demek ilkKarakter >= 'A' && ilkKarakter <= 'Z'    => ilk karakter A ile Z arasinda mi
        //zeynep hanimdan => ilk karakter a ascii değerinden büyük z ascii değerinden küçükse harftir

        if (ilkKarakter >= 'A' && ilkKarakter <= 'Z' || ilkKarakter >= 'a' && ilkKarakter <= 'z' ){
            System.out.println("girdigin ifadenin ilk karakteri harf tir " +ilkKarakter);
        }
        else System.out.println("giridigin ifadenin ilk karakteri harf degildir " +ilkKarakter);



    }
}
