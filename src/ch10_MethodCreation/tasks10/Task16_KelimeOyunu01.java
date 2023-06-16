package ch10_MethodCreation.tasks10;


import java.util.Scanner;


public class Task16_KelimeOyunu01 {
    //her metodda kullaancağım için aşağıdaki scan ve veriable'leri  classlevel'a aldım
    static int oyuncu = 1;//oyuncuyu önce 1 yani 1. oyuncu olarak başlangıç değeri ile atadım sonra oyuncu değiştireceğim zaman oyuncu=1 yerine oyuncu=2 atayacağım
    static int puan1 = 0;
    static int puan2 = 0;
    static String kelime = "";
    static String ekleme = "";
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        /* Iki kisinin oynayacagi bir kelime oyunu uretelim
         * Kurallar
         * 1- Baslangicta 1.oyuncudan bir kelime girmesini isteyin ve kelimeyi yazdirin
         *
         * 2- 1.oyuncu kelimeyi girince 2.oyuncuya kelimeyi kabul edip etmedigini sorun.
         *      * Eger kelimeyi kabul ederse onceki oyuncuya kelimedeki harf sayisi kadar puan ekleyin
         *        ve 3.adima gecin
         *      * girilen kelimeyi kabul etmezse "gecersiz kelime" yazdirin ve onceki oyuncunun
         *        kazandigini yazip oyunu bitirin
         *
         * 3- yeni oyuncuya oyuna devam etmek isteyip istemedigini sorun
         *      * devam etmek isterse kelimeye eklemek istedigi string'i ve
         *          basa mi sona mi ekleyecegini sorun
         *          aldiginiz string'i kelimeye ekleyip 2.adima gidin
         *
         *      *   Devam etmek istemezse
         *          "Oyun bitti" yazin
         *          kullanicilarin puanlarini ve kazanan oyuncuyu yazdirin
         */

        System.out.print(oyuncu + ". oyuncu lutfen kelime giriniz :");//ilk oyunucudan oyuna başlama kelimesi istedim
        kelime = scan.next();//oyuncunun vediği kelimeyi class level'da hiçlik olarak ilk değerini verdiğim "kelime" değişkenine atadım

        // oyuncuyu degistirmek icin bir method yazmalıyız.
        oyuncuDegistir();

        onaySor();
    }

    public static void onaySor() {
        System.out.println("Girilen kelime : " + kelime);//girilen ilk oyuna başlama kelimesini gösterdim
        System.out.println(oyuncu + ". oyuncu girilen kelimeyi kabul ediyor musun ? \n1: Evet \n0: Hayir");

        int kabul = scan.nextInt();
        if (kabul == 1) {   // 1 tercihi girilen kelimeyi kabul ediyor demektir

            if (oyuncu == 1) {//işlemi yapan oyuncu 1. oyunucu ise....
                puan2 += kelime.length();//puanı 2. oyuncuya kelime harf saysı kadar ekledik.
            } else puan1 += kelime.length();//else:puanı 1. oyuncuya kelime harf saysı kadar ekledik.
            oyunaDevamEdecekmi();

        } else oyunuBitir(); //else:0 yani girilen kelimeyi kabul etmiyor demektir
    }

    private static void oyunaDevamEdecekmi() {
        System.out.println("Oyuna devam etmek istiyor musunuz? "
                + "\n1: Evet \n0: Hayir");
        int tercih = scan.nextInt();
        if (tercih == 1) {//1 seçimi oyune davam edecek anlamında
            kelimeEkle();
        } else {
            System.out.println("Oyun bitti");
            System.out.println("1.oyuncu puanı : " + puan1);
            System.out.println("2.oyuncu puanı : " + puan2);
            if (puan1 > puan2) {
                System.out.println("1.oyuncu kazandi");
            } else if (puan2 > puan1) {
                System.out.println("2.oyuncu kazandi");
            } else System.out.println("oyun berabere bitti");
        }
    }

    public static void kelimeEkle() {
        System.out.print("eski kelimeye eklemek icin yeni bir kelime giriniz :");
        ekleme = scan.next();
        System.out.println("yeni kelimeyi basa mi sona mi eklemek istersiniz "
                + "\n 1:basa ekle 0:sona ekle");
        int tercih = scan.nextInt();
        if (tercih == 1) {
            kelime = ekleme + kelime;
        } else kelime = kelime + ekleme;
        oyuncuDegistir();
        onaySor();
    }

    private static void oyunuBitir() {
        System.out.print("oyunu " + oyuncu + ". oyuncu oyunu kazandi. Cunku diger oyuncu yanlis kelime girdi");
    }

    public static void oyuncuDegistir() {
        if (oyuncu == 1)
            oyuncu = 2;
        else
            oyuncu = 1;
    }






























}
