package ch10_MethodCreation;

import java.util.Scanner;

import static ch10_MethodCreation.C05_CRUD.cikis;

public class C08_AtmProject {

    static Scanner input = new Scanner(System.in);
    static  String password = "1234a.";
    static double bakiye = 1000.25;
    static int count =3;//kullanici yanlis girme hakki icin create edildi


    public static void main(String[] args) {
        //basit bir atm programi yaziniz
        //switch case , method creation, ve diger konulari kullnarak yaziniz
        sifreKontrol();
    }

    private static void sifreKontrol() {
        System.out.println(" **************************   ");
        System.out.println(" ***** Bankamiza hosgeldiniz *****");
        System.out.println("hosgeldiniz sifrenizi girinz");

        String sifre = input.nextLine();

        while (count > 0 ){//
            if (sifre.equals(password)){
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
             //   bakiyeSorgula();
                anaMenu();
                break;
            case 2 :
             //   paraYatir();
                anaMenu();
                break;
            case 3 :
              //  paraCekme();
                anaMenu();
                break;
            case 4 :
                cikis();
            default:
                System.out.println("hatali secim yaptiniz tekrar deneyin");
                anaMenu();
                break;

        }



    }


}
