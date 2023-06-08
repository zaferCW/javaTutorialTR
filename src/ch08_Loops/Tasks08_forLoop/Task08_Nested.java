package ch08_Loops.Tasks08_forLoop;

public class Task08_Nested {
    public static void main(String[] args) {

        /*
        A
        A B
        A B C
        A B C D
        A B C D E
        A B C D E F
        şeklini yazdırınız.  65=A'nın ascıı değeri

        */

        int harf=65;
        //ASCII degeri

        for (int i = 0; i < 6 ; i++) {
            for (int j = 0; j <= i ; j++) {//j <= i neden yapiyoruz cunku cikan sekil dik ucgen oluyor
                System.out.print( (char) (harf+j)+" " );//burada ascii degerlerinden faydalanip char a casting yapip karakterlere cevirdik


               // System.out.print(  (harf+j)+" " );// bu sekilde olursa sadece ascii degerlerini yazar

            }
            System.out.println();
        }
















    }
}
