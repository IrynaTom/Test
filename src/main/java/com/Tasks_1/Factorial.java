package com.Tasks_1;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        //double a = Math.floor(value / 100);
      //  System.out.println(a);

     //   double b = value - a * 100; // 56
     //   double c = Math.floor(b / 10);
     //   System.out.println(c);
    //    double d = b - c * 10; // 6
     //   System.out.println(d);
        Scanner in = new Scanner(System.in);
        System.out.println("Enter please your value:");
        String value = in.nextLine();
       int result = 1;
        for (int i = 1; i < value.length();i++) {
           result = result*i;
        }
        System.out.println(value.length() );
        System.out.println("Result:"+ result );

    }

   /* public static int enterValue() {
        Scanner in = new Scanner(System.in);
    System.out.println("Enter please your value:");
        String value = in.nextLine();
     //   int numFromUser = Integer.parseInt(value);
        int result = 1;
        for (int i = 1; i < value.length();i++) {
            result = result*i;
        }
        System.out.println("Result:"+result );
        return result;
    //    return value;
    }

 public static int elementList() {

        int result = 1;
        for (int i = 0; i < enterValue().length();i++) {
            result = result*i;
        }
        System.out.println("Result:"+result );
        return result;
    }*/
}