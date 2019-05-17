package com.test.stepic;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

public  abstract class streamsTest implements  Cloneable{
    public abstract int read() throws IOException;

    public static void main(String[] args) throws IOException {

        InputStream stream = new ByteArrayInputStream ( new byte[] { 0x33, 0x45, 0x01});
        System.out.println(checkSumOfStream(stream));
    }


    public static int checkSumOfStream(InputStream inputStream) throws IOException {
        int res = 0;
        int data;
    while(( data = inputStream.read()) != -1)
    {
        res = Integer.rotateLeft(res, 1) ^ data;
    }
        return res;
    }
}
