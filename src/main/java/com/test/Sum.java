package com.test;

public class Sum {
    public static void main(String[] args) {
        int sum = 0;

        for (int i = 0; i < args.length; i++) {
            int num = Integer.parseInt(args[i]);
            sum += num;
            System.out.println("Param" + (i + 1) + ":" + " " + num);
        }
        System.out.print("Сумма:" + sum);
    }
}

