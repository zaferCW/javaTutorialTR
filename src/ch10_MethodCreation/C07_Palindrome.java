package ch10_MethodCreation;

import java.util.Scanner;

public class C07_Palindrome {
    public static void main(String[] args) {

        /*
        girilen ifadenin polindrome olmasını kontrol eden method create ediniz...
        plindrome:her iki yönde okundugunda eşit olan ifadeler
        madam , ada ,iki asa, 121
         */
        Scanner input = new Scanner(System.in);
        System.out.println("bir kelime gir");
        String kelime = input.nextLine().toLowerCase() ;

        palindrome(kelime);
    }

    private static void palindrome(String k) {
    String ters = "";//bos konteyner olustruduldu

        for (int   i = k.length()-1  ;   i >= 0   ;  i--) {//kelime terrstten alindi
            ters += k.charAt(i);//terstten herbir karakter atandi
        }

        System.out.println("girdigin kelimenin tersi = " + ters);

        if (ters.equals(k)){//equalgnoreCase de kulanilabilinir
            System.out.println("bu kelime palindrome dur");
        }else   System.out.println("bu kelime palindrome DEGILDIR");

    }
}
