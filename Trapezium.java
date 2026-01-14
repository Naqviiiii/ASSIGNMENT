import java.util.Scanner;
public class Trapezium {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the fisrt parallel length :");
        double Length1=input.nextDouble();
        System.out.print("Enter the second parallel side length :");
        double Length2=input.nextDouble();
        System.out.print("Enter the Height of the trapezium :");
        double Height1=input.nextDouble();
        double Area=Height1*(Length1+Length2)*0.5;
        System.out.print("The Area of this trapezium is " + Area);
        input.close();
    }
    
}

