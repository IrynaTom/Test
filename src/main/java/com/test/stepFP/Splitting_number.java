package com.test.stepFP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Splitting_number {

    static int[] array;
    static int n;

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(in.readLine());
        array = new int[n];
    rec(0,0,1);

    }

    public static void rec(int ind, int sum, int last) {

        if (sum == n) {
            for (int i = 0; i < ind - 1; i++) {
                System.out.print(array[i] + " + ");
            }
            System.out.println(array[ind - 1]);
            return;
        }
        else {
            for (int i = last; i <= n - sum; i++) {
                array[ind] = i;
                rec(ind + 1, sum + i, i);
            }
        }

    }
}
