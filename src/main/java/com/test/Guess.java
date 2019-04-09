package com.test;
import java.util.Scanner;

public class Guess {
    int secretValue;
    public static void main(String[] args) {

        int range = Integer.parseInt(args[0]);

        int secretValue  = (int) (Math.random() * range);
        System.out.println("The system is generate code:" + " " + secretValue );
        System.out.println("The period is " + "0 - " + range);

        int numFromUser1=enterValue();
        System.out.println("Value from user :" + " " + numFromUser1);

        Match(secretValue , numFromUser1);
        System.out.println("Guess");
    }

    public static int Match(int a, int b) {
        while (a != b) {
            if (a < b) {
                System.out.println("Incorrect value. Random less then your variant. Try again");
            } else {
                System.out.println("Incorrect value. Your variant less then Random. Try again");
            }
            b=enterValue();
        }
        return b;
    }
    public static int enterValue (){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter please your value:");
        String value = in.nextLine();
        int numFromUser = Integer.parseInt(value);
        return numFromUser;
    }
}