package ch07_StringManipulations;

public class C01_Concatination {
    public static void main(String[] args) {

    /*
        concat() methodu içine(parametee) aldığı string variable'ı çalıştşğı stringin sonuna ekler..
        java'da + işlemi yapılırken eğer en az bir string variable varsa java toplama değil concat yapar.
         */

        String name = "Batu" ;
        String title = "SDET QA";
        int age = 30 ;

        System.out.println(name + title);
        System.out.println("name.concat(title) = " + name.concat(title));

        System.out.println("age = " + age);//age = 30
        System.out.println(age);//30

        //String i int e nasil ceviririrz
        String number = "123456";
        System.out.println("number = " + number+1);//number = 1234561

        //output 123457 olmali
        System.out.println("Integer.parseInt(number+1) = " + ( Integer.parseInt(number + 1) + 1));//Integer.parseInt(number+1) = 1234562

        System.out.println("name.concat(true+ \" :) \") = " + name.concat(true + " :) "));//name.concat(true+ " :) ") = Batutrue :)

        System.out.println("name.concat(100+ \" :) \") = " + name.concat(100 + " :) "));//name.concat(true+ " :) ") = Batu100 :)

        System.out.println("title.concat(false + \"Kasim\") = " + title.concat(false + "Kasim"));

    }
}
