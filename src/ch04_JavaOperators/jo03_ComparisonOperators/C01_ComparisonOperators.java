package ch04_JavaOperators.jo03_ComparisonOperators;

public class C01_ComparisonOperators {
    public static void main(String[] args) {

        /*
    Comparator : Karsilastirma islemleri.
    Java'da iki variable'in degeri karlilastirildiginda Java sonuc olarak boolean(true-false) return eder

    ==	    Esit	            x == y
    !=	    Esit degil	        x != y
    >	    buyuk	            x > y
    <	    kucuk	            x < y
    >=	    buyuk esit        	x >= y
    <=	    kücük esit  	    x <= y
  Unlem isareti (!) olumsuzluk anlaminda kullanilir.
     */

        int yas1= 34;
        int yas2 = 55;

        //task yas1 ile yas2 nin esit olup omadigini kontrol eden kod yaziniz
        System.out.println("yas1 == yas2 = " + (yas1 == yas2));//yas1 == yas2 = false

        //Condition 'yas1 == yas2' is always 'false' when reached

        //olumsuz kontrol nasil yapilir
        System.out.println(yas1 != yas2); //true
        //Condition 'yas1 != yas2' is always 'true'


    }
}
