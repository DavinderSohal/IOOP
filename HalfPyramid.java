//Print half pyramid using "*"

import java.util.Scanner;

public class HalfPyramid{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("\nEnter # of rows: ");
        int rows = sc.nextInt();

        System.out.println();

        // this loop to change the row
        for(int i = 0; i < rows; i++){

            //this loop to print the *
            for(int j = 0; j <= i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
