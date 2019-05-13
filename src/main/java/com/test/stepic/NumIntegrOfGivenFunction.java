package com.test.stepic;
import com.demo.task.calendar.Month;
import com.sun.org.apache.xerces.internal.impl.xpath.XPath;

import java.util.function.DoubleUnaryOperator;

public class NumIntegrOfGivenFunction {
    public static void main(String[] args) {
        System.out.println(integrate(x -> 1, 0, 10));//10.0
        System.out.println(integrate(x -> x + 2, 0, 10));//70.0
        System.out.println(integrate( x -> Math.sin(x) / x , 1, 5));//0.603848

    }


    public static double integrate(DoubleUnaryOperator f, double a, double b) {
        double gridStep = Math.pow(10,-6);
        double step = (b-a) / gridStep; //шаг сетки
        double res=0;

        for(int i=0; i <= step-1; i++) {
            res +=  f.applyAsDouble(step*(a+i));
        }

        res *= gridStep ;
       return res;

    }

}
