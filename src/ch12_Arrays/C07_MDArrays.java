package ch12_Arrays;

public class C07_MDArrays {
    public static void main(String[] args) {

        // task ->aprMD tum elemanlarını toplayan code create ediniz  toplam = 142
    int [] [] aprMD = {
            {       1, //0. daire
                    2, //1. daire
                    3  //2.daire
            }, //0.kat

            {10,23 }, //1. kat

            {103 }   //2. kat
    };

    int toplam =0;

        for (int kat = 0; kat < aprMD.length ; kat++) {//apr lenth 3 dur

            for (int daire = 0 ; daire < aprMD[kat].length  ; daire++) {

                toplam += aprMD[kat][daire] ;//her bir katta ki daireye ayri ayri ulasip toplama atar

            }
            System.out.println("toplamicteki looptan = " + toplam);

        }

        System.out.println("toplam = " + toplam); //toplam = 142


    }
}
