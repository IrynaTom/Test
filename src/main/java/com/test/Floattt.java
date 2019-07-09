package com.test;

import java.util.Scanner;

public class Floattt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int a = x % 100;

        System.out.println((a / 10) ^ (a % 10));

    }
}