package com.test.stepic.Collect;


import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.text.DecimalFormat;
import java.util.*;

public class Collect2 {
    public static void main(String[] args) throws IOException {

        String str = readString(System.in);
        double sum = 0;
     //   String value = in.nextLine();

        ArrayList<String> collection = new ArrayList<>();


        List list = Arrays.asList(str.split("\\s"));
        Iterator<String> it = list.iterator();
        int idx = 0;
        while (it.hasNext()) {
            String element = it.next();
            if (idx++ % 2 == 0) continue;
            collection.add(element);
        }
        ListIterator lit = collection.listIterator(collection.size());
        while(lit.hasPrevious()) {
            String element = (String)lit.previous();
            System.out.print(element + " ");
        }

        }
    static String readString(InputStream is) throws IOException {
        char[] buf = new char[2048];
        Reader r = new InputStreamReader(is, "UTF-8");
        StringBuilder s = new StringBuilder();
        while (true) {
            int n = r.read(buf);
            if (n < 0)
                break;
            s.append(buf, 0, n);
        }
        return s.toString();
    }
    }


