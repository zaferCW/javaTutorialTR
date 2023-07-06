package ch16_DateTime;

import java.time.LocalDate;
import java.time.Month;

public class C01_LocalDate {


    public static void main(String[] args) {
        //LocalDate - > sadece yil ay gun tutar
        LocalDate bugun = LocalDate.now();
        System.out.println("bugun = " + bugun); //bugun = 2023-07-05

        System.out.println("bugun.isLeapYear() = " + bugun.isLeapYear());//bugun.isLeapYear() = false

        System.out.println("bugun.getYear() = " + bugun.getYear());
        System.out.println("bugun.getEra() = " + bugun.getEra());
        //CE terimi, "Common Era" ifadesinin kısaltmasıdır ve Milattan Sonra (M.S.) anlamina gelmektedir
        System.out.println("bugun.getDayOfYear() = " + bugun.getDayOfYear());

        LocalDate date1 = LocalDate.of(1990,8,23);
        LocalDate date2 = LocalDate.of(1996,8,23);
        LocalDate date3 = LocalDate.of(1990, Month.AUGUST,23);

        System.out.println("date1 = " + date1);//date1 = 1990-08-23

        System.out.println("date1.plusDays(300) = " + date1.plusDays(300));  //date1.plusDays(300) = 1991-06-19

        System.out.println("date2.minusMonths(3) = " + date2.minusMonths(3)); //date2.minusMonths(3) = 1996-05-23

        System.out.println("date2.minusMonths(3).plusMonths(2).plusDays(25).minusWeeks(3) = "
                + date2.minusMonths(3)
                .plusMonths(2)
                .plusDays(25).
                minusWeeks(3));
            // date2.minusMonths(3).plusMonths(2).plusDays(25).minusWeeks(3) = 1996-07-27

        System.out.println("date2 = " + date2); // date2 = 1996-08-23

        date2 = date2.plusYears(100);

        System.out.println("date2 = " + date2); // date2 = 2096-08-23







    }
}
