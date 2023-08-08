package ProductStore;

import static ProductStore.Brand.printBrands;
import static ProductStore.DataBase.input;
import static ch10_MethodCreation.C05_SwitchCaseMethods.menu;

public class Store {

    public void anaMenu() throws InterruptedException {
        System.out.println("notbook islemleri icin 1\n" +
                "marka listeleme icin 2\n" +
                "cikis iicn 3 tuslarina basiniz");

        System.out.println("yapmak istedigin islemi sec");
        int secim = input.nextInt();
        switch (secim) {
            case 1:
                menu();
                break;
            case 2:
                printBrands();
                anaMenu();
                break;
            case 3:
                System.out.println("cikis yapiliyor");
                Thread.sleep(2000);
                System.out.println("*");
                Thread.sleep(2000);
                System.out.println("**");
                Thread.sleep(2000);
                System.out.println("***");
                System.out.println("bye bye");
                break;
            default:
                System.out.println("yanlis tusa basdin yeniden dene");
                anaMenu();
        }


    }
}
