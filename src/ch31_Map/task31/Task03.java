package ch31_Map.task31;

import java.util.HashMap;
import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {


        ///			KELİME ANALİZİ

        /*
         * Girilen bir metinde kelimelerin kaç kere geçtiğini bulan program yazınız.
         *
         * 1. Adım : ( Kelime = Kaç Kere Geçiyor ) Şeklinde veri tutmak için HashMap oluşturun.
         * 2. Adım : Girilen metni split methodu ile parçalayalım.
         * 			 ilk önce "." ya göre parçalayıp cümleleri elde edelim
         * 			 daha sonra " " boşluğa göre parçalayıp kelimeleri elde edelim
         * 3. Adım : Tüm kelimeleri kontrol etmek için for döngüsü kullanalım ve tüm kelimeleri
         * oluşturduğumuz hashMap'e aktaralım.
         * 			 Eğer hashmap'te yoksa ekleyelim ve sayısına 1 yazalım.
         * 		 	 Eğer hashmap'te zaten varsa, sayısını bir artıralım.
         * 3. Adım : Tüm kelimeler kontrol edildikten sonra çıktı verelim.
         * Ve tüm kelimeleri tekrar sayısıyla birlikte gösterelim.
         *
         * İpucu : "." özel karakter olduğu için "\\." şeklinde split ediniz.
         * */

        HashMap < String , Integer > kelimelerMapi=new HashMap<>();
        //key kelime olcak integer kac kere gectigi olcak

        Scanner input = new Scanner(System.in);
        System.out.println("kelime analizi icin metin gir");

        String metin =input.nextLine();

        String [] cumleler = metin.split("\\.");

        for (int i = 0; i < cumleler.length ; i++) {
          String [] kelimeler=  cumleler[i].trim().split(" ");

            for (int j = 0; j < kelimeler.length ; j++) {
                if (kelimelerMapi.get(kelimeler[j]) == null){//bu key map de eger yoksa
                    kelimelerMapi.put(kelimeler[j], 1);
                }else {
                    int count = kelimelerMapi.get(kelimeler[j]) ;
                    kelimelerMapi.put(kelimeler[j] , count + 1);
                }
            }
        }


        for (String each: kelimelerMapi.keySet()  ) {

            System.out.println(each+" : "+ kelimelerMapi.get(each));
            //get methduna key verilnce bize value veririz
            System.out.println("each = " + each);
        }









    }
}
