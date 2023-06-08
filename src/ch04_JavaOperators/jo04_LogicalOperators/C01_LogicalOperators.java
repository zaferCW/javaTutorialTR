package ch04_JavaOperators.jo04_LogicalOperators;

public class C01_LogicalOperators {
    public static void main(String[] args) {
         /*
 -------- && - and - (ve)---------

      True   &&    True    -->  True
      True   &&    False   -->  False
      False  &&    True    -->  False
      False  &&    False   -->  False


     -------- ||- or - (veya)---------

      True   ||    True    -->  True
      True   ||    False   -->  True
      False  ||    True    -->  True
      False  ||    False   -->  False
 */

        // && ile & arasindaki fark
        //&& de boolean sonuc 3 te bir tane false bulunca durur tum satırı
        // kontrol etmeye calısmaz.

        // Ancak & tum satırı kontrol eder ondan sonra durur.
        //sonucta fark yok sadece biri ilk hatayı buldugunda durur dığeri
        // sonuna kadar gider.&& tekliye gore daha hizli calisir

        //and->ve

        boolean b1 = true;
        boolean b2 = false;
        int a = 3;
        int b = 5;


        //and ve   pesimist
        System.out.println("b1 & (a<b) = " +  (b1 &   ( a < b )  )   );//b1 & (a<b) = true

        System.out.println("b2 & (a<b) = " + (b2 && (a < b)));////b2 & (a<b) = false
        //Condition 'b2 && (a < b)' is always 'false' when reached

        //or veya   optimist
        System.out.println("b1 || (a<b) = " + (b1 || (a < b)));//Condition 'b1 || (a < b)' is always 'true' when reached
        System.out.println("b2 || (a<b) = " +( b2 || (a < b)));//Condition 'b2 || (a < b)' is always 'true' when reached

        //not !

        System.out.println("!b1 || (a>b) = " + ! (  b1 || ( a > b  )  )  );  //!b1 || (a>b) = false
        //Condition '!b1 || ( a > b )' is always 'false' when reached

        System.out.println("b1 = " + b1);  // b1 = true

        System.out.println("!b1 = " + !b1); // !b1 = false

        System.out.println("a!=b = " + (a != b)); //a!=b = true
        //a ile b esit degil mi ? degil yani true


    }
}
