package com.test.stepFP;

public class Parentheses {
    public static void main(String[] args) {
        String s = "()()";
        correct_pare(s);
    }

    static  boolean  correct_pare(String s){
               int bal=0;
        for(int i=0; i< s.length();i++){
            if(s.charAt(i) == '(') {
                bal++;
            }
            else {bal--;}
            if(bal<0){
               return false;
            }

        }
        return true;
    }
}
