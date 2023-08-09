package ProductStore;

import static ProductStore.DataBase.input;

public class NoteBook extends ProductAbstract{
//simdi notebook islemleri yapilacak
    //yarin phone eklemek istersniz phone class create edin
    // abstract class i extends etmeniz yeterli

    static int staticId=1;
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
        switch (secim) {
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
                Store st = new Store();
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
        System.out.println("urun ekleme sayfasina hosgeldin");
        input.nextLine();//dummy kod atarak soutlerin pespese gelmesi onlendi
        System.out.println("urun adi gir");
        String name = input.nextLine();

        System.out.println("price gir");
        double price =input.nextDouble();

        System.out.println("urun ddiscountRate gir");
        double discountRate = input.nextDouble();

        System.out.println("urun amount gir");
        int amount = input.nextInt();

        System.out.println("urun icin uygun brand i listeden sec");
        Brand.printBrands();//map deki tum brand leri gostercek
        System.out.println("brand id sini listeden gir");
        int brandId =input.nextInt();
        Brand brand = Brand.getBrandById(brandId);

        System.out.println("screenn size gir");
        double screenSize=input.nextDouble();

        System.out.println("urun ram gir");
        int ram=input.nextInt();

        System.out.println("urun memory gir");
        int memory = input.nextInt();

        Product notebook=new Product(name,price,discountRate,
                amount,brand,screenSize,ram,memory);

        notebook.setId(staticId++);//id unique generate etmek
        // icin bu sekilde

        DataBase.productList.add(notebook);

        System.out.println("eklene urun "+notebook.getName());
        System.out.println("notebook = " + notebook);

    }

    @Override
    public void getProducts() {
        System.out.println(DataBase.productList);
       // DataBase.productList.stream().sorted().
       //         forEach(System.out::println);
    }

    @Override
    public void delete() {
    getProducts();//laptoplari getirir gosterir
        System.out.println("listeden silmek " +
                "istedigin note book un  id sini gir");
        int id = input.nextInt();
        System.out.println("silinen notebook "+
                DataBase.productList.get(id-1));
        DataBase.productList.remove( id-1 );
        System.out.println("silme islemi basarili");

    }

    @Override
    public void cikis() {
        System.out.println("gule gule");

    }
}
