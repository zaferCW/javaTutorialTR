package ch06_SwitchStatement;

import java.util.Scanner;

public class C06_SwitchCase_ATM_Project {

    //data base mantiginca bankada tutulan sifre creat edin
   static String password = "12345" ;//kullanicinin bankaa kayitli olan sifresi gibi dusunun

    public static void main(String[] args) {
         /*
    Bakıye (başlangıç bakıyesi 1000 tl) öğrenme, para yatırma ve cekme,
     çıkış işlemlerinin yapıldıgı bir
     sifre kontrol kodlari yazaqbilrisniz
     ATM app. code create ediniz
     */
        Scanner input = new Scanner(System.in);
        System.out.println("*********** Java Bank Atm sine hosgeldin ********");

        System.out.println("sifreni gir");
        String sifre = input.nextLine();

        if (sifre.equals(password)){
            System.out.println("sifreniz eslesti devam edebilrisniz");

            System.out.println("bakiye sorgulama icin 1 \npara yatirma icin 2 \n" +
                    "para cekme icin 3 \ncikis icin 4 tuslarina basini");

            int secim = input.nextInt();
            //baslangic bakiyesi create edildi
            int bakiye = 1000;

            switch (secim){
                case 1 :
                    System.out.println("bakiye = " + bakiye);
                    break;

                case 2 :
                    System.out.println("ne kadar yatirmak istersin");
                    int yatirilacakMiktar= input.nextInt();
                    bakiye += yatirilacakMiktar ;
                    System.out.println("guncel bakiyeniz = " + bakiye);
                    break;

                case 3:
                    System.out.println("ne kadar cekmek istersin");
                    int cekilecekMiktar = input.nextInt();
                    if ( cekilecekMiktar <= bakiye ){//bakiye yeterli olma senaryo su
                        bakiye -= cekilecekMiktar ;
                        System.out.println("cekilen miktar = "+ cekilecekMiktar);
                        System.out.println("kalan bakyeniz = " + bakiye);

                    }else System.out.println("bakiyen yetersiz oldugu icin cekme isleminiz basarisiz bakiyeniz = "+bakiye);
                    break;
                case  4 :
                    System.out.println("cikis yapiyorsunuz yine bekleriz ");
                    break;

                default:
                    System.out.println("hatali bir secim yaptiniz");
                    break;
            }

        }else System.out.println("hatali sifre girdiniz 2 hakkin kaldi");






    }
}
