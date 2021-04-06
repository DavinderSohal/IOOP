import java.util.Scanner;

public class midTermGrp1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in); //  created scanner object

        final String username = "username";
        String password = "Let me in";
        final String pin_code = "1234";
        System.out.print("Please enter your username: ");
        String my_username = sc.nextLine();  // asking user to enter username

        while(!username.equalsIgnoreCase(my_username)){  // checking  if username is correct
            System.out.print("Incorrect username\n\nPlease re-enter your username: ");
            my_username = sc.nextLine();   // if incorrect ask again until correct
        }

        System.out.print("Please enter your password: ");
        String my_pwd = sc.nextLine();   // asking user to enter password

        if(!my_pwd.equals(password)){    // check if password is correct or not
            // if wrong ask user to enter pin-code
            System.out.print("You entered incorrect password\n\nTo unlock please put your pin-code: ");
            String my_pin = sc.nextLine();
            if(my_pin.equals(pin_code)){   // check if pin is correct

                // if correct ask user to reset password
                System.out.print("\nCorrect pin-code!\nReset your password\n\nPlease enter new password: ");
                password = sc.nextLine();     // saving value of new password
                System.out.println("\nNew password set successfully: " + password); // password changed
            }else{
                System.out.println("\nYou entered incorrect pin-code!\n\nYou can't enter the app");  // else
                // terminate program
            }
        }else{
            System.out.println("\nYour password is correct!\n\nWelcome to the app.");  // let in to app
        }
        sc.close();
    }
}