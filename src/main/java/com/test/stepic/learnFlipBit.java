package com.test.stepic;


import java.math.BigInteger;

public class learnFlipBit {
    public static void main(String[] args) {
       // System.out.println( charExpression(32));
     //  System.out.println( charExpression(29));
      //  System.out.println( flipBit(13,3));
        //System.out.println(isPowerOfTwo(8));
     //   System.out.println (isPalindrome("Madam, I'm Adam!"));
      //  System.out.println (isPalindrome("Madam, I'm Adwerweram!"));
        System.out.println (factorial(2));
    }

    public static int flipBit(int value, int bitIndex) {

        return value ^ (1 << (bitIndex - 1));
    }

    public static char charExpression(int a) {
        char solidus = '\\';
        solidus += a;
        return solidus;
    }

    public static boolean isPowerOfTwo(int value) {
        value = Math.abs(value);
if (value==0 ) {
    return  false;
}
        return  Integer.highestOneBit(value)==Integer.lowestOneBit(value);
    }

    public static boolean isPalindrome(String text) {
       text = text.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
       StringBuilder builder= new StringBuilder(text);
String reverse = builder.reverse().toString();

        return text.equals(reverse);
    }

    public static BigInteger factorial(int value) {
        BigInteger factor = BigInteger.ONE;
        for(int i=1; i<= value; i++)
        {
            factor= factor.multiply(BigInteger.valueOf(i));
        }
        return factor;
    }

}