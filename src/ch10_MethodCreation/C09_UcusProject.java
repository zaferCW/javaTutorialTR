package ch10_MethodCreation;

import java.util.Scanner;

public class C09_UcusProject {

    /*
        A şehrinden uçmak isteyen bir yolcu B şehrine 500km C şehrine  700km  D şehrine  900 km mesafededir.
        Bilet tarifesi:
        km birim fiyati : 0.10$

        yolcu 12 yasindan kucukse toplam fiyat %50 indirim,

        12 ve 24 yas arasindaysa 10% indirim,

        65 yasindan buyukse 30% indirim,

        bilet gidis donus alinirrsa 20% indirim uygulayan bi app create ediniz
         */

    static Scanner input = new Scanner(System.in);
    static double fiyatB = 500 * 0.1 ;
    static double fiyatC = 700 * 0.1 ;
    static double fiyatD = 900 * 0.1 ;

    public static void main(String[] args) {
        System.out.println(" JAVA  havayollarina hosgeldiniz \nB C D rotalarindan hangine gitceksiniz");
        String rota = input.next().toUpperCase();//kullancii kucuk harf girerse bu buyuk hrefe cevrilecek

        if (rota.equals("B")  || rota.equals("C") || rota.equals("D")) {//once rota kontrolu yapildi

            System.out.println("gidis gelis indirimli almak isterseniz \ntek Yon icin 1 \ncift yon icin 2 ye basiniz");
            int ucusYonu = input.nextInt();

            System.out.println("yasinizi giriniz");
            int yas = input.nextInt();

            if  (yas > 65 )  { //yas kontrol edilip ilgili indirim uygulanacak

                if (rota.equals("B")) {  //rota B iise

                    if (ucusYonu == 2 ){  //gidis donus bilet aldiysa

                        System.out.println("******** fiyat hesaplaniyor ********");
                        System.out.println("65 yas ustu B rotasina gidis donus fiyatiniz " +
                                fiyatB * 0.8 * 0.7 * 2 +" $");

                    } else if (ucusYonu == 1) {
                        System.out.println("******** fiyat hesaplaniyor ********");
                        System.out.println("65 yas ustu B rotasina tek Yon gidis fiyatiniz " + fiyatB * 0.7  +" $");
                    }else System.out.println("yanlis bir secim yaptiniz");//1 veya 2 disinda bir tuslama yaparsa

                }
                else if (rota.equals("C")) {//C rota si icin
                    if (ucusYonu == 2 ){//gidis donus bilet aldiysa

                        System.out.println("******** fiyat hesaplaniyor ********");
                        System.out.println("65 yas ustu C rotasina gidis donus fiyatiniz " + fiyatC * 0.8 * 0.7 * 2 +" $");

                    } else if (ucusYonu == 1) {
                        System.out.println("******** fiyat hesaplaniyor ********");
                        System.out.println("65 yas ustu C rotasina tek Yon gidis fiyatiniz " + fiyatC * 0.7  +" $");
                    }else System.out.println("yanlis bir secim yaptiniz");//1 veya 2 disinda bir tuslama yaparsa

                }

                else if (rota.equals("D")) {//D rota si icin
                    if (ucusYonu == 2 ){//gidis donus bilet aldiysa

                        System.out.println("******** fiyat hesaplaniyor ********");
                        System.out.println("65 yas ustu D rotasina gidis donus fiyatiniz " + fiyatD * 0.8 * 0.7 * 2 +" $");

                    } else if (ucusYonu == 1) {
                        System.out.println("******** fiyat hesaplaniyor ********");
                        System.out.println("65 yas ustu D rotasina tek Yon gidis fiyatiniz " + fiyatD * 0.7  +" $");
                    }else System.out.println("yanlis bir secim yaptiniz");//1 veya 2 disinda bir tuslama yaparsa

                }
                else System.out.println("hatali Rota girdin 65 yasindaisiniz ");//65 yasi icin yanlis rota girme ihtimali

            }

            else if ( yas < 24 && yas >=12 ) {

                if (rota.equals("B")){//rota b ise

                    if (ucusYonu == 2 ){ //ucus yonu cift ise
                        System.out.println("**/*/*/*/*/*/*/*/*");
                        System.out.println("12 24 yas arasi B rotasina gidi gelis bilet fiyatiniz "+
                                fiyatB * 0.9 * 0.8 * 2 + " $" );

                    } else if (ucusYonu == 1) {
                        System.out.println("**/*/*/*/*/*/*/*/*");
                        System.out.println("12 24 yas arasi B rotasina tek yon bilet fiyatiniz "+
                                fiyatB * 0.9 +   " $" );
                    }else System.out.println("nasil bir rota girdin oyle ");

                }
                else if (rota.equals("C")){//rota c ise

                    if (ucusYonu == 2 ){ //ucus yonu cift ise
                        System.out.println("**/*/*/*/*/*/*/*/*");
                        System.out.println("12 24 yas arasi C rotasina gidi gelis bilet fiyatiniz "+
                                fiyatC * 0.9 * 0.8 * 2 + " $" );

                    } else if (ucusYonu == 1) {
                        System.out.println("**/*/*/*/*/*/*/*/*");
                        System.out.println("12 24 yas arasi C rotasina tek yon bilet fiyatiniz "+
                                fiyatC * 0.9 +   " $" );
                    }else System.out.println("yanlis yone gidiyorsun dikkat et ");

                }
                else if (rota.equals("D")){//rota D ise

                    if (ucusYonu == 2 ){ //ucus yonu cift ise
                        System.out.println("**/*/*/*/*/*/*/*/*");
                        System.out.println("12 24 yas arasi D rotasina gidi gelis bilet fiyatiniz "+
                                fiyatD * 0.9 * 0.8 * 2 + " $" );

                    } else if (ucusYonu == 1) {
                        System.out.println("**/*/*/*/*/*/*/*/*");
                        System.out.println("12 24 yas arasi D rotasina tek yon bilet fiyatiniz "+
                                fiyatD * 0.9 +   " $" );
                    }else System.out.println("yanlis yone gidiyorsun dikkat et ");

                }
                else System.out.println("yanlis rota 12 - 24 yas arasi yanlis rota tercihi");

            }

            else if (yas < 12) {

                if (rota.equals("B")){//b rotasi cin
                    if (ucusYonu == 2 ){
                        System.out.println("/*/*/**-/-/*-/*-/*/*-/*-/");
                        System.out.println("yas 12 den kucuk B rotasina cift yon bilet fiyatiniz " +
                                fiyatB * 0.5 *0.8 *2+" $" ) ;
                    } else if (ucusYonu == 1) {
                        System.out.println("/*/*/**-/-/*-/*-/*/*-/*-/");
                        System.out.println("yas 12 den kucuk B rotasina tek yon bilet fiyatiniz " +
                                fiyatB * 0.5 + " $" ) ;
                    }else System.out.println(" oyle bir yon yok");
                }

                 else if (rota.equals("C")){//C rotasi cin
                    if (ucusYonu == 2 ){
                        System.out.println("/*/*/**-/-/*-/*-/*/*-/*-/");
                        System.out.println("yas 12 den kucuk C rotasina cift yon bilet fiyatiniz " +
                                fiyatC * 0.5 *0.8 *2+" $" ) ;
                    } else if (ucusYonu == 1) {
                        System.out.println("/*/*/**-/-/*-/*-/*/*-/*-/");
                        System.out.println("yas 12 den kucuk C rotasina tek yon bilet fiyatiniz " +
                                fiyatC * 0.5 + " $" ) ;
                    }else System.out.println(" oyle bir yon burasi C yok");

                }

                else if (rota.equals("D")){//D rotasi cin
                    if (ucusYonu == 2 ){
                        System.out.println("/*/*/**-/-/*-/*-/*/*-/*-/");
                        System.out.println("yas 12 den kucuk D rotasina cift yon bilet fiyatiniz " +
                                fiyatD * 0.5 *0.8 *2+" $" ) ;
                    } else if (ucusYonu == 1) {
                        System.out.println("/*/*/**-/-/*-/*-/*/*-/*-/");
                        System.out.println("yas 12 den kucuk D rotasina tek yon bilet fiyatiniz " +
                                fiyatD * 0.5 + " $" ) ;
                    }else System.out.println(" oyle bir yon burasi D yok");

                }
                else System.out.println("rota secimin yanlis 12 yasin altindasin"); //yas 12 alti iicn yanlis rota kontrolu

            }

            else{//24 ve 65 yas arasi yas buraya duser
                System.out.println("sana ozel indirim yok");

                if (rota.equals("B")){
                    if (ucusYonu == 2){
                        System.out.println("/*/-**/-/*/-*/*/*-/-*/*");
                        System.out.println("24 - 65 yas arasi B rotasina cift yon bilet fiyatimiz " +
                                fiyatB* 0.8 *2 + " $");
                    }else if (ucusYonu == 1){
                        System.out.println("/*/-**/-/*/-*/*/*-/-*/*");
                        System.out.println("24 - 65 yas arasi B rotasina tek yon bilet fiyatimiz " +
                                fiyatB  + " $");
                    }else System.out.println("yon yanlis dikat");
                }
              else if (rota.equals("C")){
                    if (ucusYonu == 2){
                        System.out.println("/*/-**/-/*/-*/*/*-/-*/*");
                        System.out.println("24 - 65 yas arasi C rotasina cift yon bilet fiyatimiz " +
                                fiyatC* 0.8 *2 + " $");
                    }else if (ucusYonu == 1){
                        System.out.println("/*/-**/-/*/-*/*/*-/-*/*");
                        System.out.println("24 - 65 yas arasi C rotasina tek yon bilet fiyatimiz " +
                                fiyatC  + " $");
                    }else System.out.println("yon yanlis dikat");
                }
                else if (rota.equals("D")){
                    if (ucusYonu == 2){
                        System.out.println("/*/-**/-/*/-*/*/*-/-*/*");
                        System.out.println("24 - 65 yas arasi D rotasina cift yon bilet fiyatimiz " +
                                fiyatD * 0.8 *2 + " $");
                    }else if (ucusYonu == 1){
                        System.out.println("/*/-**/-/*/-*/*/*-/-*/*");
                        System.out.println("24 - 65 yas arasi D rotasina tek yon bilet fiyatimiz " +
                                fiyatD  + " $");
                    }else System.out.println("yon yanlis dikat");
                }
                else System.out.println("yas 24 65 arasi icin yanlis rota else");//yas 24 65 icin yanlis rota

            }


        }else System.out.println("yanlis ROOTA girdiniz");// ilk if in else body si




    }

}
