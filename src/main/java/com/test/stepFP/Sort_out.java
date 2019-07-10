package com.test.stepFP;

public class Sort_out {
    public static void main(String[] args) {

        String[] mas1 = {"a", "b", "c"};
        String[] mas2 = {"1", "2"};
        String[] mas3 = {"c", "a", "b"};
        int k = 0;

        for (int i = 0; i < mas2.length; i++) {

            for (int j = 0; j < mas2.length; j++) {


               // for (int z = 0; z < mas2.length; z++) {
                    k++;
                 //   System.out.println(mas1[i] + mas1[j] + mas1[z]);
                    System.out.println(mas2[i] + mas2[j]);


              //  }

            }

        }
        System.out.println(k);
    }
}
