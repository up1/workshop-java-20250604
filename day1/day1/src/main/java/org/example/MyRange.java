package org.example;

/**
 *
 */
public class MyRange extends Object {

    private final String input;

    public MyRange(String input) {
        this.input = input;
    }

    /**
     *
     * @return
     */
    public boolean startWithInclude() {
        return input.startsWith("[");
    }

    public int getStart() {
        int value = Integer.parseInt(String.valueOf(input.charAt(1)));
        if(startWithInclude()) {
            return value;
        }
        return  value + 1;
    }

    public String getResult() {
        StringBuilder result = new StringBuilder();
        for (int i = getStart(); i <= 5 ; i++) {
            result.append(i).append(",");
        }
        return result.substring(0, result.length()-1);
    }
}
