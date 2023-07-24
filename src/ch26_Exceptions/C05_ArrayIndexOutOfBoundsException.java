package ch26_Exceptions;

public class C05_ArrayIndexOutOfBoundsException {
    public static void main(String[] args) {
        // ArrayIndexOutOfBoundsException -> array'lerde olomayan bir index elelmanı ile işlem
        // yapıldığında oluşan RTE exception.

        int [] arr = {22,55,35,34,33,63,21,72};
        System.out.println("arr[0] = " + arr[0]);

      //RTE   System.out.println("arr[8] = " + arr[8]);
        //Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException:

        try {
            System.out.println("arr[8] = " + arr[8]);
            System.out.println("bu kodu okuduysan hata olusmamistir");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("ArrayIndexOutOfBoundsException hatasi aldin");
        }


        System.out.println("hata handle edildi app uygun calismakta");
    }
}
