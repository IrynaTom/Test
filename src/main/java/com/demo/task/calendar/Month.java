package com.demo.task.calendar;

public enum Month {
    JANUARY(31),
    FEBRUARY(29, 28),
    MARCH(31),
    APRIL(30),
    MAY(31),
    JUNE(30),
    JULY(31),
    AUGUST(31),
    SEPTEMBER(30),
    OCTOBER(31),
    NOVEMBER(30),
    DECEMBER(31);

    private int leapDays;
    private int lowDays;

    Month(int days) {
        this(days, days);
    }

    Month(int leapDays, int lowDays) {
        this.leapDays = leapDays;
        this.lowDays = lowDays;
    }
   public int getDaysCount (boolean isLeapYear){
     int k=0;
              if (isLeapYear == true) {
                     k = leapDays; }
          else {
                k  = lowDays; }
   return k;
}

}