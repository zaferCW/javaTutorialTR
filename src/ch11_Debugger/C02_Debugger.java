package ch11_Debugger;

import java.util.Scanner;

import static ch10_MethodCreation.C05_CRUD.cikis;

public class C02_Debugger {
    //TODO buradaki methodlari ayri bir class alin, switch case leri ayri bir class a alin ve buradan run edin

    static Scanner input = new Scanner(System.in);
    static  String password =  "1234a." ;
    static double bakiye = 1000.25 ;
    static int count = 2; //kullanici yanlis girme hakki icin create edildi


    public static void main(String[] args) throws InterruptedException {
        //basit bir atm programi yaziniz
        //switch case , method creation(bakiye sorgulama, para yatir, para cekme, cikis, ve diger konulari kullnarak yaziniz
        sifreKontrol();
    }

    private static void sifreKontrol() throws InterruptedException {
        System.out.println(" **************************   ");
        System.out.println(" ***** Bankamiza hosgeldiniz *****");
        System.out.println("hosgeldiniz sifrenizi girinz");

        String sifre = input.nextLine();

        while (count > 0 ){//
            if (sifre.equals(password)){
                System.out.println("*");
                Thread.sleep(2000);
                System.out.println("**");
                Thread.sleep(2000);
                System.out.println("***");
                Thread.sleep(2000);
                System.out.println("sifre dogrulama basarili");
                anaMenu();//sifre dogru ise ana menuye yonlendir
                break;
            }else {
                System.out.println("sifre eslesmedi tekrar deene");
                sifre = input.nextLine();
                count--;
                if (count == 0 ){
                    System.out.println("kart bloke oldu");
                    break;
                }
            }
        }
    }

    private static void anaMenu() {
        System.out.println("bakiye sorgulama icin 1 \npara yatirma icin 2 \npara cekme icin 3\n" +
                " cikis icin 4 e basiniz");

        int secim = input.nextInt();

        switch ( secim){
            case 1 :
                bakiyeSorgula();
                anaMenu();
                break;
            case 2 :
                paraYatir();
                anaMenu();
                break;
            case 3 :
               paraCekme();
                anaMenu();
                break;
            case 4 :
                cikis();
                break;
            default:
                System.out.println("hatali secim yaptiniz tekrar deneyin");
                anaMenu();
                break;

        }


    }//main method sonu

    private static void paraCekme() {
        System.out.println("guncel bakiyeniz bakiye = " + bakiye);
        System.out.println("ne kadar cekmek istersin");
        double cekMiktar= input.nextDouble();

        if (cekMiktar > bakiye){
            System.out.println("bakiyen yetersiz");
        }else {
            System.out.println("cekmek isteddiginin miktar "+cekMiktar);
            System.out.println("bu tutari onayliyor muussunz ?");
            //TODO kulanicidan veri alip onaylarsa devam ettirin onaylazsa tekrar menuye yonlendiri

            bakiye -= cekMiktar ;
            System.out.println("para cekme isleminden sonra guncel bakiyeniz bakiye = " + bakiye);
        }
    }

    private static void paraYatir() {
        System.out.println("guncel bakiyeniz bakiye = " + bakiye);
        System.out.println("ne kadar yatirmak istersin");
        double yatirMiktar= input.nextDouble();
        bakiye += yatirMiktar;
        System.out.println("para yatirma isleminden sonra guncel bakiyeniz bakiye = " + bakiye);
    }


    private static void bakiyeSorgula() {
        System.out.println("guncel bakiyeniz bakiye = " + bakiye);
    }

}//class sonu
