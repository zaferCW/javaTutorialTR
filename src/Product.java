
import java.util.HashMap;
import java.util.HashSet;
import java.util.Random;
import java.util.TreeSet;

public class Product {
    public static void main(String[] args) {


        HashMap<String ,String> hm =new HashMap<>();
        hm.put("Amazon",        "225 Euro");
        hm.put(null,            "225 Euro");
        hm.put(null,            "255 Euro");
        hm.put("Ebay",           null);
        hm.put("Saturn",          "266 Euro");
        hm.put("Apple Store",      "25566 Euro");
        hm.put("Apple Store",          "666 Euro");//Duplicate Map key oldugu icin 666 Euro oldu


        System.out.println("hm = " + hm);  //hm = //{null=255 Euro, Apple Store=666 Euro, Saturn=266 Euro, Ebay=null, Amazon=225 Euro}

        System.out.println("hm.getOrDefault(\"Ebay\",\"250 Euro\") = "
                + hm.getOrDefault("Ebay","3"));//hm.getOrDefault("Ebay","250 Euro") = null


        System.out.println("hm.getOrDefault(\"Adana\",\"Kebab\") = " +
                hm.getOrDefault("Adana", "Kebab"));//hm.getOrDefault("Adana","Kebab") = Kebab


        System.out.println("hm = " + hm);  //hm = //{null=255 Euro, Apple Store=666 Euro, Saturn=266 Euro, Ebay=null, Amazon=225 Euro}


    }
}