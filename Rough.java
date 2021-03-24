import java.util.Scanner;
public class Rough
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // declaring username
        final String username = "navneet";
        String password = "";

        System.out.print("Enter your username: ");
        //taking username from user
        String user = sc.nextLine();

        // error message when incorrect username
        while(!user.equals(username)){
            System.out.println("Incorrect username! please try again");
            System.out.print("Enter your username: ");
            user = sc.nextLine();
        }

        // asking user to enter new password
        System.out.print("Enter new password: ");
        password = sc.nextLine();

        //password length should be more than 6
        while(password.length()<6){
            System.out.println("Length should be more than 6");

            System.out.print("Enter new password: ");
            password = sc.nextLine();
        }

        // confirming password
        System.out.print("Confirm password: ");
        String confirm = sc.nextLine();


        // making sure password and confirmm password are same
        while(confirm.equals(password)){
            System.out.println("Password and confirm did not match. try again");

            System.out.print("Enter new password: ");
            password = sc.nextLine();
            System.out.print("Confirm password: ");
            confirm = sc.nextLine();

        }

        // final message
        System.out.println("Password reset successfully!");
    }
}