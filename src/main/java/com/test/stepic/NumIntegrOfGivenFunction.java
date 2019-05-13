package com.test.stepic;
import java.util.function.DoubleUnaryOperator;

public class NumIntegrOfGivenFunction {
    public static void main(String[] args) {
        System.out.println(integrate(x->1, 0, 10));
    }


    public static double integrate(DoubleUnaryOperator f, double a, double b) {
        double gridStep= Math.pow(10, -7);
      double res=0;
        double step = (b-a)/gridStep; //шаг сетки
        for(double i=a; i<=b; i++) {
            res += (f.applyAsDouble(a+step*i));
        }
        res += step;
       return res;
    }

}
