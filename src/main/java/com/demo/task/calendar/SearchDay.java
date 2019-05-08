package com.demo.task.calendar;

import com.sun.xml.internal.bind.v2.model.core.MaybeElement;

import java.text.ParseException;


public class SearchDay {

    public static void main(String[] args) throws ParseException {

        System.out.println(getCountOfDay(Day.WEDNESDAY, Month.DECEMBER, 31,true));
    }



    public static Day  getCountOfDay(Day newYearDay, Month month, int dayOfMonth, boolean isLeapYear){

        int numberDays = 0;

        for (int i = 0; i < month.ordinal(); ++i) {

            numberDays += Month.values()[i].getDaysCount(isLeapYear);

        }
        numberDays += dayOfMonth;

        numberDays += newYearDay.ordinal()-1;

        numberDays %= 7;

        return  Day.values()[numberDays];

    }



}

