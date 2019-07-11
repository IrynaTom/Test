package com.test.stepFP;

public class exchange {
    public static void main(String[] args) {
        int[] array = new int[4];
        array[0] = 10;
        array[1] = 5;
        array[2] = 2;
        array[3] = 1;

        int s = 39;
        int n = array.length;
        for (int i = 0; i < n; i++) {
            int cnt = 0;
            cnt += s / array[i];
            s %= array[i];
            System.out.println(array[i] + " " + cnt);
        }
    }
}
