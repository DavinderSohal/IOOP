import java.util.Scanner;

public class CoffeeMachine{
    public static void main(String[] args){

        // created scanner object
        Scanner sc = new Scanner(System.in);

        // declared value of password and available coffee and tea drinks
        String password = "turn on";
        double coffee = 45;
        double tea = 72;

        // asking user for password
        System.out.print("Enter password to turn machine on : ");

        // reading user input
        String pwd = sc.nextLine();

        // checking if password entered by user is correct or not
        if(pwd.equals(password)){

            //if password is correct, ask whether he want tea or coffee
            System.out.print("What do you want ?(coffee or tea) ");

            //reading input
            String user_choice = sc.nextLine();

            // asking the number of drinks
            System.out.print("How many drinks? ");
            double drink_amount = sc.nextDouble();

            // if he choose coffee
            if(user_choice.equals("coffee")){

                // check if coffee is available
                if(drink_amount <= coffee){

                    // if available, it's approved
                    System.out.println("Approved! Enjoy your coffee" + ". Thank you!");
                }else{

                    // else declined
                    System.out.println("Not approved" + "thank you");
                }
            }else if(user_choice.equals("tea")){
                // if he choose tea
                // check if tea is available
                if(drink_amount <= tea){
                    System.out.println("Approved! Enjoy your tea" + ". Thank you!");
                }else{
                    // if available, it's approved
                    System.out.println("Not approved" + ". Thank you");
                }
            }
        }else{

            // if password is not correct.
            System.out.println("Password is incorrect! please try again.");
        }
    }
}