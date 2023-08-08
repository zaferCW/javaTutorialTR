package ProductStore;

import ch25_Inheritance.task01.B;

import java.util.Map;

public class Brand implements DataBase{

    private String name;


    static {//kullanici product girerken elimizde secenek olarak
        // markalar olsun diye onceden bunlari map decreate ettik
        createBrands();
    }

    private static void createBrands() {
    DataBase.mapBrand.put(1L , new Brand("Samsung"));
    DataBase.mapBrand.put(2L , new Brand("Lenovo"));
    DataBase.mapBrand.put(3L , new Brand("Hp"));
    DataBase.mapBrand.put(4L , new Brand("Apple"));
    DataBase.mapBrand.put(5L , new Brand("Dell"));
    DataBase.mapBrand.put(6L , new Brand("Casper"));
    DataBase.mapBrand.put(7L , new Brand("Monster"));
    }

    public static void printBrands() {
        System.out.println(" brand ler mapden geliyor");
        for (Map.Entry<Long , Brand >  each :mapBrand.entrySet() ) {
            System.out.println("key is "+each.getKey()+" " +
                    "brand is "+each.getValue());
            System.out.println("-------------------------------");
        }
        System.out.println("********************************");
    }
    public static Brand getBrandById(int brandId) {
        for ( Long   key : mapBrand.keySet()) {
            if (key == brandId){
                return mapBrand.get(key);
            }
        }
        return null;
    }

    public Brand(String name) {
        this.name = name;
    }

    public Brand() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return  name ;
    }
}
