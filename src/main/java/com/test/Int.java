package com.test;

import java.util.Scanner;

public class Int {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int z = scanner.nextInt();
if(n<100 && k<100 && z<100){
    int one= (counter(n)+counter(k)+counter(z));
    System.out.println(one);
}
    }

    public static int counter(int x){
        int tables=0;
        double y=x%2;
        if (y==0){
            tables=x/2;
        }
        else{
            tables=x/2+ 1;
        }
        return tables;
    }
}

