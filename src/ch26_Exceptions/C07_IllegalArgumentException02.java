package ch26_Exceptions;

public class C07_IllegalArgumentException02 {
    public static void main(String[] args) {

        try {
            System.out.println("try block basi");
            exceptionMethod();
            System.out.println("try block sonu");
        } catch (IllegalArgumentException e) {
            System.out.println("catch clock basi");
            System.out.println("e = " + e);
            System.out.println("e.getMessage() = " + e.getMessage());
           e.printStackTrace(); //herkod bittiginde hatayi yazar
            System.out.println("catch block sonu");

        }

        System.out.println("main sonu tum kodlar calisti");

    }

    public static void exceptionMethod(){
        throw new IllegalArgumentException("Illegal Argument Exception hatasi aldin");
    }
}
