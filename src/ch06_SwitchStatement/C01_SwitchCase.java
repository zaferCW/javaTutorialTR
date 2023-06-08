package ch06_SwitchStatement;

import java.util.Scanner;

public class C01_SwitchCase {
    public static void main(String[] args) {
        //if else sartli islemlerde
        //ternary sartli islemlerde
        //switch case i de sartli islemlerde kulanilir tek bir fark karsilastirma yapilmaz
        //ornegin kayit icin 1 e bas denilirse bunu if else ile yapilabilir switch durumuna
        // kayidi alip case e 1 verilipd islem yapilir

        //task 0 - 2  arasi girrilen rakami yazi ile yazdirirniz
        Scanner input = new Scanner(System.in);
        System.out.println("rakam gir");
        int rakam = input.nextInt();

        if (rakam == 0 ){
            System.out.println("sifir");
        } else if (rakam == 1) {
            System.out.println("bir");
        }else if(rakam == 2){
            System.out.println("iki");
        }else System.out.println(" 0 il 2 arasinda bir rakam girmeliisn");

        //switch ile
        System.out.println("switch ile kodlar");
        switch (rakam) {
            case  0 :
                System.out.println("sifir");
                break;
            case 1 :
                System.out.println("bir");
                break;
            case 2 :
                System.out.println("iki");
                break;
            default:
                System.out.println(" 0 il 2 arasinda bir rakam girmeliisn");

        }
        //switch ornegi basic olarak
        System.out.println("ana menu icin  A \nurun gostermek icin B eklemek icin C\n cikis icin Q ya basiniz");
        String islem = input. //input ile Scanner class ina ulasildi
                         next().//next methodu ile kullaniicidan veri alindi
                          toUpperCase(); // kullanicinin hgirdigi harf buyuk harf e cevrildi

        switch (islem){
            case "A"  :
                System.out.println("ana menuye hosgeldin");
                break;
            case "B"  :
                System.out.println("hangi urunleri gormek istersin");
                break;
            case "C"  :
                System.out.println("hangi urunleri eklemek istersin");
            break;
            case "Q" :
                System.out.println("cikis isleminiz yapiliyor");
                break;

        }




    }
}
