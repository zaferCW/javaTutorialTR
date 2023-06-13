package ch09_Break_Continue;

import java.util.Scanner;

public class C03_AsalKontrol {
    public static void main(String[] args) {

        //task-> girilen tamsayının asal olmasını kontrol eden code create ediniz
        //asal tamsayı: 1 ve kendisinden başka tam böleni olmayan sayılar -> asil bölünemeyen sayı

        Scanner input = new Scanner(System.in);
        System.out.println("tam sayi gir");

       int sayi = input.nextInt();
       boolean asalMi = true;

        for (int i = 2 ; i < sayi ; i++) {
            if (sayi % i == 0){
                System.out.println(sayi + " sayisi asal degil");
                asalMi = false;
                break;
            }
        }
        if (asalMi && sayi!=1){
            System.out.println(sayi + " sayisi ASAL Sayidir");
        }else System.out.println("asal degil");


        /*
        chat GPT
        Scanner scanner = new Scanner(System.in);
        int sayi;

        do {
            System.out.print("Bir tamsayı girin (0'dan farklı): ");
            sayi = scanner.nextInt();

            if (sayi <= 1) {
                System.out.println("Geçersiz bir giriş yaptınız. Lütfen 0'dan farklı bir tamsayı girin.");
            } else {
                boolean asal = true;

                for (int i = 2; i <= Math.sqrt(sayi); i++) {
                    if (sayi % i == 0) {
                        asal = false;
                        break;
                    }
                }

                if (asal) {
                    System.out.println(sayi + " bir asal sayıdır.");
                } else {
                    System.out.println(sayi + " bir asal sayı değildir.");
                }
            }
        } while (sayi != 0);
    }
}
Bu kod örneği, kullanıcıdan sürekli olarak tamsayı girişi alır ve girilen sayının asal
olup olmadığını kontrol eder. Kullanıcı 0 sayısını girene kadar döngü devam eder.
​
Do-while döngüsü, döngü bloğunu en az bir kez çalıştırır ve ardından döngü koşulunu kontrol eder.
Kullanıcının 0 girmesi durumunda döngü sona erer ve program tamamlanır. Her bir giriş için, girilen
sayının geçerlilik kontrolü yapılır (0'dan küçük veya eşitse hatalıdır). Ardından, sayının asal olup
olmadığı kontrol edilir ve sonuç kullanıcıya bildirilir.
​
         */
    }
}
