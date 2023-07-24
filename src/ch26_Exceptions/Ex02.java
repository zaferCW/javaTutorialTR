package ch26_Exceptions;

public class Ex02 {
    public static void main(String[] args) {

        // Aşağıdaki code output ne olur ?

        System.out.println(exceptions());//acde
    }
   @SuppressWarnings(("catch"))
    public static String exceptions() {
        String result = "";
        String v = null;
        try {
            try {
                result += "a";
                v.length();
                result += "b";

            } catch (NullPointerException e) {
                result += "c";
            } finally {
                result += "d";
                throw new Exception();
            }
        } catch (Exception e) {
            result += "e";
        }
        return result;

    }
}
