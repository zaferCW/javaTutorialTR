package ch10_MethodCreation.tasks10;

import java.util.Scanner;

public class Task16_KelimeOyunu02 {
    static Scanner scan = new Scanner(System.in);
    static String strEk;
    static String str = "";
    static int sira = 1;
    static int puan1;
    static int puan2;


    public static void main(String[] args) {

        basla();
    }

    public static void oyun() {
        scan.nextLine();
        System.out.println();
        System.out.print(sira + ". Oyuncu Devam Dediii!! O Zaman Eklemek İstediğiniz Kelimeyi Giriniz : ");
        strEk = scan.nextLine().toUpperCase().trim();
        onArka();
        System.out.println();
        System.out.println("Girdiğiniz Kelime : " + str);
        kararKabul();
    }

    public static void onArka() {
        System.out.println();
        System.out.println("Girdiğiniz Kelimeyi öne mi arkaya mı eklemek istiyorsunuz? \nÖN : 1 \nARKA : 2");
        int onArka = scan.nextInt();
        switch (onArka) {
            case 1:
                str = strEk + str;
                break;
            case 2:
                str += strEk;
                break;
            default:
                System.out.println("Geçersiz Seçim Yaptınız!!..");
                onArka();
        }
    }

    public static void basla() {
        System.out.println();
        System.out.println("-------Kelime Oyununa Hoş Geldiniz!---------------");
        System.out.println();
        System.out.print("Oyuna " + sira + ". Oyuncu Başlıyor. Lütfen İlk Kelimeyi Giriniz : ");
        strEk = scan.nextLine().trim().toUpperCase();
        System.out.println();
        System.out.println("Girdiğiniz kelime : " + strEk);
        str = strEk;
        kararKabul();
    }

    public static void kararKabul() {
        System.out.println();
        System.out.print((sira == 1 ? 2 : 1) + ". Oyuncu " + (sira == 1 ? 1 : 2) + ". Oyuncunun Girdiği Kelimeyi Kabul Ediyor musunuz?? Evet için -1- Hayır için -2- Giriniz : ");
        int karar = scan.nextInt();
        if (karar == 1) {
            System.out.println((sira == 1 ? 2 : 1) + ". Oyuncu Kelimeyi Kabul Etti...");
            if (sira == 1)
                puan1 += strEk.length();
            else
                puan2 += strEk.length();
            puanDurumu();
            sira = sira == 1 ? 2 : 1;
            karar();
        } else if (karar == 2) {
            System.out.println("Geçersiz Kelime!! " + (sira == 1 ? 2 : 1) + ". Oyuncu Kelimeyi Kabul Etmedi :(");
            sira = sira == 1 ? 2 : 1;
            kabulEtmedi();
        } else {
            System.out.println("Yanlış karar girdiniz!.. ");
            kararKabul();
        }
    }

    public static void karar() {
        System.out.println();
        System.out.print("Sıra " + sira + " Oyuncuya Geçti. Devam Etmek İçin -1- Oyunu Sonlandırmak için -2- Giriniz :  ");
        int karar = scan.nextInt();
        switch (karar) {
            case 1:
                oyun();
                break;
            case 2:
                oyunBitti();
                break;
            default:
                System.out.println("Geçersiz Giriş Yaptınız!!...");
                karar();
        }
    }

    public static void oyunBitti() {
        System.out.println();
        System.out.println(sira + ". Oyuncu Benden Bu Kadar Dedi :)");
        puanDurumu();
        System.out.println((puan1 == puan2) ? "Oyun Berabere Dostluk Kazandı:)" : puan1 > puan2 ? "1. Oyuncu Kazandı :)" : "2.Oyuncu Kazandı :)");
        System.out.println("Yine bekleriz :)))");
    }

    public static void kabulEtmedi() {
        System.out.println();
        System.out.println("Maalesef Oyun Bitti");
        System.out.println();
        System.out.println("Kazanan oyuncu " + sira + ". oyuncu");
    }

    public static void puanDurumu() {
        System.out.println();
        System.out.println("-------PUAN DURUMU----------");
        System.out.println();
        System.out.println("1. Oyuncunun Puanı : " + puan1);
        System.out.println("2. Oyuncunun Puanı : " + puan2);
        System.out.println();

    }
}
