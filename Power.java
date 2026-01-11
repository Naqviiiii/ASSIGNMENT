import java.util.Scanner;
public class Power {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter your Voltage reading :");
        Double Volts=input.nextDouble();
        System.out.print("Enter your Ampere reading :");
        double Ampere=input.nextDouble();
        double Watt=Volts*Ampere;
        System.out.print("Your total power calculated is :" + Watt);
    }
}
