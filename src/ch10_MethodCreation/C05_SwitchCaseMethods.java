package ch10_MethodCreation;

import java.util.Scanner;

import static ch10_MethodCreation.C05_CRUD.createUser;

public class C05_SwitchCaseMethods {//CRUD class daki methodlari buradan switch ize edecegiz ...


    //karsilama method u yazalaim

    public static void menu() {
        System.out.println("sistemimize hosgeldin");
        System.out.println("uygulamaya kayit olmak icin 1  \nkullanici sorgulamak icin 2  \n" +
                "kullanici bilgi guncelleme icin 3   \nkullanici silme icin 4  \ncikis islemler icin 5 e basiniz");

        Scanner in = new Scanner(System.in);
        int secim = in.nextInt();

        switch (secim) {
            case 1:
                createUser();
                menu();
                break;
            case 2:
                C05_CRUD.getUser();
                menu();
                break;
            case 3:
                C05_CRUD.updateUser();
                menu();
                break;
            case 4:
                C05_CRUD.deleteUser();
                menu();
                break;
            case 5:
                C05_CRUD.cikis();
                break;
            default:
                System.out.println("hatali bir secim yaptiniz");
                menu();
                break;


        }
    }
}
