package org.example.poc;

public class DateFormatUtil {
    private DateFormatUtil(){
    }

    public void format1() {
    }
    public void format2() {
    }
    public void format3() {
    }

    // 2.
    static DateFormatUtil instance;
    public static DateFormatUtil getInstance(){
        if(instance == null) {
            instance = new DateFormatUtil();
        }
        return instance;
    }


}

class XX {
    public static void main(String[] args) {
        DateFormatUtil.getInstance().format1();
        DateFormatUtil.getInstance().format2();
        DateFormatUtil.getInstance().format3();
    }
}
