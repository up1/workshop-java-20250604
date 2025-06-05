package org.example;

public class RuleFizzBuzzV2 implements MyRule {

    public boolean check(int input){
        return input % 3 == 0 && input % 5 == 0;
    }

    public String say() {
        return "FizzBuzz";
    }

}
