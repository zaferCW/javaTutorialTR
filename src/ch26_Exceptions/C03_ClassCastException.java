package ch26_Exceptions;

public class C03_ClassCastException {
    public static void main(String[] args) {

        // ClassCastException -> Biribirne dönüştürülemeyen data type'lar biribirine dönüştürüldüğünde oluşan
        // RTE Exception dur

        Object obj = "javadan sudan konusuyoruz";
        String str = (String) obj; //aslinda parent class tanimlanmis String bir variable String e cast edildi
        System.out.println("str = " + str);

        Object sayi = 10;
     //   String str2 = (String) sayi;
     //RTE   System.out.println("str2 = " + str2);
        //Exception in thread "main" java.lang.ClassCastException

        try {
            String str2 = (String) sayi;
        } catch (ClassCastException e) {
            System.out.println("integer deger String e cast edilemez");
        }


        try {
            String str3 = (String) obj;
            System.out.println("bu kodu okuduysan kod hatasiz calismis demektir");
        } catch (Exception e) {
            System.out.println("cast islemi basarisiz oldu");
        }


        System.out.println("bu kod calisir mi?");

    }
}
