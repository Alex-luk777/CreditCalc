import java.text.Format;
import java.text.NumberFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        final int monthInYear=12;
        final int percentAre=100;
        CreditCalc.inputData(monthInYear,percentAre);
    }

}

class Limits {
    double llimit;
    double hlimit;
    String message;
    public Limits(double llimit, double hlimit, String message){
        this.llimit=llimit;
        this.hlimit=hlimit;
        this.message=message;
    }
}
