import java.util.Scanner;

public class Rough{

    public static void main(String[] args){

        double rate = 6.0, principle, year, Interest;
        Scanner ab = new Scanner(System.in);
        System.out.println("Enter the principle amount");
        principle = ab.nextDouble();
        System.out.println("Enter the Number of years");
        year = ab.nextDouble();
        Interest = (principle * year * rate) / 100;
        System.out.println("Enter your name");
        ab.nextLine();
        String name = ab.nextLine();

        System.out.println("Hello! " + name + " The interest for the asked amount will be  " + Interest);
    }
}
