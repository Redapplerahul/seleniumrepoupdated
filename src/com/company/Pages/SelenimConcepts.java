package com.company.Pages;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class SelenimConcepts {



    public static  void  main(String args[])
    {
        LocalDate date=LocalDate.now();
        //prints the current date based on ut laptop
        System.out.println(date);

        //u can add/subtract days or months or years

        //adding 20 days
        date=date.plusDays(20);
        System.out.println(date);

        //subracting days


        date=date.minusDays(10);
        System.out.println(date);


        //get day of week


        DayOfWeek dayOfWeek=date.getDayOfWeek();
        System.out.println(dayOfWeek);








    }


}
