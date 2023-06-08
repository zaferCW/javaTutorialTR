package ch05_ifStatement_TernaryOperator;

import java.util.Scanner;

public class C02_ifStatement {

    public static void main(String[] args) {

       // TASK-> girilen yasın 18 den buyuklugunu kontrol eden code create ediniz
        //    18 den kuçuk ise ehliyet alamazsınız print ediniz

        Scanner input = new Scanner(System.in);
        System.out.println("yasini gir");

        int yas = input.nextInt();

        if (yas >= 18){//yasin 18 ve daha buyul olup olmadigi kontrol edildi
            System.out.println("ehliyet alma sansiniz var");
        }else {//yularida sarttan sonra else yas 18 den kucuk use calisir
            System.out.println("ehliyet alamazsınız");
        }





    }
}
