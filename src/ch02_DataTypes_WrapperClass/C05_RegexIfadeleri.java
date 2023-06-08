package ch02_DataTypes_WrapperClass;

public class C05_RegexIfadeleri {

    public static void main(String[] args) {

       String str="Java 12345 ? | >< $!";

       //eger \\d regex ifadesi kullanirsaniinz sadece rakamlar (digit)
        System.out.println(str.replaceAll("\\d","*"));// Java ***** ? | >< $!
        System.out.println("str = " + str); //Trick Point Imp ==> String Class i degistirilemez bir class dir

        //eger regex ifadesi \\D non digit rakam disindaki hersey
        System.out.println(str.replaceAll("\\D","*")); //*****12345**********
                                                        // bosluklar da ayri bir karakter oldugu icin onlari da hesaba katar


       //eger regex ifadesi \\S space disindaki hersey
        System.out.println(str.replaceAll("\\S","*")); //**** ***** * * ** **


        //eger regex ifadesi \\s  ise space  anlamina gelir
        System.out.println(str.replaceAll("\\s","*")); //Java*12345*?*|*><*$!

        //eger regex ifadesi \\w  ise word (kelime harf rakam) [a-z A-Z 0-9]  anlamina gelir
        System.out.println("str.replaceAll(\"\\\\w\",\"*\") = " + str.replaceAll("\\w", "*"));
        //output **** ***** ? | >< $!

        //eger regex ifadesi \\W  ise [a-z A-Z 0-9]  disindakileri kapsar yani ozel karakterleri ^%$&%^*^&( gibi
        System.out.println(str.replaceAll("\\W", "*"));  //Java*12345**********

       // str.replaceAll("\\W","*****");
        System.out.println(str);//str = Java 12345 ? | >< $!

        String str2 = str.replaceAll("\\W","*****");

        System.out.println("str2 = " + str2); //str2 = Java*****12345**************************************************


    }


}
