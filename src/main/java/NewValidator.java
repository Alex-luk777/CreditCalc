import java.util.Scanner;

public class NewValidator {

    public static double getData(){
        Scanner scanner= new Scanner(System.in);
        return scanner.nextDouble();
    }

    public static double valid(double llimit, double hlimit,String message){
        double variable=1;
        boolean flag=false;
        while (true) {
            System.out.print(message+"("+llimit+"-"+hlimit+"): ");
            variable = getData();
            flag = (variable >= llimit && variable <= hlimit);
            if (flag)
                break;
            System.out.println("Input isn`t valid");
        }
        return variable;
    }


    }




