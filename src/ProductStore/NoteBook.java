package ProductStore;

import static ProductStore.DataBase.input;

public class NoteBook extends ProductAbstract{
//simdi notebook islemleri yapilacak
    //yarin phone eklemek istersniz phone class create edin
    // abstract class i extends etmeniz yeterli

    @Override
    public void menu() throws InterruptedException {
        System.out.println(" ============= ISLEMLER =============\n" +
                "         1-addItem    *** create\n" +
                "         2-getProducts   *** read\n" +
                "         3-delete        *** delete\n" +
                "         4-ANA MENU    ***   menu\n" +
                "         5-CIKIS     ***  exit");
        System.out.println("secim yap");
        int secim =input.nextInt();
        switch (secim){
            case 1:
                addItem();
                menu();
                break;
            case 2:
                getProducts();
                menu();
                break;
            case 3:
                delete();
                menu();
                break;
            case 4:
                Store st=new Store();
                st.anaMenu();
                break;
            case 5:
                cikis();
                break;
            default:
                System.out.println("yanlis tuslama tekkrar dene");
                menu();
        }







    }


    @Override
    public void addItem() {

    }

    @Override
    public void getProducts() {

    }

    @Override
    public void delete() {

    }



    @Override
    public void cikis() {

    }
}
