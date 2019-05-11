package com.test.stepic;

public class numberOfLeapYears {
    public static void main(String[] args) {

    }

    public static int leapYearCount(int year) {

        return ((year/400)+(year/4))-(year/100);

    }

}
