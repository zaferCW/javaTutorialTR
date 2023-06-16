package ch10_MethodCreation.tasks10;

import java.util.Scanner;

public class Task15_UcusProject03 {
    static Scanner scan = new Scanner(System.in);
    static double fiyatB = 500*0.1;
    static double fiyatC = 700*0.1;
    static double fiyatD = 900*0.1;

    public static void main(String[] args) {
        travel();
    }
    public static void travel() {
        System.out.print("hangi şehre gideceksiniz : B - C - D ");
        String city = scan.next().toUpperCase().trim();
        System.out.print("yaşınızı giriniz : ");
        int age = scan.nextInt();
        System.out.print("gidiş-dönüş bilet almak ister misiniz: <E>vet ya da <H>ayır : ");
        char gd = scan.next().toUpperCase().trim().charAt(0);

        switch (city) {
            case "B" : agediscount(age); flightdiscount(gd); totalbill(agediscount(age), flightdiscount(gd), fiyatB); break;
            case "C" : agediscount(age); flightdiscount(gd); totalbill(agediscount(age), flightdiscount(gd), fiyatC); break;
            case "D" : agediscount(age); flightdiscount(gd); totalbill(agediscount(age), flightdiscount(gd), fiyatD); break;
            default :
                System.out.println("hatalı giriş yaptınız");
        }
    }

    public static double agediscount(int age) {
        double agedis=1.0;
        if (age >= 65){
            agedis= 0.7;
        }else if (age >= 0 && age <12) {
            agedis= 0.5;
        }else if (age >= 12 && age <24) {
            agedis= 0.9;
        }else if (age <0){
            System.out.println("Invalid age: " + age); travel();
        }
        return agedis;
    }

    public static double flightdiscount(char gd) {
        double flighttype = 1.0;
        switch (gd) {
            case 'E' : flighttype = 0.8*2; break;
            case 'H' : break;
            default :
                System.out.println("Hatalı Giriş yaptınız. "); travel(); break;
        }
        return flighttype;
    }

    public static void totalbill(double agediscount, double flightdiscount, double fiyat) {
        double sum = agediscount * flightdiscount * fiyat;
        System.out.println("Bilet Fiyatı = " + sum);
    }

}
