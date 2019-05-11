package com.demo.task.calendar;

import com.sun.xml.internal.bind.v2.model.core.MaybeElement;

import java.awt.event.MouseAdapter;
import java.text.ParseException;


public class SearchDay {

    public static void main(String[] args) throws ParseException {

        System.out.println(getDayOfWeek(Day.TUESDAY, Month.MAY, 32, false));


    }


    public static Day getDayOfWeek(Day newYearDay, Month month, int dayOfMonth, boolean isLeapYear) {


     if (dayOfMonth < 1 | dayOfMonth > month.getDaysCount(isLeapYear) ){
         throw new IllegalArgumentException("Incorrect date");

     }


        int numberDays = 0;
        for (int i = 0; i < month.ordinal(); ++i) {

            numberDays += Month.values()[i].getDaysCount(isLeapYear);

        }
        numberDays += dayOfMonth;

        numberDays += newYearDay.ordinal() - 1;

        numberDays %= 7;

        return Day.values()[numberDays];

    }


}

