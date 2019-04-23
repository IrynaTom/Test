package com.Tasks_1;

import java.util.Scanner;

public class Fibonache {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter please your N: ");
        String value = in.nextLine();
        int numFromUser = Integer.parseInt(value);

        int a=0;
        int b=1;

        for (int i = 2; i < numFromUser; ++i) {
            int next = a + b;
            a = b;
            b = next;
        }

        System.out.println("Number: "+b);

    }
}
