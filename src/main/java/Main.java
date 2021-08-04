import java.text.Format;
import java.text.NumberFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        final int monthInYear=12;
        final int percentAre=100;
        System.out.print("Enter period in month:");
        Scanner scanner= new Scanner(System.in);
        byte month= scanner.nextByte();
        System.out.print("Enter Total price: ");
        int price=scanner.nextInt();
        /*System.out.print("Enter percentage per month: ");
        float percent=scanner.nextFloat();*/
        System.out.print("Enter annual percent rate: ");
        float percentInMonth=scanner.nextFloat()/monthInYear;
        float result =  price*month*percentInMonth/percentAre;
        float result2= result/price;
        System.out.println("You will pay: "+ (result+price));
        NumberFormat percentValue=NumberFormat.getPercentInstance();
        String resultPercent= percentValue.format(result2);
        System.out.print("Extra pay is "+ resultPercent);

    }

}
