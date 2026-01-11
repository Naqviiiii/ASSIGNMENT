import java.util.*;
public class OriginalPrice {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter your discounted Price :");
        double DSP = input.nextDouble();
        System.out.print("Enter your discount percentage :");
        double DP=input.nextDouble();
        double OP=DSP/(1-(DP/100));
        System.out.print("The original price is :" + OP);
    }
    
}
