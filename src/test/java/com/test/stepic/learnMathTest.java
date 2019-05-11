package com.test.stepic;

import org.junit.*;
import static org.junit.Assert.*;

public class learnMathTest {

@Test
    public void Check1(){
    boolean n = learnMath.doubleExpression(0.1,0.2,0.3);
        assertEquals(true, n);
    }
}
