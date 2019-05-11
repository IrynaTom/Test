package com.test.stepic;
import java.math.*;

public class learnMath {
    public static void main(String[] args) {

    }
    public static boolean doubleExpression(double a, double b, double c) {
        double e =0.0001;
        return Math.abs(a+b-c) < e;
    }

}
