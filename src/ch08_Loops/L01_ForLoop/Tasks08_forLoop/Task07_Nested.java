package ch08_Loops.L01_ForLoop.Tasks08_forLoop;

import java.util.Scanner;

public class Task07_Nested {

    public static void main(String[] args) {
        /*
        girilen bir ifadenin istenen harf sayısını print eden code create ediniz

        input   : selam javaCAN'lar
        output : a sayısı : 4
         */

        Scanner input =new Scanner(System.in);
        System.out.println("bir cumle gir");
        String cumle= input.nextLine();

        System.out.println("hangi karakterin sayisini istiyorsun");
        //char da aliabilirsin String de


        //1. yol
     //   char harf=input.next().charAt(0);

        //length() son karakteri asar. o yuzden sinirimiz length()-1 olmali
        //bu for loop u alinan cumlenin her bir karakterinde dolasmak icin kullandik
        //bize bunu saglayan ozellik index. yani index de dolasiyoruz
        //i sifirdanan baslamali. cunku index 0 dan baslar

        int count=0; //bizden bir sayi istiyor dolasiyla boos bir int variable create edildi
        //sayac mantigi

//        for (int i = 0; i <= cumle.length()-1 ; i++) {//cumlenin basindan sonuna kadar yani uzunluk isin icine girecek lenght()
//            if (cumle.charAt(i) == harf){
//
//                count++; //
//
//            }
//
//        }
 //       System.out.println("girdigin cumle  "+cumle+" de  "+harf+" harfi "+count + " tane var");



        //2. yol
        String harfString=input.next();
        //count yukarda var onu artiririz
        for (int i = 0 ; i < cumle.length() ; i++) {//i degerleri indexi temsil ettiriyoruz

            if (cumle.substring( i , i+1 ).equals(harfString)){//contains
                count++;
            }


        }
        System.out.println("girdigin cumle  "+cumle+" de  "+harfString+" harfi "+count + " tane var");








    }
}
