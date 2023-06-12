package ch08_Loops.L01_ForLoop;

public class C01_forLoop {
    public static void main(String[] args) {
        //task 33 defa java iyidir yazin
        System.out.println("java iyidir");
        System.out.println("java iyidir");
        System.out.println("java iyidir");
        System.out.println("java iyidir");
        System.out.println("java iyidir");

/*
        loop->döngü tekrarlanan aksiyonlar için kullanılan code blok'larıdır
         */
        for (int i = 0; i < 33 ; i++) {
            System.out.println(i+" = java iyidir");
        }
        //int data type
        //i variable name ve sartin sinirlarini belirler
        //i++ ise herseferinde i yi  bir artir demek

    //  / Task    2 basamaklı tek sayıları yan yana print eden code create ediniz -> 11,13,15...99
       for (int i = 11 ; i <= 99 ; i+=2 ){
           System.out.print(i+" ");
       }
        System.out.println("*************");

       int j ;
       for (j = 10 ; j < 100 ; j++){
           if (j % 2 == 1){//her gelen j nin 2 ye bolumunden kalan 1 ise yani tekli sayi ise calis demis olduk
               System.out.print(j+" ");
           }
       }
        //calismayan loop nasil olur?
        for (int i = 1 ; i > 10 ; i++) {//Condition 'i >10' is always 'false'
            System.out.println("calismayan loopo");
        }
        //ram yakan soonsun loop
      //  for (int i = 0; i >=0 ; i++) {
      //      System.out.println("sonsuz loop");

      //  }

    }
}
