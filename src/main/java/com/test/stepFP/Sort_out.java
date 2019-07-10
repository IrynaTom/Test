package com.test.stepFP;

public class Sort_out {
    public static void main(String[] args) {

        String[] mas1 = {"a", "b", "c"};
        String[] mas2 = {"b", "c", "a"};
        String[] mas3 = {"c", "a", "b"};
        int k = 0;

        for (int i = 0; i < mas1.length; i++) {

            for (int j = 0; j < mas2.length; j++) {


                for (int z = 0; z < mas3.length; z++) {
                    k++;
                    System.out.println(mas1[i] + mas1[j] + mas1[z]);


                }

            }

        }
        System.out.println(k);
    }
}
