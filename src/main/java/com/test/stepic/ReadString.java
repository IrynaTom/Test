package com.test.stepic;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;

public class ReadString {
    public static void main(String[] args) {

    }

    public static String readAsString(InputStream inputStream, Charset charset) throws IOException {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        byte[] buffer = new byte[4096];
        int k;
        StringBuffer sb = new StringBuffer();
        while((k=inputStream.read()) != -1)
        {
            out.write(buffer, 0, k);
        }
        return new String(out.toByteArray(), charset);
    }
}
