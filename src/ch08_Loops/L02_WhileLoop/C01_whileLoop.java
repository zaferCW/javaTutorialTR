package ch08_Loops.L02_WhileLoop;

import java.util.Scanner;

public class C01_whileLoop {
    public static void main(String[] args) {
   /*
        başlangıç ve bitiş değerleri net(bilinen değerler) olan tekrarlarda foor loop
        ama adım sayısı belli olmayıp bir şarta(duruma) bağlı olan tekrarlarda while loop kullanılmalı
         */

        // task01-> 11 den 20'ye kadar olan tamasayıları print eden code create ediniz...
        System.out.println("********  for ile cozum *******");
        for (int i = 11 ; i < 20 ; i++) {
            System.out.print(i+ " ");
        }
        System.out.println();

        System.out.println("********  while loop ile cozum *******");
        int sayi = 11;//baslangic degeri create edildi

        while (sayi < 20 ){//sartimiz sayi 20(20 dahil degil) olana kadar calismasi kontrol edildi
            System.out.print(sayi+ " ");
            sayi++ ;//sonsuz loop olmamasi icin sayi birer artirildi
        }

        //task02-> 7 kere javaCAN print eden code create ediniz...
        System.out.println("********  task02 *******");
        int count = 1 ;

        while ( count <= 7 ){

            System.out.println( count+". javaCAN");
            count++;
        }
        // task03-> 2 basamaklı tek sayıları yanyana print eden code create ediniz
        System.out.println("********  task03 *******");
        int task03Count = 11 ; //100 kadar gidicek loop

       // while (task03Count < 100 && task03Count % 2 == 1) {//tek sayi olma sarti while icine eklenirse ilk sart tutmadigi yerde kod biter loop kirilir

       //  while (task03Count < 100 || task03Count % 2 == 1) { // veya operstoru tek bir true ile calistigi icin bu kod cift leri de alir

        while (task03Count < 100 ){
            if (task03Count % 2 == 1){
                System.out.print(task03Count+ " ");

            }
            task03Count++;
        }

        // task04 -> girilen metni while loop ile  ters den print eden code create ediniz
        System.out.println("********  task04 *******");
        Scanner input = new Scanner(System.in);
        System.out.println("bir seyler gir");
        String cumle = input.nextLine();

        int uzunluk = cumle.length()-1 ;

         while (uzunluk >= 0 ){
            System.out.print(cumle.charAt(uzunluk));
            uzunluk-- ;
        }
        System.out.println();
        System.out.println("fori fora");

        for (int i = cumle.length()-1 ; i >= 0  ; i--) {
            System.out.print(cumle.charAt(i));
        }

        // task05-> girilen tamsayıya kadar tamsayıların toplamını  print eden code create ediniz...
        System.out.println("********  task05 *******");
        System.out.println(" bir tam sayi gir");

        int sayi2 = input.nextInt();
        int total = 0 ;

        while (sayi2 > 0 ){
            total += sayi2 ;
            sayi2--;
        }
        System.out.println("total = " + total);


        // task06-> girilen tamsayın faktoriyelini print eden code create ediniz...
        System.out.println("********  task06 factorial *******");
        System.out.println(" bir tam sayi gir");

        int sayi3 = input.nextInt();

        int factorial = 1 ;

        while (sayi3 > 0 ){
            factorial *= sayi3 ;
            sayi3-- ;

        }
        System.out.println("factorial = " + factorial);


    }
}
