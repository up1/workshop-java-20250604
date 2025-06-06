package org.example.poc;

public class Demo {
    public static void main(String[] args) {
//        A a = new A();
//        B b = new B();
        C c = new C();
    }
}

interface A {
    abstract void process1();
}

abstract class B {
    void process2(){}
    abstract void process1();
}
class C {

}
