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
      // for (int i=0; i< Month.MAY.ordinal(); i++) {

     //       System.out.println(Month.values()[i].lowDays);
     //       i += Month.values()[i].lowDays;
     //   }

  //     Month.JANUARY.getDaysCount(true);
       getCountOfDay("MAY", 7, false);


        }


    public static int getCountOfDay (String monthUser, int day, boolean year){
        int k=0;

        for (int i=0; i< Month.valueOf(monthUser).ordinal(); ++i){
            k += Month.values()[i].getDaysCount(year);
        }
        int CountDay= k+day;
        System.out.println(CountDay);
        return k;
    }




   /* public static getDayOfWeek(Day d, Month m, int date, boolean year) {

        for (Day day : Day.values()) {

        }*/
    }

