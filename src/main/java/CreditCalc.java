import java.text.NumberFormat;
import java.util.Scanner;

public class CreditCalc {
    public static void inputData(int monthInYear,int percentAre){
        Limits month=new Limits(1,120,"Enter month");
        Limits cost=new Limits(100_000,10_000_000,"Enter price");
        Limits percent=new Limits(1,80,"Enter annual percent");

        double price=NewValidator.valid(cost.llimit,cost.hlimit,cost.message);
        double result =  NewValidator.valid(month.llimit,month.hlimit,month.message)*(NewValidator.valid(percent.llimit,percent.hlimit,percent.message)/monthInYear)*price/percentAre;

        System.out.println("You will pay: "+ (result+price));

        NumberFormat percentValue=NumberFormat.getPercentInstance();
        String resultPercent= percentValue.format(result/price);
        System.out.print("Extra pay is "+ resultPercent);
    }
}
