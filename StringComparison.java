import java.util.Scanner;

public class StringComparison{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        /*String password = "Let me in";
        String a = "Let me in";

        System.out.print("Enter password: ");
        String pwd = sc.nextLine();

        System.out.println(password.equals(a));
        System.out.println(password == a);
        System.out.println(password.equals(pwd));
        System.out.println(password == pwd); // will return false as it check address too.*/

       /* String password_new = "Let ME in";

        System.out.print("Enter password: ");
        String pwd_new = sc.nextLine();
        if(password_new.toLowerCase().equals(pwd_new.toLowerCase())){
            System.out.println("Correct");
        }else{
            System.out.println("Incorrect");
        }*/

        String password_new_1 = "Let ME in";

        System.out.print("Enter password: ");
        String pwd_new_1 = sc.nextLine();
        if(password_new_1.equalsIgnoreCase(pwd_new_1)){
            System.out.println("Correct");
            return;
        }
        System.out.println("Always going to run!");
    }
}
