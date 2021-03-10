import java.util.Scanner;

public class MobilePassword{
    public static void main(String[] args){

        // created scanner object
        Scanner sc = new Scanner(System.in);

        // finalized the value of password and pin-code
        final String password = "Let me in";
        final String pin_code = "1234";
        System.out.print("Please enter your password: ");

        //reading user input
        String my_pwd = sc.nextLine();
        int count = 0;

        //using loop to check password only 3 times
        for(int i = 0; i < 2; i++){

            // comparing the user input with actual password
            // if equal break the loop else prompt the user to re-enter password
            if(my_pwd.equals(password)){
                break;
            }else{
                System.out.println("\nIncorrect password");
                System.out.print("Please enter your password: ");
                my_pwd = sc.nextLine();
                count++;
            }
        }

        // after 3 incorrect tries ask user to enter the pin-code
        if(count == 2){
            System.out.println("\nYou entered incorrect password for 3 times.");
            System.out.print("To unlock please put your pin-code: ");

            // taking user input for pin-code
            String my_pin = sc.nextLine();
            if(my_pin.equals(pin_code)){
                System.out.println("\nCorrect pin-code!");
            }else{
                System.out.println("\nYou entered incorrect pin-code!");
            }
        }else{
            System.out.println("\nYour password is correct!");
        }
        sc.close();
    }
}
