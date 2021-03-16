import java.util.Scanner;

public class SimpleInterest{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double interest_per_year = 0.06;

        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.print("Enter the amount: $");
        double amount = sc.nextDouble();

        System.out.print("Enter # of years: ");
        double year = sc.nextDouble();

        double interest_amount = amount * interest_per_year * year;
        double final_amount = amount + interest_amount;

        System.out.printf("\nHello %s, the interest amount is $%.2f \nYour amount after %.1f years will be $%.2f\n",
                name,
                interest_amount, year, final_amount);
        sc.close();
    }
}
