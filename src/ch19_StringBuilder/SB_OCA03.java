package ch19_StringBuilder;

public class SB_OCA03 {

    public static void main(String[] args) {
        String s = "012345678";
        System.out.println("s.substring(1,3) = " + s.substring(1, 3));//s.substring(1,3) = 12
        System.out.println("s.substring(3,3) = " + s.substring(3, 3)); //s.substring(3,3) =
        System.out.println("s.substring(3) = " + s.substring( 3));  //s.substring(3) = 345678

    }
}
