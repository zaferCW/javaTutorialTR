package ch06_SwitchStatement;

import java.util.Scanner;

public class C04_SwitchCase {
    public static void main(String[] args) {

        // Girilen ay numarasına göre kaç gün çektiğini print eden code create ediniz...
        // break in ozelligini kullanin
        // 29 subat icin sartlarini hatirlayiniz

        Scanner input = new Scanner(System.in);
        System.out.println("ay numarasi gir");
        int ayNo = input.nextInt();

        switch (ayNo) {
            default:
                System.out.println("dogru bir ay numarasi gir 1 12 arasi");
            break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("girdiginiz ay 31 gun icerir");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("girdigin ay 30 gun icerir");
                break;
            case 2://iki durum 28 29 olmasi
                System.out.println("yilini gir");
                int yil = input.nextInt();

                if ( (yil % 4 == 0 && yil % 100 != 0 )  || yil % 400 == 0 ){
                    System.out.println("subat 29 gun icerir bu "+yil + " yilinda");
                }else System.out.println("28 gun icerir");

                //safvet bey den
                /*
                System.out.println(yil % 4 == 0 ? "girilen ayda 29 gün vardır" : "girilen ayda 28 gün vardır");
                    break;
                 */

            break;
        }
    }
}
