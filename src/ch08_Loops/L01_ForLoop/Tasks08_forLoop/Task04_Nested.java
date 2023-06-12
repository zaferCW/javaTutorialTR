package ch08_Loops.L01_ForLoop.Tasks08_forLoop;

import java.util.Scanner;

public class Task04_Nested {
    public static void main(String[] args) {
        /*
        Task ->
        girilen boyuttta bir kare için
         Ekran Çıktısı
            Bir sayı giriniz: 7
            1 0 0 0 0 0 0
            0 1 0 0 0 0 0
            0 0 1 0 0 0 0
            0 0 0 1 0 0 0
            0 0 0 0 1 0 0
            0 0 0 0 0 1 0
            0 0 0 0 0 0 1


            Bir sayi giriniz: 5
            1 0 0 0 0
            0 1 0 0 0
            0 0 1 0 0
            0 0 0 1 0
            0 0 0 0 1

            şekli print eden code create ediniz
         */

        Scanner input = new Scanner(System.in);
        System.out.println("bir sayi giriniz size sekil yapalim");
        int sinirlar = input.nextInt();

        for (int i = 1; i <=sinirlar ; i++) {//onemli nokta her iki loop un ayni noktadan baslayiup ayni noktada bitmesidir. kare istedigi icin
            for (int j = 1; j <=sinirlar ; j++) {
                if (i==j){
                    System.out.print("1 ");
                }else System.out.print("0 ");



            }
            System.out.println();
        }


        //asiye hanim
        System.out.println("birim matris=");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {

                if (i == j) {
                    System.out.print( " 1 ");

                } else {
                    System.out.print( " 0 ");
                }

            }
            System.out.println();//dummy kod yukaridaki print methodu kulllanilinca bir alt satira gecmeyecegi icin yazildi
        }


    //gulhan hanim
    for (int i = 1; i <= sinirlar; i++) {
        for (int j = 1; j <= sinirlar; j++) {
            if (i == j) {
                System.out.print("1 ");
            } else {
                System.out.print("0 ");
            }
        }
        System.out.println();
    }










    }
}
