package ch05_ifStatement_TernaryOperator;

import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {

        /*
          TASK -> girilen iki sayiyi seçilen dört işlemden birine uygulayıp sonucu print eden code crate ediniz
         */

        Scanner input = new Scanner(System.in);
        System.out.println("1. sayiyi gir");
        int sayi1 = input.nextInt();

        System.out.println("2. sayiyi gir");
        int sayi2 = input.nextInt();

        //4 islem sonucuunu onceden buraya yazalim kodlari
        int toplam = sayi1 + sayi2 ;
        int cikarma = sayi1 - sayi2 ;
        int bolme = sayi1 / sayi2 ;
        int carpma = sayi1 * sayi2 ;

        System.out.println("hangi islem sonucunu gormek istersin \ntoplama icin 1 e" +
                "\ncikarma icin 2 e \nbolme icin 3 e \ncarpma icin 4 e bas");

        int secim = input.nextInt();

        if (secim ==1){
            System.out.println("toplam = " + toplam);
        } else if (secim ==2) {
            System.out.println("cikarma = " + cikarma);
        } else if (secim ==3) {
            System.out.println("bolme = " + bolme);
        } else if (secim == 4) {
            System.out.println("carpma = " + carpma);
        }else System.out.println("yanlis tuslama yaptin ");


    }
}
