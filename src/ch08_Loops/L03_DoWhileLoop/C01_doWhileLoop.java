package ch08_Loops.L03_DoWhileLoop;

public class C01_doWhileLoop {
    public static void main(String[] args) {

         /*
        While loop-> önce sart konrol edilir eğer  sart sonucu true alınırsa body action çalışır
        do-While loop-> önce body action çalışır sonra şart kontrol edilir.Sart true ise döngü devam eder.
        sart false ise döngü lırılır ve döngüden sonraki ilk satır çalışır.
        do-While loop->  game app. de daha çok kullanılır.
        Trick: while loop sart sağlanmazsa hiç çaılşmayabilir ama do-while sart sağalasın sağlamasın
        en az bir kez çalışır..
         */

        //yas 18 den buyukse girebilsin degilse giremesin
        int yas = 15;

        while (yas > 18 ){
            System.out.println("girebilirsin while");
            yas --;
        }

        do {
            System.out.println("girebilirsinin do while");
            yas--;
        }while (yas > 18);




    }
}
