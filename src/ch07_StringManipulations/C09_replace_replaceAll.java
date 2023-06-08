package ch07_StringManipulations;

public class C09_replace_replaceAll {
    public static void main(String[] args) {

        /** replace()
         * Metin icerisindeki karakter ya da bir parcasinin, istenilen karakter ya da metinle degistirilmesini
         * (update -set) saglar. Sonuc String'dir..
         *
         */

        String str = "ezberlemek beyne ihanettir 12356 ^#^%$ () :";

        System.out.println("str.replace('a' , '$') = " + str.replace('a', '$'));
//str.replace('a' , '$') = ezberlemek beyne ih$nettir 12356 ^#^%$ () :
        System.out.println("str.replace(\"tir\" , \"*\") = " + str.replace("tir", "*"));
//str.replace("tir" , "*") = ezberlemek beyne ihanet* 12356 ^#^%$ () :
        System.out.println(str.replaceFirst("e", "*"));
//str.replaceFirst("e","*") = *zberlemek beyne ihanettir 12356 ^#^%$ () :


        // replaceAll() method u replace() methoduna benzer ama 2 fark vardır
        //1-replace() methodu char kabul eder ama replaceAll kabul etmez
        //2-replaceAll() method u regex kullanımına izin verir (Regular Expressions)


        //(Regular Expressions)
        //   \\s bosluk (
        //   \\S bosluk disindaki tum karakterler
        //   \\w harfler ve rakamlar (a z A Z, 0 9)
        //   \\W harfler ve rakamlar disindaki tum karakterler
        //   \\d rakamlar 0 9
        //   \\D rakamlar disindaki tum karakterler

        //   "\\w" tum harf ve rakamlar [A-Z a-z 0-9]


        System.out.println("str.replaceAll(\"\\\\w\",\"*\") = " + str.replaceAll("\\w", "*"));
        //str.replaceAll("\\w","*") = ********** ***** ********* ***** ^#^%$ () :

        System.out.println("str.replaceAll(\"\\\\W\",\"*\") = " + str.replaceAll("\\W", "*"));
//str.replaceAll("\\W","*") = ezberlemek*beyne*ihanettir*12356***********

        //sadece harfleri yildiza cevirin
        System.out.println("str.replaceAll(\"[A-Za-z]\" , \"*\") = " + str.replaceAll("[A-Za-z]", "*"));


//task  Girilen ismini, soyismini ve 16 haneli kredi karti no bilgilerini aşağıdaki
        // formatta print eden code create ediniz.

        // isim-soyisim : M***** B*******
        // kart no : **** **** **** 1234

        String isim = "Meryem";
        String soyIsim = "Hanim";
        String kartNo = "1234567891234567";

        String yeniIsimCiktisi = //yeni bir variable create edildi
                isim.charAt(0) +   /// isim variable inin ilk harfi aldindi + ile concat edildi
                isim.substring(1). // isim in 1. index ten alindi
                        replaceAll("\\w", "*");// 1. indexten itibaren alidnigi icin tum harfler * a cevridli

        System.out.println("yeniIsimCiktisi = " + yeniIsimCiktisi); //yeniIsimCiktisi = M*****

        String yeniSoyIsimCiktisi = soyIsim.charAt(0) + soyIsim.substring(1).replaceAll("\\w", "*");
        System.out.println("yeniSoyIsimCiktisi = " + yeniSoyIsimCiktisi);

        String yeniKartNoCiktisi = "**** **** **** " + kartNo.substring(12);
        System.out.println("yeniKartNoCiktisi = " + yeniKartNoCiktisi);

        String yeniKartNoRegex= kartNo.substring(0,12).replaceAll("[0-9]","*")+ kartNo.substring(12);

        System.out.println("yeniKartNoRegex = " + yeniKartNoRegex);

        //isim ve soyisimi tek variable olarak da yapsak nasil olacak
        String isimSoyisimBirArada = yeniIsimCiktisi.concat(yeniSoyIsimCiktisi) ;
        System.out.println(isimSoyisimBirArada);//M*****H****



    }
}
