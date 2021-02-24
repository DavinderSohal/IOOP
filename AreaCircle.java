import java.util.Scanner;

public class AreaCircle{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius: ");
        double radius = sc.nextDouble();
        double pi = 3.14;
        double area = pi * radius * radius;
        System.out.printf("Area of circle: %.2f", area);
    }
}
