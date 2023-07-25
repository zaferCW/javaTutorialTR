package ch26_Exceptions.Error_GarbageCollector;

import java.util.Date;

public class JVMRunningMissionControl {
    public static void main(String[] args) {

    Runtime rt = Runtime.getRuntime();
        System.out.println("for loop oncesi rt.totalMemory() = " + rt.totalMemory());
        System.out.println("for loop oncesi rt.freeMemory() = " + rt.freeMemory());


        Date d =null;

        for (int i = 0; i < 100000 ; i++) {
            d= new Date(i);
            d = null ;
        }
        System.out.println("for loop sonrasi rt.totalMemory() = " + rt.totalMemory());
        rt.gc();
        System.gc();

        System.out.println("for loop sonrasi rt.freeMemory() = " + rt.freeMemory());


    }
}
