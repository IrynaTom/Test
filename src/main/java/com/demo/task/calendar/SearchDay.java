package com.demo.task.calendar;

import com.sun.xml.internal.bind.v2.model.core.MaybeElement;

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

  //     Month.JANUARY.getDaysCount(true);
       getCountOfDay("MAY", 7, false);
        System.out.println(Day.values()[1+10]);


        }


    public static int getCountOfDay (String monthUser, int day, boolean year){
        int numberDays=0;

        for (int i=0; i< Month.valueOf(monthUser).ordinal(); ++i){
            numberDays += Month.values()[i].getDaysCount(year);
        }
        int CountDay= numberDays+day;
        System.out.println(CountDay);
        return numberDays;
    }


    }

