import java.util.Scanner;
public class Triangle {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter Length of First Side :");
        double len1=input.nextDouble();
        System.out.print("Enter length of Second Side :");
        double len2=input.nextDouble();
        System.out.print("Enter length of third side :");
        double len3=input.nextDouble();
        if (len1+len2>len3 && len2+len3 >len1 && len1+len3>len2) {
        double Peri=(len1+len2+len3)/2;
        double Area=Math.sqrt(Peri*(Peri-len1)*(Peri-len2)*(Peri-len3));
        System.out.println("The Semi-Perimeter of the Triangle is :" + Peri);
        System.out.println("The Area of the Triangle is : " + Area);
        }else{
            System.out.print("The Entered lengths does not make a triangle");
        }
        input.close();
    }
    
}
