package ch07_StringManipulations;

public class C08_equals_equalsIgnoreCase {

    public static void main(String[] args) {

        /* equals()
         * 2 String metnin birbirine esit olup olmadigina bakar. büyük küçük harf farkı vardır. Sonuc boolean dir.
         *
         * equalsIgnorecase()
         * equals() ile ayni islevi gorur, tek farki buyuk kucuk harfe duyarliligi yoktur. Sonuc boolean dir.
         */
        /**
         * str.toLowerCase() verilen String'in tamamini kucuk harfe cevirir
         * str.toUpperCase() verilen String'in tamamini buyuk harfe cevirir
         */

        String str1 = "Merhaba";
        String str2 = "merhaba";

        System.out.println("str1 replace oncesi = " + str1);//str1 replace oncesi = Merhaba
        System.out.println("str1.replace(\"\\\\w\" , \"*\") = " + str1.replaceAll("\\w", "*"));//str1.replace("\\w" , "*") = *******
        // regex karakterler sadece replaceAll de calisiyor

        System.out.println("str1 replace sonrasi = " + str1);//str1 replace sonrasi = Merhaba

        System.out.println(str1.equals(str2));//false
        System.out.println(str2.equals(str1));//false

        System.out.println(str1.equalsIgnoreCase(str2));//true

        str2 = "Merhaba";//str2 nin degeri update edildi yeniden atama yapildi

        System.out.println(str1.equals(str2));//true

        String s1 = "ahmet";//jvm s1 ve s2 yi String constant pool da olusturuyor ayni reference da tutuluyor
                            // degerler de ayni oldugu icin sonuc lar true oluyor
        String s2 = "ahmet";

        String s3 = new String("zeynep");//new keywordu kullanilirsa degerler ayni olsa bile reference farkli olur
        String s4 = new String("zeynep");//s4 un reference degeri s3 den farkli oldugu icin == kullanilirsa false verir

        System.out.println(s1 == s2);//true
        System.out.println(s1.equals(s2));//true
        System.out.println(s3 == s4); //false
        System.out.println(s3.equals(s4));//true

        System.out.println(s1 == s3);
        System.out.println(s1.equals(s3));


          /*
        == referans ve degere bakar. referansi alir ayni nesneye ait olup olmadigini kontrol eder
        mukemmeliyetcidir yani hersey ayni olmali

        s1 ve s2 String pool da oldugu icin ayni referans a sahiptir ve heap de ki deger bir tanedir

        stirng havuzu JVM yonetir

        s3 ve s4 new lendifgi icin hem deger hem de referans yeniden create edilir. deger ayni olursa equals da true verir

        intellij idea new String sonuk yazmasinin sebebi :string literali ne uygun yazim String s2 = "ahmet"; budur
        JVM bunu string pool da manage eder. hafiza yonetimi acisindan ekonomiktir.
        bu yuzden idea literala uygun String obje create etmenizi onerir

         */

    }
}
