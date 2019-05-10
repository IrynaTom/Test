package com.test.stepic;

public class numberOfLeapYears {
    public static void main(String[] args) {
        System.out.println(((1%4) - (1%100)) / (1%400));
        System.out.println(100%400);
        System.out.println(100%4);
        System.out.println(100%100);

        System.out.println(4%400);
        System.out.println(4%4);
        System.out.println(4%100);
    }

    public static int leapYearCount(int year) {
       boolean y= (( year%4==0) & (year%100 != 0)) | (year%400==0);


      //  return ((year%4)-(year%100))+(year%400);
        return ((year%400)+(year%4))-(year%100);
    }

}
