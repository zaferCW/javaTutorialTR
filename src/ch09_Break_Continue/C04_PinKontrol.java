package ch09_Break_Continue;

import java.util.Scanner;

public class C04_PinKontrol {

    public static void main(String[] args) {
        // Task -> String data type bir pin datasının 3 giriş hakkına gore kontrol eden code create ediniz.
        Scanner input = new Scanner(System.in);

        String sifre = "12345.abs";
        int girisHakki = 3;
        while (true){//
            System.out.println("pin kod gir");
            String password = input.nextLine();

            if (sifre.equals(password)){
                System.out.println("sifre eslesti ");
                break;

            }else {
                System.out.println("sifre yanlis tekrar dene");
                girisHakki--;
                System.out.println("kalan deneme hakkin " + girisHakki);

                if (girisHakki == 0){
                    System.out.println("bloke oldun");
                    break;
                }
            }
        }
    }
}
