package org.example.data;

import java.util.ArrayList;
import java.util.List;

public class DemoList {
    // Text block
    private static String data = """
            fgdfgdfg
            dfgdfgdf
            sdfgsdfgsdfg""";
    public static void main(String[] args) {
        System.out.println(data);
        List<Integer> datas = new ArrayList<>();
        datas.add(1);
        datas.add(2);
        datas.add(4);

        for (Integer data : datas) {
            if(data % 2 == 0) {
                System.out.println("> "+data);
            }
        }

        long d = datas.stream().parallel()
                .filter(i -> i%2==0)
                .count();
        System.out.println(d);


    }
}
