package ch19_StringBuilder;

public class SB_OCA04 {

    public static void main(String[] args) {
        int total = 0;

        StringBuilder sb1 = new StringBuilder("Java");
        total += sb1.substring(1,2).length();
        total += sb1.substring(6,6).length();
        total += sb1.substring(6,2).length();
        //Exception in thread "main" java.lang.StringIndexOutOfBoundsException: start 6, end 6, length 4

        System.out.println("total = " + total);

    }
}
