package org.example.dip;

import java.util.Random;

public class LabelGeneration {

    Random random = new Random();

    public String create(String prefix) {
        int number = random.nextInt(10);
        if(number> 10) {
            return "Error";
        }
        return prefix + "-" + number;
    }


}
