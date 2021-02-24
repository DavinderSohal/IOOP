import java.util.Scanner;

public class Calculator{
    public static void main(String[] args){
        Scanner reader = new Scanner(System.in); //creating scanner object

        System.out.print("Enter first numbers: ");
        double first = reader.nextDouble();      // taking user input

        System.out.print("Enter second numbers: ");
        double second = reader.nextDouble();     // taking user input

        System.out.println("1. for addition");
        System.out.println("2. for subtraction");
        System.out.println("3. for multiplication");
        System.out.println("4. for division");
        System.out.println("5. for factorial");
        System.out.println("6. for power");
        System.out.print("Enter your choice from above: ");

        int n = reader.nextInt();  //reading the choice(operator) of user
        double result;

        // using switch to perform operation as per the users choice
        switch(n){
            // case 1 for addition
            case 1:
                result = first + second;
                System.out.println("addition is " + result);
                break;

            //case 2 for subtraction
            case 2:
                result = first - second;
                System.out.println("sub is " + result);
                break;

            // case 3 for multiplication
            case 3:
                result = first * second;
                System.out.println("multiplicity is " + result);
                break;

            // case 4 for division
            case 4:
                result = first / second;
                System.out.println("division is " + result);
                break;

            //case 5 for factorial
            case 5:
                int i, fact = 1;

                // we will calculate the factorial of first # entered by user
                for(i = 1; i <= first; i++){
                    fact = fact * i;
                }
                System.out.println("factorial is " + fact);
                break;
            //case 6 for power of integers
            case 6:
                System.out.println("power is " + Math.pow(first, second));
                break;

            default:
                System.out.println("Error! operator is not correct");
        }
    }
}
