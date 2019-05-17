package com.test.stepic;


import java.io.ByteArrayInputStream;

public class ConvertLineBreaks {

    public static void main(String[] args) throws Exception {
        int previous = 0;
        int current = 0;
        System.setIn(new ByteArrayInputStream(new byte[]{13, 13, 13, 13, 10}));

        while ((current = System.in.read()) != -1) {
            if (current == 13) {
                if (previous == 13) {
                    //System.out.write(previous);
                    System.out.println(previous);
                }

                previous = current;
            } else if (current == 10 && previous == 13) {
                //System.out.write(current);
                System.out.println(current);
                previous = current;
            } else if (previous == 13 && current != 10) {
                // System.out.write(previous);
                // System.out.write(current);
                System.out.println(previous);
                System.out.println(current);
                previous = current;
            } else {
                System.out.println(current);
                //System.out.write(current);
                previous = current;
            }
        }

        if (previous == 13) {

            //System.out.write(previous);
            System.out.println(previous);
        }

        System.out.flush();
    }
}
