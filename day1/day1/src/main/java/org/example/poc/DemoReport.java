package org.example.poc;

public class DemoReport {
    public static void main(String[] args) {
        Report1 report1 = new Report1();
        report1.process();
    }
}

abstract class ReportTypeA {
    abstract void createHeader();
    abstract void createBody();
    abstract void createFooter();

    void process(){
        createHeader();
        createBody();
        createFooter();
    }
}

abstract class ReportTypeB {
    abstract void createHeader();
    abstract void createBody();

    void process(){
        createHeader();
        createBody();
    }
}

class Report1 extends ReportTypeA{

    @Override
    void createHeader() {
        System.out.println("Header Report 1");
    }

    @Override
    void createBody() {
        System.out.println("Body Report 1");
    }

    @Override
    void createFooter() {
        System.out.println("Footer Report 1");
    }
}
