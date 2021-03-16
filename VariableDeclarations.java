import java.util.Scanner;

public class VariableDeclarations{

    // global variable
    public static final double PI = 3.14;

    public static void main(String[] args){
        double radius = 3;

        //accessing global variable
        double area_of_circle = PI * radius * radius;
        System.out.println("area of circle: " + area_of_circle);

        // data type: byte
        byte bt = 127;
        byte c = 'a';
        System.out.println("Byte: " + bt);
        System.out.println("Byte: " + c);

        // using scanner to take different types of input
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String: ");
        //taking string input
        String x = sc.nextLine();
        System.out.println("String: " + x);

        System.out.print("\nEnter Boolean: ");
        // taking boolean input
        boolean y = sc.nextBoolean();
        System.out.println("Boolean: " + y);

        System.out.print("\nEnter double: ");
        // taking double input
        double z = sc.nextDouble();
        System.out.println("Double: " + z);

        double a,b,cc,d;
        a = 5.0/2;
        b = 5/2.0;
        cc = (double) 5/2;
        d = 5/2;

        System.out.println(a);
        System.out.println(b);
        System.out.println(cc);
        System.out.println(d);
    }
}
