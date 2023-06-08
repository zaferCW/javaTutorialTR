package ch06_SwitchStatement;

import java.util.Scanner;

public class C05_SwitchCase {
    public static void main(String[] args) {

        // girilen ayın hangi mevsimde oldugunu print eden code create ediniz...

        Scanner input = new Scanner(System.in);
        System.out.println("ay numarasi gir");
        int ayNo = input.nextInt();

        switch (ayNo){
            default:
                System.out.println("ay rakami gir 1 ile 12 arainda");
                break;
            case 12 :
            case 1 :
            case 2 :
                System.out.println("kis mevsimi");
                break;
            case 3 :
            case 4 :
            case 5 :
                System.out.println("ilkbahar mevsimi");
                break;
            case 6 :
            case 7 :
            case 8 :
                System.out.println("yaz mevsimi");
                break;
            case 9 :
            case 10 :
            case 11 :
                System.out.println("sonbahar mevsimi");
                break;
        }
        //kodu geri getiren tuslar ctrl + z
    }
}
