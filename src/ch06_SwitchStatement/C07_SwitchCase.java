package ch06_SwitchStatement;

import java.util.Scanner;

public class C07_SwitchCase {
    public static void main(String[] args) {

        // TASK-> Girilen haftanın gününü hafta içi veya sonu oldugunu print eden code create ediniz..

        Scanner input = new Scanner(System.in);
        System.out.println("gun ismi gir");

        String gun = input.nextLine()
                .toUpperCase();//ne girerse girsin buyuk harfe cevirir
        System.out.println("gun = " + gun);

        switch (gun) {
            case "PAZARTESI":
            case "SALI":
            case "CARSAMBA":
            case "PERSEMBE":
            case "CUMA":
                System.out.println("girilen gun hafta icidir");
                break;
            case "CUMARTESI":
            case "PAZAR":
                System.out.println("hafta sonu");
                break;
        }
    }
}
