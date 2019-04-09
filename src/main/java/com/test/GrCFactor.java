package com.test;

import com.sun.org.apache.xpath.internal.operations.And;

public class GrCFactor {
    public static void main(String[] args) {
        int num0 = Integer.parseInt(args[0]);
        int num1 = Integer.parseInt(args[1]);
        int N1 = nod(num0,num1);
     //   System.out.println(nod(num0,num1));

        for (int i = 2; i < args.length; i++) {
            int num = Integer.parseInt(args[i]);
            N1=nod(N1,num);

        }
        System.out.println(N1);
    }

    public static int nod(int a, int b) {
        while (b != 0) {
            int tmp = a % b;
            a = b;
            b = tmp;
        }
        return a;
    }

}