package ch09_Break_Continue;

public class C05_OCA_Type {

    public static void main(String[] args) {

       Raw_Loop :
        for (int row = 0; row <5 ; row++) //outer lop

            for (int col = 0; col < 5; col++) {//inner loop
                System.out.println(row*col) ;
                if (row*col % 2==0)
                    continue
                    Raw_Loop
                            ;
                System.out.println(row*col) ;


            }


/*
RAW_LOOP adı, bir etiket (label) olarak kullanılmak üzere tanımlanmıştır.

 Etiket, bir döngü ifadesinin başına konabilir ve döngü ifadesinin içindeki
 break veya continue gibi ifadelerin etkisini,
 etiket ile belirlenen döngü ifadesinin sonuna kadar genişletir.

Bu örnekte, RAW_LOOP etiketi, iç içe geçmiş iki döngüden oluşan bir yapı içinde
kullanılır. İç döngü, if
koşuluna göre belirli şartları sağlamayan durumlarda continue ifadesi ile işlemini
 sonlandırır ve döngüden çıkamaz.
Bunun yerine, RAW_LOOP etiketi ile belirtilen dış döngüye geri döner ve dış
döngünün kontrol ifadesine göre tekrar çalışır.

Bu sayede, iç döngüdeki koşula göre belirli şartları sağlamayan durumlarda iç
döngüden çıkılması yerine, dış döngünün
başına geri dönülerek dış döngü tekrar çalıştırılabilmektedir. Bu şekilde, iç
döngüdeki continue ifadesi, dış döngünün
kontrol ifadesine bağlı olarak tekrar edilebilir veya atlanabilir.
 */



    }
}
