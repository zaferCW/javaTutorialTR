package ch10_MethodCreation;

import java.util.Scanner;

public class C03_MethodCreation {
    public static void main(String[] args) {

        // task -> girilen tam sayının rakamları toplamını print eden METHOD create ediniz

        Scanner input = new Scanner(System.in);
        System.out.println("bir tam sayi gir");

        int sayi = input.nextInt();

        System.out.println("rakamlarToplami(sayi) = " + rakamlarToplami(sayi));//method call edildi

    }

    public static int rakamlarToplami(int x) {///meth create edildi
        int rakamlarToplami = 0;

        while (x > 0) {//x 0 dan  buyuk oldugu mutdetce calis
            rakamlarToplami += x % 10;  //sayinin son basamagi her seferinde 10 a bölüp kalani toplayacak
            x /= 10; //herdongude 10 a boluncexek ve bir onceki basamak atilmis olacak int sayesinde
        }
        return rakamlarToplami;
    }
}
