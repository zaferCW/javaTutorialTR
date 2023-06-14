package ch10_MethodCreation;

import java.util.Scanner;

public class C02_MethodCreation {
    public static void main(String[] args) {
        //task-> girilen 3 notun ortalamasını hesaplayan method create ediniz.

        Scanner input =new Scanner(System.in);
        System.out.println("1. notunu gir");
        double not1 = input.nextDouble();

        System.out.println("2. notunu gir");
        double not2 = input.nextDouble();

        System.out.println("3. notunu gir");
        double not3 = input.nextDouble();

        System.out.println("ortalamaHesapla (not1 , not2 , not3) = " + ortalamaHesapla(not1, not2, not3));


    }

    private static double ortalamaHesapla(double not1, double not2, double not3) {
        return (not1 + not2 + not3) / 3;
    }

}
