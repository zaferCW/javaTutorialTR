package ch32_Enum.enum03;

import java.util.ArrayList;

public class Runner {
    /*  TASK :
1- Bir Kitap calss'i create ediniz, fields : name ve kategori(Enum)
2- KitapKategori adında bir enum oluşturunuz:
   KLASIK,
    ROMAN,
    FANTEZI,
    TARIH,
    EKONOMI
3-  3 kitap tanımlayınız bir ArrayList e atınız.
4-  bir kategoriye gore listeletiniz.

*/
    public static void main(String[] args) {

        Kitap kitap1= new Kitap();
        kitap1.name = "Sefiller";
        kitap1.kategori = KitapKategori.FANTEZI;

        Kitap kitap2 = new Kitap();
        kitap2.name = "Calikusu";
        kitap2.kategori = KitapKategori.TARIH;

        Kitap kitap3 =new Kitap();
        kitap3.name= "Suc ve Ceza";
        kitap3.kategori = KitapKategori.KLASIK;

        ArrayList <Kitap > kitapList = new ArrayList<>();

        kitapList.add(kitap1);
        kitapList.add(kitap2);
        kitapList.add(kitap3);

        for (Kitap each : kitapList     ) {
            if (each.kategori.equals(KitapKategori.KLASIK)){
                System.out.println(each);
            }
        }










    }

}
