package ch08_Loops.L01_ForLoop.Tasks08_forLoop;

import java.util.Scanner;

public class Task06_Nested {
    public static void main(String[] args) {
           /*
        task-> girilen boyutta aşağıdaki şekli  print eden code create ediniz
          Örnek Ekran çıktısı
      *
      * *
      * * *
      * * * *

         */

        Scanner input = new Scanner(System.in);
        System.out.println("Bir boyut giriniz");
        int boyut = input.nextInt();

//        for (int i = 1; i <=boyut ; i++) {
//            //i kac geliyorsa icteki loop a icteki loop i kadar calisir
//            for (int j = 1; j <=i ; j++) {//j nin sinirini i belirler. task deki sekli alabilmemiz icin
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//        // konu disi string methodu valueOf()
//
//        String hex = "1A";
//        int decimal = Integer.valueOf(hex, 16); // 1 2 3 4 5 6 7 8 9 A B C D E
//        System.out.println(decimal); // 26

      //  System.out.println(Integer.valueOf("1A", 10));













        //gulhan hanim
//        int k = boyut - 1;
//
//        for (int i = 0; i < boyut; i++) {
//            for (int j = 0; j < k; j++) {
//                System.out.print(" ");
//            }
//
//            for (int j = 0; j <= i; j++) {
//                if (j == 0 || j == i || i == boyut - 1) {
//                    System.out.print("* ");
//                } else {
//                    System.out.print("* ");
//                }
//            }
//
//            System.out.println();
//
//        }



//        //ahmet bey
//        for (int i=1;i<5;i++){
//            System.out.println("*");
//
//            for (int j=4;j>=4;j--){
//                System.out.print("*");
//            }
//
//
//        }
//asiye hanim

        for(int i = 1; i<=4;i++){
            for (int j =1; j<=i ;j++){
             //   System.out.println("* ");
                System.out.print(j + " " );
              //  System.out.print((j + " " ).replaceAll("\\d", "*"));
            }
            System.out.println();
        }


    }
}



