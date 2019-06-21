package com.test;

import java.util.Scanner;

public class terst {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int count = 0;

        if (0 <= n && n<= 10000 && n > 10) {
        count= (n%100)/10;
        }
        else {
            count=0;
        }
        System.out.println(count);
    }
}



