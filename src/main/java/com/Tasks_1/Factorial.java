package com.Tasks_1;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {

         Scanner in = new Scanner(System.in);
           System.out.println("Enter please your value:");
           String value = in.nextLine();
           int numFromUser = Integer.parseInt(value);
          int result = 1;
           for (int i = 1; i <= numFromUser;i++) {
              result = result*i;
            }
           System.out.println(value.length() );
          System.out.println("Result:"+ result );

    }

}