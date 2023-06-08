package ch07_StringManipulations;

public class C11_valueOf_parseInt {
    public static void main(String[] args) {
        // Integer.valueOf() rakamlarla olusturulan String'leri sayiya donusturur. Boylece rakamlarla olusturulan
        // Stringlerle matematiksel islemler yapabilmemizi saglar.

        //soru peki girilen ifade 1500$ ise cevirir mi? cevirmez

        //valueOf() hem Integer wrapper classinin icinde hem de String'in icinde var. Integer wrapper classinin
        // icinde olan valueOf() methdou String'i integer'a cevirir. String'in icindeki valueOf() methodu integer'i
        // String'e cevirir.

        // task -> string type verilen iki adet bagıs miktarını toplayan code create ediniz..
        String donation1 = " 150000   ".trim();
        String donation2 = " 200000   ".trim();
        String donation3 = " 2 000 00   ".replace(" ","");

        System.out.println(donation1 + donation2);// 150000    200000

        Integer d1=Integer.valueOf(donation1);
        System.out.println("d1 = " + d1);

        int d2 = Integer.valueOf(donation2);
        System.out.println("d2 = " + d2);

        int d3 = Integer.valueOf(donation3);
        System.out.println("d3 = " + d3);

        System.out.println("d1+d2 = " + (d1 + d2) ); //d1+d2 = 350000

        System.out.println("parseInt ile cozum");

        int d11=Integer.parseInt(donation1);
        System.out.println("d11 = " + d11);

        int d22=Integer.parseInt(donation2);
        System.out.println("d22 = " + d22);

        System.out.println("d11+d22 = " + (d11 + d22) );


        //valueOf nonprimitive INTEGER return eder  parseInt int yani primitive return eder
    }
}
