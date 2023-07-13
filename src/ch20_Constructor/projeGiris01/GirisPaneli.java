package ch20_Constructor.projeGiris01;

import java.util.Scanner;

import static ch20_Constructor.projeGiris01.KayitMethodlari.kullaniciList;

public class GirisPaneli {

    public void giris() {

        KayitMethodlari obj = new KayitMethodlari();
        Scanner in=new Scanner(System.in);
        System.out.println("yapaacaan islemi sec" +
                "  \n1 -> kayit ol \n2 -> sansli kisi bul " +
                "\n3 -> tum kullanicilari listele \n4 -> cikis");

        int secim= in.nextInt();
        switch (secim){
            case 1:
                obj.kayitAl();
                giris();
                break;
            case 2:
                obj.sansliKullanici(kullaniciList);
                giris();
                break;
            case 3:
            obj.listele();
            giris();
            break;
            case 4:
                obj.cikis();
                break;
            default:
                System.out.println("yanis tuslama yaptin tekrar denee");
                giris();
                break;

        }





    }
}
