package ch10_MethodCreation.tasks10;

import java.util.Scanner;

public class Task15_UcusProject02 {
    static Scanner scan = new Scanner(System.in);
    static double ucret;
    static double yasKatsayi;
    static double yonKatsayi;

    public static void main(String[] args) {

        run();
    }
    public static void run() {

        System.out.println("Ödemeniz Gereken Ücret : " + (sehir() * yas() * yon()) + " $");
    }

    public static double sehir() {

        System.out.print("Lütfen Uçmak İstediğiniz Şehri Seçiniz : B / C / D --> ");
        char sehir = scan.next().toUpperCase().trim().charAt(0);

        switch (sehir) {
            case 'B':
                ucret = 500 * 0.1;
                break;
            case 'C':
                ucret = 700 * 0.1;
                break;
            case 'D':
                ucret = 900 * 0.1;
                break;
            default:
                System.out.println("Geçersiz Giriş Yaptınız !..");
                sehir();
        }
        return ucret;
    }

    public static double yas() {

        System.out.print("Lütfen Yaşınızı Giriniz : ");
        int yas = scan.nextInt();

        if (yas > 0) {
            if (yas < 12) {
                yasKatsayi = 0.5;
            } else if (yas < 24) {
                yasKatsayi = 0.9;
            } else if (yas > 65) {
                yasKatsayi = 0.7;
            } else
                yasKatsayi = 1;
        } else {
            System.out.println("Yaş 0 dan küçük olamaz!!..");
            yas();
        }
        return yasKatsayi;
    }

    public static double yon() {

        System.out.print("Gidiş / Dönüş için -1- Tek Yön için -2- Giriniz : ");
        int yon = scan.nextInt();

        switch (yon) {
            case 2:
                yonKatsayi = 1;
                break;
            case 1:
                yonKatsayi = 2 * 0.8;
                break;
            default:
                System.out.println("Geçersiz Seçim Yaptınız !..");
                yon();
                break;
        }
        return yonKatsayi;
    }
}
