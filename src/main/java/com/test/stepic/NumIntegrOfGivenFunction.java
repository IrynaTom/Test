package com.test.stepic;
import com.demo.task.calendar.Month;

import java.util.function.DoubleUnaryOperator;

public class NumIntegrOfGivenFunction {
    public static void main(String[] args) {
        System.out.println(integrate(x->2, 0, 10));
    }


    public static double integrate(DoubleUnaryOperator f, double a, double b) {
        double gridStep = Math.pow(10,-6);
        double step = (b-a) / gridStep; //шаг сетки
        double res=0;

        for(int i=0; i < gridStep; i++) {
            res += f.applyAsDouble(a+i*step);
        }

        System.out.println(res);
        res *= step;
        System.out.println(res);
       return res;
    }

}
