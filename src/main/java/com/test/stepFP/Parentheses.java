package com.test.stepFP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Parentheses {

    static char [] array;
    static int n;


    public static void main(String[] args) throws IOException {
       // String s = "()()((";
       // System.out.println(correct_parentheses(s));
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(in.readLine());
        array = new char [2*n];
        rec(0, 0);

    }
    //True/False String correct Parentheses
   static boolean correct_parentheses(String s) {
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
    //Count Parentheses
    static void rec(int idx, int bal){

        if(idx==2*n) {
                if (bal == 0) {
                    for (int i = 0; i <= array.length; i++) {
                    System.out.println(array[idx] + " + ");
                        return;
                }
            }
            for (int i = 0; i <= array.length; i++) {
                System.out.println(array[idx-1]);
                return;
            }

        }
        array[idx]= '(';
        rec(idx+1, bal+1);
        if(bal==0){
            return;
        }
        array[idx]= ')';
        rec(idx+1, bal-1);

    }
}
