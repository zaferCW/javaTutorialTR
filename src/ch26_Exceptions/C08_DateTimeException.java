package ch26_Exceptions;

import java.time.DateTimeException;
import java.time.LocalDate;

public class C08_DateTimeException {
    public static void main(String[] args) {

      //RTE   LocalDate date = LocalDate.of(2023,4,33);

//Exception in thread "main" java.time.DateTimeException: Invalid value for DayOfMonth (valid values 1 - 28/31): 33


        try {
            LocalDate  date = LocalDate.of(2023,4,33);
            System.out.println("try sorunsuz calisti");
        } catch (DateTimeException e) {
            System.out.println("catch block yakaladi exception i . ay sayisi fazla girdin");
            System.out.println(e.getMessage());
        }


        System.out.println("sorun cozuldu devam et");


    }
}
