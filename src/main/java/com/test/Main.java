package com.test;

public class Main {
    public static void main(String[] args) {
        int arrayLength = args.length;
        System.out.println("Length:"+ arrayLength);
        for(int i=0; i< args.length; i++){
            String num=args[i];
            int z=i+1;
            System.out.println("Param:"+ (i+1)+ " "+ num);
        }
    }
}
