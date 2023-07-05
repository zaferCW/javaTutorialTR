package ch15_Varargs;

public class Task02 {
    public static void main(String[] args) {

        /*
        Task ->
        array deki ilk sayı hariç diğerlerini toplayan ve toplam ile ilk sayıyı çarpan METHOD create ediniz.
         */

        int []arr = {2,55,66,88,5,2,4,5,6,3,8,55,33,34,35};

        System.out.println("toplaCarp(arr) = " + toplaCarp(arr));

    }
    public static int toplaCarp(int... var){//varargas method aldigi parametreyi array e cevirir
        int sonuc = 0 ;
        for (int i = 1; i < var.length ; i++) {
            sonuc += var[i];//ilk sayi harice tum sayilari topladik
        }
        sonuc *= var[0];//toplanan sayilari ilk sayi ile carpip ekledik

        return sonuc;
    }
}
