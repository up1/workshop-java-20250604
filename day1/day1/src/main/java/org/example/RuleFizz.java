package org.example;

public class RuleFizz implements MyRule {

    public boolean check(int input){
        return input % 3 == 0;
    }

    public String say() {
        return "Fizz";
    }

}
