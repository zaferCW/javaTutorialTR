package ch26_Exceptions.Error_GarbageCollector;

public class C02_GarbageCollector {
    public static void main(String[] args) {

        String str = "";
        for (int i = 0; i < 1000 ; i++) {
            str += i;
            System.out.println("str = " + str);
        }




    }
}
