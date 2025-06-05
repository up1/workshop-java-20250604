package org.example;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {

    public String say(int input) {
        List<MyRule> rules = new ArrayList<>();
        rules.add(new RuleJava());
        rules.add(new RuleFizzBuzz());
        rules.add(new RuleFizz());
        rules.add(new RuleBuzz());

        for (MyRule rule : rules) {
            if(rule.check(input)) {
                return rule.say();
            }
        }


        return input + "";
    }

}
