package com.test.stepFP;

import java.util.ArrayList;

public class Splitting_number {
    int n = 5;

    public static void main(String[] args) {
    new Splitting_number().rec(0,0,1);
    }

     void  rec(int ind, int sum, int last) {

        if (sum == n) {
            System.out.println(last);

        }
        else {
            for (int i = last; i <= n - sum; i++) {
                ind = ind + 1;
                last = i;
                sum = sum + i;
                System.out.println(sum + " last" + last);
            }
        }

    }
}
