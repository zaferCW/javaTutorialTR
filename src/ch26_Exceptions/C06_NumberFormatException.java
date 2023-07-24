package ch26_Exceptions;

public class C06_NumberFormatException {
    public static void main(String[] args) {
        // NumberFormatException -> Sayi formatın olmayan bir datayı parseInt() method runn ederek ınteger'e
        // cevirildiğinde oluşan RTE exception
        // java'da String içinde ki rakam karakterler parseInt() method ile ınt değere atanabilir


        String str = "1516";

        System.out.println("str = " + (str+53));//

        int sayi = Integer.parseInt(str);
        System.out.println("sayi = " + (sayi+53));  //sayi = 1569

        String id = "id12345";
       //RTE  int sayi2 = Integer.parseInt(id);
        //Exception in thread "main" java.lang.NumberFormatException: For input string: "id12345"


        try {
            int sayi2 = Integer.parseInt(id);
            System.out.println("bu mesaj hatasiz kod mesajidir");
        } catch (NumberFormatException e) {
            System.err.println("Exception in thread \"main\" java.lang.NumberFormatException: For input string: \"id12345\"");
        }

        //exception olmayan kod

        try {
            int sayi3 = Integer.parseInt( str );//hatasiz parse islemi
            System.out.println("bu mesaj hatasiz kod mesajidir");
        } catch (NumberFormatException e) {
            System.err.println(".NumberFormatException: For input string: \"id12345\"");
        }


    }
}
