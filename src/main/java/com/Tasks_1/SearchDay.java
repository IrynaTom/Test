package com.Tasks_1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class SearchDay {

    public static void main(String[] args) throws ParseException {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter please your date: MM/dd/yyyy");
        String value = in.nextLine();
        SimpleDateFormat date= new SimpleDateFormat("MM/dd/yyyy");

        date.setLenient(false); // делает проверку на введенный год
        Date date1 = date.parse(value);
        SimpleDateFormat a = new SimpleDateFormat("MMM dd, yyyy", Locale.ENGLISH);
        String userDate= a.format(date1);
        System.out.println(userDate.toUpperCase());


        Calendar calendar = new GregorianCalendar();
        int month = calendar.get(Calendar.MONTH);
        int year =calendar.get(Calendar.YEAR);
        System.out.println(month);
        System.out.println(year);

}



 /*public static enterDate (){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter please your date: MM/dd/yyyy");
        String value = in.nextLine();
        SimpleDateFormat date= new SimpleDateFormat("MM/dd/yyyy");
        date.setLenient(false); // делает проверку на введенный год
        Date date1 = date.parse(value);
        SimpleDateFormat a = new SimpleDateFormat("MMM dd, yyyy", Locale.ENGLISH);
      //  System.out.println(a.format(date1).toUpperCase());
        return (a.format(date1));
    }*/

}
