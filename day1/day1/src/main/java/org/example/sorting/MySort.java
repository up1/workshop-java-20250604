package org.example.sorting;

import java.util.ArrayList;
import java.util.List;

public class MySort {
    public List<Integer> sort(List<Integer> inputs) {
        // Initial result
        List<Integer> result = new ArrayList<>();
        result.addAll(inputs);

        // Start soring
        boolean isSwap = true;
        while(isSwap) {
            isSwap = false;
            int i = 0;
            while (i < result.size() - 1) {
                if (result.get(i) > result.get(i + 1)) {
                    // Swap
                    isSwap = true;
                    int tmp = result.get(i);
                    result.set(i, result.get(i + 1));
                    result.set(i + 1, tmp);
                }
                i++;
            }
        }
        return result;
    }
}
