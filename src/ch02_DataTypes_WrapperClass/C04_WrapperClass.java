package ch02_DataTypes_WrapperClass;

public class C04_WrapperClass {
    public static void main(String[] args) {

         /*
            Note: Java primitive lere method'lar ekleyerek yeni bir
                  yapi olusturdu, bu yapiya "Wrapper Class"
                  Primitive         Wrapper
                     byte     ==>    Byte
                     short    ==>    Short
                     ** int   ==>    Integer
                     long     ==>    Long
                     float    ==>    Float
                     double   ==>    Double
                     boolean  ==>    Boolean
                     ** char  ==>    Character
         */

        String name = "Zeynep Hanim";
        int age = 33;


        System.out.println(name.toUpperCase());//ZEYNEP HANIM

        Integer age2= 35;//Integer wrapper classindan age2 variable i olusturldu

        // non-primitive data turleri data depolamak yaninda kullanışlı birçok method'a sahiptir
        // ancak primitive data turlerinin boyle bir ozelligi yoktur
        // primitive data turleri sadece degerleri saklarlar (container) ve hwerhangi bir özellik(method)
        // vs bulundurmaz.
        //Ancak primitive data turleri icin de bazi işlemler için (String'den tamsayı çekme) method'lar
        // ihtiyaç
        // olduğunda Java her bir primitive data turunu, non-primitive  Wrapper Class  oluşturarak
        // ilgili methodlarla
        // ara çözüm imkanı sunmuştur.

        String number = "12345" ;//bunu Integer a ceviriniz

        //TASK id ve tc String değerlernin toplamını print eden code yazınız
        String tc = "123456789";
        String id = "12345";

        System.out.println(tc + id);//12345678912345

        System.out.println(Integer.valueOf(tc));//123456789

        System.out.println(Integer.valueOf(id));//12345

        int yeniTc = Integer.valueOf(tc);

        int yeniID = Integer.valueOf(id);

        System.out.println(yeniID + yeniTc);//123469134
//bu methoda gitmek icin ctrl+sol click yapiniz. gittiginiz class da method ile ilgili
        //verilen bilgiyi okuyunuz buna kutuphane okuma diyiruz


/*
String tc = "123456789";
        String id = "12345"
 */

        int idYeni= Integer.parseInt(id);
        //return type methodun islem sonunda size donderdigi deger dir

        int tcYeni = Integer.parseInt(tc);

        System.out.println(idYeni + tcYeni);//123469134

        //  valueOf(); Integer donderirir return type olarak
        // parseInt();  int donderir  return type olarak


        String okulNo = "12345AB";

       //***hatalo kod RunTimeError    int okulNoYeni= Integer.valueOf(okulNo);
        //Exception in thread "main" java.lang.NumberFormatException
        //interview question hatalari nasil ayiklarsiniz?


        // TASK-> byte short int maximum ve minimum değerlerini print eden code yazınız wrapper class lari kullanrak
        byte maxDegerByte= Byte.MAX_VALUE;
        byte minDegerByte = Byte.MIN_VALUE;

        System.out.println("maxDegerByte = " + maxDegerByte);//maxDegerByte = 127
        System.out.println("minDegerByte = " + minDegerByte);//minDegerByte = -128


        //Autoboxing
        boolean bPrimitive = true;
        Boolean  bWrapper = bPrimitive;

        //boxing
        Integer numberWrapper = 55 ;

        //Unboxing in java
        int numberPrimitive= numberWrapper;


        //java5 onceisnde hata verirdi java 5 ile guncellendi











    }
}
