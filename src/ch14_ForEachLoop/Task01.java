package ch14_ForEachLoop;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {

    /* TASK :
         Bir öğretmenden girmek istediği kadar notu alınız, ve
         ortalamayı geçen öğrenci sayısını bulan code create ediniz.

         */
        List<Integer> listNotlar = new ArrayList<>();
        Scanner input = new Scanner(System.in);

        String devamMi;
        do {
            System.out.println("istedigin kadar not gir");
            int ogrnNot = input.nextInt();
            System.out.println("devam edecek misin? devam icin (E)  devam etmek istemiyorsan (H) ye bas");
            devamMi = input.next();
            listNotlar.add(ogrnNot);

        }while (devamMi.equalsIgnoreCase("E"));

        Collections.sort(listNotlar);
        System.out.println("listNotlar = " + listNotlar);

        //ortalama hesapla
        int notlarToplami= 0;
        for (int w : listNotlar       ) {
            notlarToplami += w;
        }
        double ortalama = notlarToplami / listNotlar.size();

        System.out.println("ortalama = " + ortalama);

        //ortalama ustu olan not sayisi
        int ortalamaGecenSayi = 0;
        for (int each : listNotlar    ) {
            if (each > ortalama ){
                ortalamaGecenSayi++;
                System.out.print("ortalamayi gecen not = " + each);
            }
        }
        System.out.println();
        System.out.println("ortalamaGecenSayi = " + ortalamaGecenSayi);


    }
}
