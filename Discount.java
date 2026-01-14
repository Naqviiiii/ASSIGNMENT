import java.util.*;
public class Discount {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.print("Enter the original selling price :");
        double OSP=input.nextDouble();
        System.out.print("Enter the Discounted percentage :");
        double DP=input.nextDouble();
        double DSP;
        DSP=OSP*(100 - DP)/100;
        System.out.print("Your total ammount after discount is " + DSP);
        input.close();
    }

}
