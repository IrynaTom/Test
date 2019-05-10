package com.test.stepic;

import org.junit.*;
import static org.junit.Assert.*;


public class ReturnTrueTest {

    @Test
    public void CheckFalse1(){
       boolean t= ReturnTrue.booleanExpression(false, false, false, false);
               assertEquals(false,t);
}
    @Test
    public void CheckFalse2(){
        boolean t= ReturnTrue.booleanExpression(true, true, true, true);
        assertEquals(false,t);
}

    @Test
    public void CheckFalse3(){
        boolean t= ReturnTrue.booleanExpression(false, false, true, true);
        assertEquals(true,t);
}
    @Test
    public void CheckFalse4(){
        boolean t= ReturnTrue.booleanExpression(true, false, true, false);
        assertEquals(true,t);
    }
    @Test
    public void CheckFalse5(){
        boolean t= ReturnTrue.booleanExpression(true, false, false, true);
        assertEquals(true,t);
    }

    @Test
    public void CheckFalse6(){
        boolean t= ReturnTrue.booleanExpression(true, false, false, false);
        assertEquals(false,t);
    }
    @Test
    public void CheckFalse7(){
        boolean t= ReturnTrue.booleanExpression(true, true, true, false);
        assertEquals(false,t);
    }


}
