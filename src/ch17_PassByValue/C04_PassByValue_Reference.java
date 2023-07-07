package ch17_PassByValue;

public class C04_PassByValue_Reference {
    static double etiketFiyat  ;  //gunes ay yildiz
    static double indirimOrani ; //gunes ay yildiz

    public static void main(String[] args) {
         /*
        eger bir method Da yapılan değişiklik kalıcı olsun istenirse
        1.değişklik  yapılan variable'lar static olarak tanımlanır.
         */

        etiketFiyat = 100;
        System.out.println("method call oncesi etiket Fiyati "+ etiketFiyat);
        indirimOrani = 0.1;

        indir();  //method call  etiket fiyati method icinden 90.0
        indir();  //method call  etiket fiyati method icinden 81.0
        indir();  //method call  etiket fiyati method icinden 72.9

        System.out.println("method call sonrasi etiket Fiyati "+ etiketFiyat);

    }
    private static void indir() {
        etiketFiyat *= (1-indirimOrani) ; //etiket fiyati indirimli hale geldi
        System.out.println("etiket fiyati method icinden "+ etiketFiyat);
    }
}
