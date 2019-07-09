package com.test;

import java.util.Scanner;

public class Int {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int h = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();

       int res= (h/(a-b))-a/(a-b)+1;
        System.out.println(res);
    }
}

