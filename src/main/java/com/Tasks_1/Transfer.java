package com.Tasks_1;

import java.util.Scanner;

public class Transfer {
    public static void main(String[] args) {
       // int a,b,c;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter please your number");
        String value1 = in.nextLine();
        int a = Integer.parseInt(value1);
        System.out.println("Enter please your number");
        String value2 = in.nextLine();
        int b = Integer.parseInt(value2);
        System.out.println(a+ " "+b);
      trans(a,b);


    }
    public static void trans(int a, int b){
        a = a+b;
        b = a-b;
        a= a-b;
        System.out.println(a+ " "+b);
    }
}
