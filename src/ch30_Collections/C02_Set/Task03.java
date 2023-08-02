package ch30_Collections.C02_Set;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class Task03 {
    public static void main(String[] args) {

        /*
    commonValues() isminde bir method oluşturun ve parametresi  2 tane hashset olmalı.
    return tipi arraylist olmalı.
    ÖRNEĞİN:
    İlk Hashset : "Germany" , "England" , "South Africa" , "Brazil" , "USA"
    İkinci  hashset  : "Germany" , "China" , "Brazil" , "France" ,  "USA"
    Ortak değerleri ArrayListe ekleyiniz.
    çıktı:  "USA" , "Brazil" ,"Germany"
    ArrayListi yazdırınız.
     */

        HashSet<String> hs1 =new HashSet<>(Arrays.asList("Germany" , "England" , "South Africa" , "Brazil" , "USA"));

        HashSet<String> hs2 = new HashSet<>(Arrays.asList("Germany" , "China" , "Brazil" , "France" ,  "USA"));

        System.out.println("commonValues(hs1,hs2) = " + commonValues(hs1, hs2));
            //commonValues(hs1,hs2) = [USA, Brazil, Germany]

    }

    private static ArrayList<String> commonValues(HashSet<String> hs1, HashSet<String> hs2) {
        hs1.retainAll(hs2);//ortak elemanlar disindakiler listeden remove edilir
        ArrayList <String > list = new ArrayList<>(hs1);//ortak elemanlar liste atandi
        return list;
    }

    //Zeynep hanim meryem hanimlardan 2.yol
    // ArrayList<String> ortakList = new ArrayList<>();
// for (String w : s1) {
//     if (s2.contains(w)) {
//         ortakList.add(w);
//     }
// }
// return ortakList;


}
