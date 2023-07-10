package ch19_StringBuilder;

public class Task01 {
    public static void main(String[] args) {
         /*
		Bir cümleyi parametre olarak kabul eden, StringBuilder kullanarak cümleyi ters çeviren ve cümlenin palindrom
	        olup olmadığını kontrol eden (büyük/küçük harf duyarlılığı olmadan) bir Method yazın.
	     (without case sensitivity)
	     Eg : input : I love Java
	     Output: "Reversed sentence : avaJ evol I
	        It is not a palindrome"
		 */

        String cumle = "iki";
        System.out.println("method(cumle) = " + method(cumle));


    }

    private static boolean method(String cumle) {
        StringBuilder tersi = new StringBuilder(cumle.toLowerCase());

        tersi.reverse();
        return tersi.toString().equals(cumle.toLowerCase());
    }
}
