package com.test.stepFP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Parentheses {

    static int[] array;
    static int n;


    public static void main(String[] args) throws IOException {
        String s = "()()((";
       // System.out.println(correct_pare(s));

        rec(0, 0);

    }

    static boolean correct_pare(String s) {
        int bal = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                bal++;
            } else {
                bal--;
            }
            if (bal < 0) {
                return false;
            }
        }
        return bal==0;
    }
    static void rec(int idx, int bal){
        if(idx==2*n){
            if (bal==0){
                System.out.println();
                return;
            }
        }
       else{ array[idx]= '(';
        rec(idx+1, bal+1); }
        if(bal==0){
            return;
        }
       else { array[idx]= ')';
        rec(idx+1, bal-1);
       }
    }
}
