import java.util.Scanner;

public class Variable{
    public static void main(String[] args){
        //defining an integer
        int x;
        x = 15153;
        System.out.println("X: " + x);

        //defining a long integer
        long y;
        y = 151615615166515616L;
        System.out.println("Y: " + y);

        //defining a float(decimal) value
        float z;
        z = 15.145f;
        System.out.println("Z: " + z);

        //finalizing the value of a variable
        final int a = 25;
        //a = 22;  this will give an error because variable defined with keyword final can't be changed.
        System.out.println("A: " + a);

        //taking input from user
        Scanner sc = new Scanner(System.in);
        System.out.print("What is your name? ");
        String name = sc.nextLine();
        System.out.println("Hello " + name);
    }
}
