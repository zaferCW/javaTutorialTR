package ch08_Loops.L01_ForLoop;

public class C05_PatternQuestion {
    public static void main(String[] args) {
         /*
        A
        A B
        A B C
        A B C D
        A B C D E
        A B C D E F
        şeklini yazdırınız.  65 = 'A'nın ascıı değeri
        */

        int harf = 65 ;//ascii degeri kullanilmasi icin create edildi
        //65 den baslatma sebebi A nin ascii degerinin 65 olmasi

        for (int i = 0; i < 6  ; i++) {
            for (int j = 0; j <= i  ; j++) {
              //  System.out.print("* ");
                System.out.print( (char) (harf + j) + " "  );
            }
            System.out.println();//dummy kod bos kod isi sadece her icteki donguiden sonra alt satira gecirmek
        }









    }
}
