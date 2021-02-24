//Add two integer value (user input)

import java.util.Scanner;

public class AddInteger{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st #: ");
        int num1 = sc.nextInt();
        System.out.print("Enter 2nd #: ");
        int num2 = sc.nextInt();
        int sum = num1 + num2;
        System.out.println("Addition of two numbers: " + sum);
    }
}
