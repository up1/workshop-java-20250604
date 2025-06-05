package org.example;

public class RuleBuzz implements MyRule {

    public boolean check(int input){
        return input % 5 == 0;
    }

    public String say() {
        return "Buzz";
    }

}
