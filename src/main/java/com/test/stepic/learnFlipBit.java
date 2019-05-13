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
       // System.out.println (factorial(2));
        for (int i:mergeArrays(new int[]{0,2,2}, new int[] {1,3})
             ) {
            System.out.println(i);
        }

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

    public static int[] mergeArrays(int[] a1, int[] a2) {
        int [] res= new int [a1.length+a2.length];
        int i1=0;
        int i2=0;

        for(int i=0; i< res.length; i++){
            if(a1[i1]<a2[i2]){
                res[i]=a1[i1];
                i1++;
                if (i1 >= a1.length){
                    i++;
                    for (int j = i2; j < a2.length; j++, i++) {
                        res[i] = a2[j];
                    }
                }
            }
            else {
                res[i]=a2[i2];
                i2++;
                if (i2 >=a2.length){
                    i++;
                    for (int j = i1; j < a1.length; j++, i++) {
                        res[i] = a1[j];
                    }
                }
            }

        }
        return res;
    }
}