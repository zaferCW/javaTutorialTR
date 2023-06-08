package ch05_ifStatement_TernaryOperator;

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {

        /*
         Kullanicidan 0 ile 100 arasi notunu isteyin.
         Not’u harf sistemine cevirip yazdirin.
         50’den kucukse “D”,->1,2,3..49
         =50  < 60 arasi “C”,->50,51,52,..59
         =60  < 80 arasi “B”,->60,61,62,63..79
         =80’nin uzerinde ise “A”->80,81..100
         */
        Scanner input = new Scanner(System.in);
        System.out.println("notunu gir");

        int not = input.nextInt();

        if (not < 0){//negatif girme ihtimali caliisldil
            System.out.println("giridigin not negatif ve gecersiz");
        } else if (not < 50 ) {//50’den kucukse “D”,->1,2,3..49
            System.out.println("D");
        } else if (not >=50 && not < 60) {//=50  < 60 arasi “C”,->50,51,52,..59
            System.out.println("C");
        }else if (not>= 60 && not< 80){//=60  < 80 arasi “B”,->60,61,62,63..79
            System.out.println("B");
        } else if ( not >= 80  && not <=100) {// =80’nin uzerinde ise “A”->80,81..100
            System.out.println("A");
        }else System.out.println("girigi deger 100 den buyuk tur gecersiz not girdinz");


    }
}
