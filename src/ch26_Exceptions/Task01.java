package ch26_Exceptions;

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
          /*
        Task -> Girilen password'un 6 karakterden az 10 karakterden fala olmamasını kontrol eden code create ediniz
         */
        Scanner input = new Scanner(System.in);
        System.out.println("password gir");
        String password = input.next();
        try {
            if (password.length() < 6 || password.length() > 10){
                throw new StringIndexOutOfBoundsException("Girilen password'un 6" +
                        " karakterden az 10 karakterden fazla olmamali ");
            }else System.out.println("sifen kabul edildi "+password);
        }catch ( StringIndexOutOfBoundsException ex ){
            System.out.println("ex = " + ex);
            System.out.println("catch block calisti");
        }

        System.out.println("sistem calisiyor");

        //try catch kullanmaktaki maksat exception ı kontrollü fırlatıp, akışı devam ettirmek   zeynep hanimdan

        //Kodun akışında başka şeyler de var. O hatadan bağımsız kod çalışsın istiyoruz        iclal hanimdan

    }
}
