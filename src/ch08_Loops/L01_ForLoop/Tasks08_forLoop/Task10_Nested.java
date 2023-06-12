package ch08_Loops.L01_ForLoop.Tasks08_forLoop;

public class Task10_Nested {

    public static void main(String[] args) {
         /*
        A
        B B
        C C C
        D D D D
        E E E E E
        F F F F F F
        şekli yazdırınız
        */

        int harf=65;
        for (int i = 0; i < 6 ; i++) {

            for (int j = 0; j <= i ; j++) {//yine icteki loop a i kadar calis dedik
                System.out.print( (char) ( harf + i )+" ");// i yi j kadar yazdirdi ayni satira. hep i yi yazdik


            }
            System.out.println();
        }
      



    }
}
