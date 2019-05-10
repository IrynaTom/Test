package com.test.stepic;

import org.junit.*;
import static org.junit.Assert.*;

public class numberOfLeapYearTest {
   @Test
   public void Check1(){
      int y= numberOfLeapYears.leapYearCount(1);
       assertEquals(0, y);
   }
   @Test
    public void Check2(){
        int y= numberOfLeapYears.leapYearCount(4);
        assertEquals(1, y);
    }
    @Test
    public void Check3(){
        int y= numberOfLeapYears.leapYearCount(100);
        assertEquals(24, y);
    }
}
