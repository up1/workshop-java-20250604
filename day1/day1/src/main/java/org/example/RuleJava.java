package org.example;

public class RuleJava implements MyRule {

    public boolean check(int input){
        return input % 7 == 0;
    }

    public String say() {
        return "JAVA";
    }

}
