package com.test.stepic;

import java.io.*;
import java.nio.charset.Charset;

public class ReadString {
    public static void main(String[] args) throws IOException {

        ByteArrayInputStream inputStream = new ByteArrayInputStream(new byte[]{48, 49, 50, 51});
        String str = readAsString(inputStream, Charset.forName("ASCII"));
        System.out.println(str);

    }

    public static String readAsString(InputStream inputStream, Charset charset) throws IOException {
        Reader reader = new InputStreamReader(inputStream, charset);
        StringWriter r = new StringWriter();
        int b;
        while ((b = reader.read()) != -1) {
            r.write(b);
        }
        String res= r.toString();
        return res;
    }
}
