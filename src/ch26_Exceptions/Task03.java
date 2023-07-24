package ch26_Exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {

        //'ortalama' isminde bir method create ediniz ve int v  - int f  isminde 2 adet parametresi olsun.
        //int v = vize
        //int f = final

        //Eğer  vize 100 den büyük, veya final 100'den büyük, veya vize 0'dan küçük, veya final 0'dan küçük ise,
        //Sistem ArithmeticException hatası versin ve "Notlar 0-100 arasında olmalı" mesajını döndürsün.

        //Diğer durumlarda ise,
        //vizenin yüzde 40 ını, finalin yüzde 60 ını alsın ve toplasın.(ortalama =)

        //Programın çalışmasını sağlayın. (handle edin)


        Scanner input = new Scanner(System.in);
        int vizeNot = 0;
        int finalNot = 0;

        while (true){
            try {
                System.out.println("vize gir");
                 vizeNot = input.nextInt();
                if (vizeNot < 0 || vizeNot > 100){
                    throw new ArithmeticException();

                }else break;
            }catch (ArithmeticException e){
                System.out.println(" not 0 ile 100 arasinda olmaloi");
            }catch (InputMismatchException e){
                System.out.println("hatali giris yaptin");
            }
        }
        while (true){
            try {
                System.out.println("final gir");
                 finalNot = input.nextInt();
                if (finalNot < 0 || finalNot > 100){
                    throw new ArithmeticException();

                }else break;
            }catch (ArithmeticException e){
                System.out.println(" not 0 ile 100 arasinda olmaloi");
            }catch (InputMismatchException e){
                System.out.println("hatali giris yaptin");
            }

        }

        ortalama(vizeNot,finalNot);
    }//main sonu
    private static void ortalama(int v , int f){
        double ortalama = (v*0.4 + f*0.6);
        System.out.println("ortalama = " + ortalama);

        if (ortalama >= 65 ) System.out.println("basarilisin");
        else System.out.println("kaldin");
    }
}
