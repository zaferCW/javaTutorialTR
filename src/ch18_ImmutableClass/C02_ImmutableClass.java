package ch18_ImmutableClass;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;

public class C02_ImmutableClass {
    public static void main(String[] args) {
        /*
		  Boolean, Short, Integer, Long, Float, Double, Char ve String gibi tüm kapsayıcı sınıflar (Wrapper Class)
		  BigDecimal, BigInteger ,LocalDate LocalTime  java’da immutable->değişmez sınıflara örnek olarak gösterilebilir.
          Date,LocalDateTime StringBuilder, StringBuffer, Arrays ve ArrayList de Mutable (değişebilir) class’lardır.
		 */

        //immutable
        LocalDate bugun = LocalDate.now();
        System.out.println("bugun = " + bugun);
        bugun.plusDays(5);
        System.out.println("bugun = " + bugun);

        //immutable
        LocalTime simdi = LocalTime.now();
        System.out.println("simdi = " + simdi);
        simdi.plusHours(5);
        System.out.println("simdi = " + simdi);


        //mutable
        Date date = new Date();
        System.out.println("date = " + date);
        date.setTime(155454545645L);
        System.out.println("date = " + date);





    }
}
