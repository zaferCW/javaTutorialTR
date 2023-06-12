package ch08_Loops.L01_ForLoop.Tasks08_forLoop;

public class Task03_Nested {
    public static void main(String[] args) {
        // 1 x 1 = 1
        // 1 x 2 = 2
        // 1 x 3 = 3
        // 1 x 4 = 4
        // 1 x 5 = 5
        // 1 x 6 = 6
        // 1 x 7 = 7
        // 1 x 8 = 8
        // 1 x 9 = 9
        // 1 x 10 = 10
        // Yuarıdaki çarpım tablosunu 10 a kadar print eden code create ediniz.

        //asiye hanim task cok dogru cevap
        for(int i=1; i<=10; i++){// carpim tablosunun ilk carpani

            for(int j=1; j<=10; j++){ //carpim tablosunun ikinci carpani

                System.out.println("i*j degeri= "+i +"*"+j +" = " + i*j);

            }

            System.out.println(); //dummy kod islevsiz kodu okumayi ve konsol kozmetigi iccin yazilir
        }



        //ahmet bey
        for (int i=1;i<=10;i++){
        System.out.println("1*"+i+"="+(1*i));

        }








    }
}
