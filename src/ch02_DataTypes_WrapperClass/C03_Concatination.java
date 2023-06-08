package ch02_DataTypes_WrapperClass;

public class C03_Concatination {
    public static void main(String[] args) {

            /*
        Not: char variable'lari matematiksel islemlerde kullanirsaniz, Java onlarin ASCII degerlerini kullanir.
             Ornegin; System.out.println('A' + 'C'); ekrana AC yerine 132 yazdirir
        Note: Java'da "+" sembolunun iki anlami vardir.
        i) Toplama islemi
        ii) Birlestirme Islemi(Concatenation)
              Java "+" sembolu gorunce once toplama yapmaya calisir, yapamazsa birlestirme islemi yapmaya
              calisir, o da olmazsa hata verir.
     */
        char ch = 'A';
        char ch2 = 'C';

        System.out.println(ch + ch2);//132

        System.out.println('A' + 'C');//132

        System.out.println("A"+"B");//AB   cift tirnak String oldugu icin java bu iki ifadeyi concat eder birlestirir

        String name = "Zeynep hanim";
        String lastName = "Fitnat";

        int a = 7 ;
        int b = 11 ;

        System.out.println(name + lastName + a+b);//Zeynep hanimFitnat711
            // stringden sonra sını tam sayi olsa bile concat eder

        System.out.println(a + name + lastName + b);//7Zeynep hanimFitnat11


        System.out.println(a+b + name+ lastName);//18Zeynep hanimFitnat
        //baslangic int degerler oldugu icinj java bunlari once toplama islemine alir. string gordukten sonrakileri  concat eder


        //birden cok data tipinde variable + ile isleme alindiginda islem onceligine gore sonucu aliriz
        //bastakinin data tipine gore ilk islem yapilir
        //bastaki String ise sonrakiler int dahi olsa concat islemi yapilir matematiksel toplama islemi yapilmaz


        System.out.println(name + lastName + (a+b));//Zeynep hanimFitnat18



        //TRICK: aritmetik islemlerde String kullanilirsa aritmetik islem onceligine gore java bunu derler
        // ona gore islem yapar cikti String variable gibi olur Concatination yapar

        System.out.println(name+ (a-b) + ( a - b)); //Zeynep hanim-4-4

        System.out.println(name+ (    ( a-b) +( a-b )       )              ) ;//Zeynep hanim-8


        char num = '1';
        System.out.println(name+num);//Zeynep hanim1

        System.out.println(  a + num  + name);// 56Zeynep hanim
        //'1' in ascii degeri 49 dur. yukarida 7 + 49 = 56 islem sonucu alindi
        //int + char olursa sonuc toplama islemine gore deger alinir

        System.out.println(name  + (num + b));//Zeynep hanim60

        System.out.println(a+ name+ num);//7Zeynep hanim1



/*
   String name = "Zeynep hanim";
        String lastName = "Fitnat";

        int a = 7 ;
        int b = 11 ;
 */






    }//main sonu



}
