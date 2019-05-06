package com.demo.task.calendar;

import java.awt.event.MouseAdapter;
import java.text.ParseException;

public class SearchDay {

    public static void main(String[] args) throws ParseException {

      /*  Scanner inDay = new Scanner(System.in);
        System.out.println("Enter please your day");
        String day = inDay.nextLine();

        Scanner inMonth = new Scanner(System.in);
        System.out.println("Enter please your month");
        String month1 = inMonth.nextLine();
        int month = Integer.parseInt(month1);

        Scanner inNumber = new Scanner(System.in);
        System.out.println("Enter please your number");
        String number1 = inNumber.nextLine();
        int number = Integer.parseInt(number1);

        Scanner inYear = new Scanner(System.in);
        System.out.println("Enter please your year");
        String year1 = inYear.nextLine();
        try{
            boolean year = Boolean.parseBoolean(year1);
        }catch (NumberFormatException e) {
            System.err.println("Неверный формат строки!");
        }*/


    }

    public enum DayOfWeek {
        SUNDAY,
        MONDAY,
        TUESDAY,
        WEDNESDAY,
        THURSDAY,
        FRIDAY,
        SATURDAY;
    }

    public enum Month {
        January(31),
        February(28, 29),
        March(31),
        April(30),
        May(31),
        June(30),
        July(31),
        August(31),
        September(30),
        October(31),
        November(30),
        December(31);

        private int leapDays;
        private int lowDays;

        Month(int days) {
            this(days, days);
        }

        Month(int leapDays, int lowDays) {
            this.leapDays = leapDays;
            this.lowDays = lowDays;
        }
    }

    public DayOfWeek getDayOfWeek(DayOfWeek, Month, int date, boolean year) {
    int finalDay;

        if (year = true) {
            int fab = Month.February.lowDays;
        } else {
            int fab = Month.February.leapDays;
        }
        for (int i = 0; i <= Month; i++) {
        finalDay= ++ finalDay;
        }
        finalDay = finalDay+date;
    }

}

