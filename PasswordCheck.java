import java.util.Scanner;

public class PasswordCheck{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String password = "Davinder Sohal";
        System.out.print("Guess the password: ");
        String guess = sc.nextLine();
        if(guess.equals(password)){
            System.out.println("\n*** Your guess is correct ***");
        }else{
            System.out.println("\n*** You guessed wrong ***");
        }
    }
}
