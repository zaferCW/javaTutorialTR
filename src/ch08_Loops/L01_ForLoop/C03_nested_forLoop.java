package ch08_Loops.L01_ForLoop;

public class C03_nested_forLoop {
    public static void main(String[] args) {

        /*
        eger bir döngünün baody'sinde başka  bir döngü bulunuyorsa bu tür döngülere nested-loop->
        içiçe döngü denir
        İç döngü dış döngünün her adımda tekrar çalışır.
        içiçe döngülerde en içteki döngü en önce çalışır..
         */

        //task kat daire ornegi ile nested for loop yapiniz kat sayisi 10 . her katta daire 4

            for (int kat = 0; kat <= 10 ; kat++) {//en dis dongu
            System.out.println("suan bulundugun kat = " + kat);
            for (int daire = 1 ; daire <= 5 ; daire++ ) {//en icteki loop buradaki loop sayisi bitmeden distaki loop a gecemez
                System.out.println("daire = " + daire);

            }
        }
    }
}
