package com.test.stepic;

import java.lang.CharSequence;
import java.util.Arrays;

public class AsciiCharSequence implements CharSequence {



    public static void main(String[] args) {
        byte[] Array2 = {72, 101, 108, 108, 111, 33};

        AsciiCharSequence answer = new AsciiCharSequence(Array2);
        System.out.println("Последовательность - " + answer.toString());//Hello!
        System.out.println("Размер её - " + answer.length());//6
        System.out.println("Символ под № 1 - " + answer.charAt(1));//e
        System.out.println("Подпоследовательность - " + answer.subSequence(1, 5));//ello
        // проверка на нарушение инкапсуляции private поля
        System.out.println(answer.toString());//Hello!
        Array2[0] = 74;
        System.out.println(answer.toString());//Hello!
    }



    private  byte[] Array1;

    public AsciiCharSequence(byte[] inputArray){

        this.Array1=inputArray;
    }

    @Override
    public int length(){

        return Array1.length;
    }

    @Override
    public char charAt(int index){

        return (char)Array1[index];
    }


    @Override
    public CharSequence subSequence(int start, int end){

        return new AsciiCharSequence(Arrays.copyOfRange(Array1, start, end));
    }

    @Override
    public String toString(){

        StringBuilder result = new StringBuilder(Array1.length);
        for(int i = 0; i < Array1.length; i++ ){
            result.append((char)Array1[i]);
        }

        return result.toString();
    }

}
