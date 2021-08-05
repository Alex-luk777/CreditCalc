import java.util.Scanner;

public class Validator {
    public static byte monthIsValid(){
        Scanner scanner = new Scanner(System.in);
        byte month=1;
        do {
            System.out.print("Enter period in month(1-120):");
            month = scanner.nextByte();
        }while (month<1 || month>120);
        return month;
    }

    public static double percentIsValid(int monthInYear){
        Scanner scanner = new Scanner(System.in);
        double percents=2.0;
        do {
            System.out.print("Enter annual percent rate(1,0-80,0): ");
            percents=scanner.nextDouble();
        } while (percents<1.0 || percents>80.0);
              return percents/monthInYear;

    }
    public static int priceIsValid(){
        Scanner scanner = new Scanner(System.in);
        int price=100_000;
        while (true){
            System.out.print("Enter Total price(100k-10milion): ");
            price=scanner.nextInt();
            if (price>=100_000 && price<=10_000_000){
                break;
            }
            System.out.println("Error: price isn`t valid!!!");
        }

        /*do {
            System.out.print("Enter Total price(100k-10milion): ");
            price=scanner.nextInt();
        }while (price<100_000 || price>10_000_000);*/
        return price;

    }
}
