package ch02_DataTypes_WrapperClass;

public class C02_SwapInterviewQuestion {
    public static void main(String[] args) {

         /*
        TASK :
        Verilen sayi1 ve sayi2 variable’larinin degerlerini degistiren (SWAP)
        code create edip print ediniz.
        a) 3. bir variable kulanarak
        b) 3. bir variable kullanmadan

	     input	: sayi1=20 ve sayi2=34;

		 output  :  sayi1=34 ve sayi2=20

         */
        // 1. adim 3. bir variable create ederek basla
        int sayi1 = 20 ;
        int sayi2 = 34;
        int temp;

        System.out.println("Swap isleminden once sayi1 = "+sayi1+ " sayi2 = "+sayi2);

        //2. adim bos olan temp e sayi1 i atayalim
        temp = sayi1 ;

        //3.adim sayi1 e sayi2 degeri atayalim
        sayi1 = sayi2 ;


        //4.. adim sayi2 ye temp de saklanan degeri ata
        sayi2 = temp ;

        System.out.println("Swap isleminden sonra sayi1 = "+sayi1+ " sayi2 = "+sayi2);


        //b 3. variable kulanilmadan cozum

        System.out.println("Swap isleminden once sayi1 = "+sayi1+ " sayi2 = "+sayi2);

        sayi1 = sayi2 + sayi1 ;  //54

        sayi2 = sayi1 - sayi2 ; //20

        sayi1 = sayi1 - sayi2 ; //34

        System.out.println("Swap isleminden sonra sayi1 = "+sayi1+ " sayi2 = "+sayi2);




    }
}
