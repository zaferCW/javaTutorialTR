package ch30_Collections.C02_Set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class C02_Set {
    /*
     Java'da Set arayüzünde get metodu yoktur çünkü Set arayüzü, bir eleman listesi yerine
     benzersiz elemanların bir koleksiyonunu temsil eder. get metodu, bir koleksiyonda belirli
     bir elemanı almak için kullanılır, ancak Set'te elemanlar sıralı bir şekilde depolanmaz ve
      belirli bir sıraya göre erişilemezler.

    Ancak, Set arayüzünde elemanları almak için iterator yöntemi bulunmaktadır. Bu yöntem, Set'teki
    elemanları tek tek döndürür ve istenen elemana erişmek için döngü kullanılabilir.
     Örneğin:
     Bu örnekte, iterator() yöntemi, Set'teki elemanların üzerinde dönmek için bir Iterator nesnesi
     oluşturur. hasNext() yöntemi, koleksiyonda daha fazla eleman olup olmadığını kontrol eder ve next()
      yöntemi, bir sonraki elemanı döndürür.
     */
    public static void main(String[] args) {

//Task set olusturup eleman ekleyyim iterator ile loop icinde elemanlari tek tek alin yazin

        Set< String > set = new HashSet<>();
        set.add("hamburg");
        set.add("sivas");
        set.add("diyarbakir");
        set.add("hakkari");
        set.add("izmir");
        set.add("istanbul");

        Iterator < String>  iterator = set.iterator();
        while (iterator.hasNext()){
            String element = iterator.next();
            System.out.println("element = " + element);//bu satirda her eleman tek tek yazdirilir
            //yani eger herbir eleman icinbir control olcaksa bu satirda yapilabilinir

        }







    }


}
