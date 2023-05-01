package com.company;

import java.time.LocalDate;

public class Date {


    public static void main(String args[]) {
        LocalDate localDate = LocalDate.now();
        LocalDate result = localDate;
        int days = 1;
        int added = 0;
        while (added < days) {
            result = result.minusDays(1);
            if (((result.getDayOfWeek().equals("sunday") || result.getDayOfWeek().equals("saturday"))))
            {
              added++;
            }

        }
        System.out.println(result);

    }
}
