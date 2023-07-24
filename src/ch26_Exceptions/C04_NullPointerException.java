package ch26_Exceptions;

public class C04_NullPointerException {
    public static void main(String[] args) {
        // NullPointerException -> null ataması yapılan bir String'de length() method run edildiğnde oluşan RTE exception

        String str = "";
        System.out.println("str.length() = " + str.length());

        String str1 = null;
      //RTE  System.out.println("str1.length() = " + str1.length());
        //Exception in thread "main" java.lang.NullPointerException


        try {
            System.out.println("str1.length() = " + str1.length());
            System.out.println("bu mesaji okurssan null in length i ni aldin demektir");
        } catch (NullPointerException e) {
            System.out.println("null in length i olu mu ");
        }

        try {
            System.out.println("str.length() = " + str.length());
            System.out.println("bu mesaji okurssan \"\" in length i ni aldin demektir");

        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}
