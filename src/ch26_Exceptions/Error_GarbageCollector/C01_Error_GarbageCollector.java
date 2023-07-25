package ch26_Exceptions.Error_GarbageCollector;

public class C01_Error_GarbageCollector {

     /*
    1) Garbage Collector surekli memory'i kontrol ederek  Silinmesi gereken herhangi bir data varsa
    memory'i temiz tutmak icin o data'yi siler.  data'yi silmeden once "finalize" edilir.
    Finalize etmek icin finalize() methodunu call edilir di. java 9 dan sonra finalize() methodu deprecated oldu
     close() methodu bu islemi yapiyor. ve method'un ne zaman run edileceğie  Java
    hash code ile arka planda kendisi belirler. code yazılırken istenirse  finalize() veya close() methodunu call
    edilebilir ancak methodun ne zaman run edleeğini JVM belirler.
	 	2) "final", "finally", "finalize" aciklar misiniz?
    final(keyword): ==> final method override edilemez.
    final variable initialize edilmeli ve  degeri degistirilemez.
    final class child class sahibi olamaz inherit edilemez.

    finally(code block) ==> try-catch block'dan sonra kullanilir ve Exception atilsa da atilmasa da calisir.

    finalize(method) ==> Garbage Collector bir data'yi imha etmeden once calistirir.

           */

    public static void main(String[] args) {

        check(5);

    }
    private static void check(int i){
        if (i == 0)return;
        else check(i++);//Exception in thread "main" java.lang.StackOverflowError
    }


}
