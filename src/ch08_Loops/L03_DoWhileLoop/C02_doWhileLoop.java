package ch08_Loops.L03_DoWhileLoop;

import java.util.Scanner;

public class C02_doWhileLoop {
    public static void main(String[] args) {

        //task-> girilen sayı 17 den kucuk ise "kazandınız" print eden  değilse ise sayı girişi isteyen
        //  code create ediniz...


        Scanner input = new Scanner(System.in);
        int sayi ;

        do {
            System.out.println("sayi gir");
             sayi = input.nextInt();

        }while (  sayi >= 17 );

        System.out.println(" kazandiniz ");



    }
}
