import java.text.Format;
import java.text.NumberFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("Enter period in month:");
        Scanner scanner= new Scanner(System.in);
        byte month= scanner.nextByte();
        System.out.print("Enter Total price: ");
        int price=scanner.nextInt();
        /*System.out.print("Enter percentage per month: ");
        float percent=scanner.nextFloat();*/
        System.out.print("Enter annual percent rate: ");
        float percent=scanner.nextFloat()/12;
        float result =  price*month*percent/100;
        float result2= result/price;
        System.out.println("You will pay: "+ (result+price));
        NumberFormat percentValue=NumberFormat.getPercentInstance();
        String resultPercent= percentValue.format(result2);
        System.out.print("Extra pay is "+ resultPercent);

    }

}
