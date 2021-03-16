import java.util.Scanner;

public class AtmMachine{
    public static void main(String[] args){

        // created scanner object
        Scanner sc = new Scanner(System.in);

        // declared the user password and the amount in account
        final String password = "1234";
        double amount = 999999;

        System.out.print("\nEnter your pin: ");

        // reading input from user
        String pin = sc.nextLine();

        // checking if pin entered by user equal to actual password or not
        if(pin.equals(password)){

            // asking user whether he want to withdraw money or not
            System.out.print("Do you want to withdraw money?(yes/no) ");
            String choice = sc.nextLine().toLowerCase();

            // if user want to withdraw money
            if(choice.equals("yes")){

                // asking user to enter the amount he want to withdraw
                System.out.print("Enter the amount you want to withdraw: ");
                double withdraw_amount = sc.nextDouble();

                // if amount entered is more than the amount in account, transaction will be declined and program
                // will end
                // otherwise selected amount will be given to user.
                if(withdraw_amount <= amount){
                    System.out.println("Your transaction of $" + withdraw_amount + " has been approved." + " Thank " +
                            "you!");
                    System.out.println("\nRemaining balance in your account: $" + (amount - withdraw_amount));
                }else{
                    System.out.println("\nYou don't have sufficient balance in your account.");
                    System.out.println("Transaction not approved." + " Thank you!");
                }
            }else{
                System.out.println("\nThank you!");
            }
        }else{

            // if password enter is incorrect, user will get this message.
            System.out.println("\nPassword is incorrect! please try again.");

            //making recursive call to main function to re-run the program
            main(args);
        }
    }
}
