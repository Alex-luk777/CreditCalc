import java.text.NumberFormat;
import java.util.Scanner;

public class CreditCalc {
    public static void inputData(int monthInYear,int percentAre){
        /*System.out.print("Enter percentage per month: ");
        float percent=scanner.nextFloat();*/
        int price=Validator.priceIsValid();
        double result =  Validator.monthIsValid()*Validator.percentIsValid(monthInYear)*price/percentAre;
        double result2= result/price;
        System.out.println("You will pay: "+ (result+price));
        NumberFormat percentValue=NumberFormat.getPercentInstance();
        String resultPercent= percentValue.format(result2);
        System.out.print("Extra pay is "+ resultPercent);
    }
}
