package ch09_Break_Continue;

import java.util.Scanner;

public class C06_Task {
    public static void main(String[] args) {

        // Task-> girilen 7 tamsayının 10 ile 20 arasındakileri hariç toplamını print eden code create ediniz.

        Scanner input = new Scanner(System.in);

        int sum = 0;//bu  sayilarin toplamini kaydetmek icin create edildi
        int count = 0;// bu 7 sayi alabilmek icin create edildi

        while (count < 7){
            System.out.println("sayi gir");
            int num = input.nextInt();
            if (num >= 10 && num <= 20) { //sayi 10 ile 20 arasinda ise
                count++;
                continue;
            }

            sum += num;
            count++;
        }
        System.out.println("girilen 7 tamsayının 10 ile 20 arasındakileri hariç toplamı "+sum);
    }
}
