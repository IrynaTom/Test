package com.test.stepFP;

public class exchange{
    public static void main(String[] args) {
        int[] array = new int[4];
        array[0] = 10;
        array[1] = 8;
        array[2] = 6;
        array[3] = 1;
        int count=0;
        int s = 25;
        int n = array.length;
        for (int i = 0; i < n; i++) {

            int cnt = 0;
            cnt += s / array[i];
            count = count+cnt;
            s %= array[i];

            System.out.println(array[i] + " " + cnt);

        }
        System.out.println("Number of coins= "+count);
    }
}
