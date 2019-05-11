package com.test.stepic;

public class learnFlipBit {
    public static void main(String[] args) {
        System.out.println( charExpression(32));
       System.out.println( charExpression(29));
    }

   /* public static int flipBit(int value, int bitIndex) {

    }*/

    public static char charExpression(int a) {
        char solidus = '\\';
        solidus += a;
        return solidus;
    }

}