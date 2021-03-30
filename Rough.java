//import java.util.Scanner;
//
//public class Rough
//{
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in); //  created scanner object
//
//        final String username = "pari";
//        String password = "sandhu";
//        final String pin_code = "1234";
//        System.out.print("Please enter your username: ");
//        String my_username = sc.nextLine();  // asking user to enter username
//
//        while(username.equalsIgnoreCase(my_username)){  // checking  if username is correct
//            System.out.println("\nIncorrect username");
//            System.out.print("Please enter your username: ");
//            my_username = sc.nextLine();   // if incorrect ask again until correct
//        }
//
//        System.out.print("Please enter your password: ");
//        String my_pwd = sc.nextLine();   // asking user to enter password
//
//        if(!my_pwd.equals(password)){    // check if password is correct or not
//            System.out.println("\nYou entered incorrect password");
//            System.out.print("To unlock please put your pin-code: ");  // if wrong ask user to enter pincode
//            String my_pin = sc.nextLine();
//            if(my_pin.equals(pin_code)){   // check if pin is correct
//                System.out.println("\nCorrect pin-code!");
//                System.out.println("\nReset your password");  // if correct ask user to reset password
//                System.out.print("Please enter new password: ");
//                password = sc.nextLine();     // saving value of new password
//                System.out.println("New password set." + password); // password chnged
//            }else{
//                System.out.println("\nYou entered incorrect pin-code!");  // else terminate program
//            }
//        }else{
//            System.out.println("\nYour password is correct!");  // let in to app
//        }
//
//        sc.close();
//    }
//}


import java.util.Scanner;

public class Rough{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        // taking current time from user

        System.out.print("enter current Hours: ");
        int hrs = sc.nextInt();
        System.out.print("Enter current Minutes: ");
        int mins = sc.nextInt();
        System.out.print("Enter current Seconds: ");
        int secs = sc.nextInt();

//        1st loop for hours
        for(int hour = hrs; hour < 24; hour++){
            // 2nd loop for mins
            for(int min = mins; min < 60; min++){
                // 3rd loop for seconds
                for(int sec = secs; sec < 60; sec++){
                    System.out.println(hour + ":" + min + ":" + sec);

                    // sleep to slow doen the process
                    try{
                        Thread.sleep(1000);
                    }catch(Exception e){
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}
