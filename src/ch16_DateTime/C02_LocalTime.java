package ch16_DateTime;

import java.time.LocalTime;

public class C02_LocalTime {

    public static void main(String[] args) {
        //saat dakika saniye milisaniye tutar

        LocalTime suan = LocalTime.now();
        System.out.println("suan = " + suan); //suan = 20:40:37.679398100

        System.out.println("suan.getHour() = " + suan.getHour()); // suan.getHour() = 20


        LocalTime suan2 = LocalTime.of(13,55,55);// suan2 = 13:55:55
        System.out.println("suan2 = " + suan2);

        System.out.println("suan2.plusNanos(12542115) = " + suan2.plusNanos(125421153413323L));
        // suan2.plusNanos(12542115) = 00:46:16.153413323


        //for loop ile hiz testi
        System.out.println("hiz testi");
        LocalTime forLoopBasi = LocalTime.now();
        System.out.println("forLoopBasi.getNano() = " + forLoopBasi.getNano());

        int toplam = 0;
        for (int i = 0; i < 1000000 ; i++) {
            toplam +=i;
        }
        System.out.println("toplam = " + toplam);


        LocalTime forLoopSonu = LocalTime.now();
        System.out.println("forLoopSonu.getNano() = " + forLoopSonu.getNano());

        System.out.println("fark nano   "+ (forLoopSonu.getNano() - forLoopBasi.getNano()));
        System.out.println("fark minute   "+ (forLoopSonu.getMinute() - forLoopBasi.getMinute()));
        System.out.println("fark second   "+ (forLoopSonu.getSecond() - forLoopBasi.getSecond()));


    }
}
