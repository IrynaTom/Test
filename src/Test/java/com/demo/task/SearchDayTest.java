package com.demo.task;

import com.demo.task.calendar.Day;
import com.demo.task.calendar.Month;
import com.demo.task.calendar.SearchDay;
import org.junit.*;
import static org.junit.Assert.*;


public class SearchDayTest {


@Test
    public void testisLeapYear(){
      Day day= SearchDay.getDayOfWeek(Day.WEDNESDAY, Month.DECEMBER, 31,true);
      assertEquals(Day.THURSDAY,day);
}

@Test
    public void testisNotLeapYear(){
    Day day= SearchDay.getDayOfWeek(Day.TUESDAY, Month.MAY, 8,false);
    assertEquals(Day.WEDNESDAY,day);
}

@Test
    public void newYearDay(){
    Day day= SearchDay.getDayOfWeek(Day.TUESDAY, Month.JANUARY, 1,false);
    assertEquals(Day.TUESDAY,day);
}


}

