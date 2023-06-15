package ch10_MethodCreation;

import java.util.Scanner;

public class C05_CRUD {//biz burada methodlar create edecegiz
    //burada ki methodlari Runner class ve Switch class  dan calistiracagiz
    //buradaki methodlar ihtiyac oldugunda istenen yerden class name ile call edilebilri
    //bu methodlar call edeceginiz yerden main meth olmali

    static Scanner input = new Scanner(System.in);//class level da tanimlandi
    static String staticUserName = "";//kullanicidan alinan user name i kayit etmek icin create edildi

    public static void createUser() {
        //methoda yazarsak her methoda tek tek yazmak lazim //Taha bey
        //Scanner input = new Scanner(System.in);
        System.out.println("user name gir");
        String userName = input.nextLine();//bu method icin create edildi

        staticUserName = userName; //kullanicinin girdigi user name bizde static olan variable atandi
        //cunku asagida ki methodlarda kullanici kontrolu yapilip true ise isleme alinacak

        System.out.println("create edilen userName = " + userName);
        System.out.println(userName + " isimli kullanici sisteme kayit oldu");
    }

    public static void getUser() {//kullanici isim girmeli bu isme gore bir kontrol yapilip kullaniciya true false donmeli

        System.out.println("sorgulamak istedigin user name gir");
        String userName = input.nextLine();
        if (userName.equals(staticUserName)) {
            System.out.println(userName + " isimli kullanici sistemde mevcut");
        } else System.out.println(userName + " isimli kullanici sistemde mevcut DEGIL 404 not found");
    }

    public static void updateUser() {//burada kulllanici kendi ismini update edecek
        System.out.println("suan ki mevcut isminiz " + staticUserName);
        System.out.println("yeni ismini gir");

        String yeniIsim = input.nextLine();

        staticUserName = yeniIsim;

        System.out.println("isim guncelleme basarili 200 ok");
        System.out.println("yeni isminiz " + staticUserName);
    }

    public static void deleteUser() {
        System.out.println("silmek istedigin ismi gir");

        String silinecekIsim = input.nextLine();

        if (silinecekIsim.equals(staticUserName)) {//kullanicidan alinan isim esit ise sistemde kayitli olan staticUser Name e
            System.out.println(staticUserName + " isimli kullanici sistemden silindi ");
            staticUserName = null;
            System.out.println("silinen isim " + silinecekIsim);

        } else System.out.println(silinecekIsim + " isimli kullanici sistemde mevcut DEGIL 404 not found");
    }

    public static void cikis() {
        System.out.println("cikis yaptiniz yine bekleriz");
    }


}
