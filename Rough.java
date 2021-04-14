////import java.util.Scanner;
////
////public class Rough
////{
////    public static void main(String[] args){
////        Scanner sc = new Scanner(System.in); //  created scanner object
////
////        final String username = "pari";
////        String password = "sandhu";
////        final String pin_code = "1234";
////        System.out.print("Please enter your username: ");
////        String my_username = sc.nextLine();  // asking user to enter username
////
////        while(username.equalsIgnoreCase(my_username)){  // checking  if username is correct
////            System.out.println("\nIncorrect username");
////            System.out.print("Please enter your username: ");
////            my_username = sc.nextLine();   // if incorrect ask again until correct
////        }
////
////        System.out.print("Please enter your password: ");
////        String my_pwd = sc.nextLine();   // asking user to enter password
////
////        if(!my_pwd.equals(password)){    // check if password is correct or not
////            System.out.println("\nYou entered incorrect password");
////            System.out.print("To unlock please put your pin-code: ");  // if wrong ask user to enter pincode
////            String my_pin = sc.nextLine();
////            if(my_pin.equals(pin_code)){   // check if pin is correct
////                System.out.println("\nCorrect pin-code!");
////                System.out.println("\nReset your password");  // if correct ask user to reset password
////                System.out.print("Please enter new password: ");
////                password = sc.nextLine();     // saving value of new password
////                System.out.println("New password set." + password); // password chnged
////            }else{
////                System.out.println("\nYou entered incorrect pin-code!");  // else terminate program
////            }
////        }else{
////            System.out.println("\nYour password is correct!");  // let in to app
////        }
////
////        sc.close();
////    }
////}
//
//
//
//
//
///*
//import java.util.Scanner;
//
//public class Rough{
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//
//        // taking current time from user
//
//        System.out.print("enter current Hours: ");
//        int hrs = sc.nextInt();
//        System.out.print("Enter current Minutes: ");
//        int mins = sc.nextInt();
//        System.out.print("Enter current Seconds: ");
//        int secs = sc.nextInt();
//
////        1st loop for hours
//        for(int hour = hrs; hour < 24; hour++){
//            // 2nd loop for mins
//            for(int min = mins; min < 60; min++){
//                // 3rd loop for seconds
//                for(int sec = secs; sec < 60; sec++){
//                    System.out.println(hour + ":" + min + ":" + sec);
//
//                    // sleep to slow doen the process
//                    try{
//                        Thread.sleep(1000);
//                    }catch(Exception e){
//                        e.printStackTrace();
//                    }
//                }
//            }
//        }
//    }
//}*/
//
////
////import java.util.Scanner;
////
////public class Rough {
////    public static void main(String[] args){
////        Scanner ab= new Scanner(System.in);
////        String user="Harman";
////        String password1="Let me in";
////        System.out.println("Enter the username");
////        String username= ab.nextLine();
////        int pin=514;
////        int pin2;
////        if(user.equalsIgnoreCase(username))
////        {
////            System.out.println("The username is correct");
////            System.out.println("Enter the password");
////            String password2=ab.nextLine();
////            if(password1.equals(password2))
////            {
////                System.out.println("The password is correct");
////            }
////            else
////            {
////                System.out.println("Enter the pin");
////                pin2= ab.nextInt();
////                if(pin==pin2)
////                {
////                    System.out.println("You can update your password");
////                    ab.nextLine();
////                    password1 = ab.nextLine();
////                    System.out.println("The new password is "+password1);
////
////
////                }
////
////            }
////
////        }
////
////    }
////}
///*
//
//import java.util.Scanner;
//
//public class Rough
//{
//    public static void main(String[] args)
//    {
//        Scanner sc = new Scanner(System.in); //  creating scanner object named sc
//
//        final String username = "pari";
//        String password = "let me in";
//        final String pincode = "1234";
//        System.out.print(" Enter  username: ");
//        String uname= sc.nextLine();                // asking user to enter username
//
//        while(!username.equalsIgnoreCase(uname))
//        {                                            // checking  if username is correct
//            System.out.println("\n  **Incorrect username**");
//            System.out.print("* Enter your username: ");
//            uname= sc.nextLine();                        // if incorrect ask again until correct
//        }
//
//        System.out.print("Please enter your password: ");
//        String pwd = sc.nextLine();                              // asking user to enter password
//
//        if(!pwd.equals(password))
//        {                                                              // check if password is correct or not
//            System.out.println("\n*incorrect password*");
//            System.out.print("To unlock  put your pincode: ");  // if wrong ask user to enter pincode
//            String pin = sc.nextLine();
//            if(pin.equals(pincode))
//            {                                                                // check if pin is correct
//                System.out.println("\nCorrect pincode!");
//                System.out.println("\nReset your password");                  // if correct ask user to reset password
//                System.out.print("Please enter new password: ");
//                password = sc.nextLine();                               // saving value of new password
//                System.out.println("New password set." + password);                   // set new password
//            }else
//            {
//                System.out.println("\nYou entered incorrect pincode!");  // else terminate program
//            }
//        }
//        else
//        {
//            System.out.println("\nYour password is correct!");  // print correct password
//        }
//
//        sc.close();
//    }
//}*/
//
///*
//
//import java.util.Scanner;
//public class Rough
//{
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        final String username = "My_name";
//        final String password = "Let me in";
//        final String pin_code = "1234";
//        System.out.print("Please enter your username: ");
//        String my_username = sc.nextLine();
//
//        while(!username.equalsIgnoreCase(my_username)){
//            System.out.println("\nIncorrect username");
//            System.out.print("Please enter your username: ");
//            my_username = sc.nextLine();
//        }
//
//        System.out.print("Please enter your password: ");
//        String my_pwd = sc.nextLine();
//        int count = 0;
//
//
//        if(!my_pwd.equals(password)){
//            System.out.println("\nYou entered incorrect password");
//            System.out.print("To unlock please put your pin-code: ");
//
//            String my_pin = sc.nextLine();
//            if(my_pin.equals(pin_code)){
//                System.out.println("\nCorrect pin-code!");
//                System.out.println("\nReset your password");
//                System.out.print("Please enter your password: ");
//                my_pwd = sc.nextLine();
//                System.out.println("New password set.");
//            }else{
//                System.out.println("\nYou entered incorrect pin-code!");
//            }
//        }else{
//            System.out.println("\nYour password is correct!");
//        }
//
//        sc.close();
//    }
//*/
////}
//
//
//import java.util.Scanner;//import the java util file for input
//
//public class Rough {
//    public static void main(String[] args){
//        Scanner ab= new Scanner(System.in);//the Scanner class is used to enter the input
//        String user="Harman";
//        String password1="Let me in";
//        while(true)
//        {
//            System.out.println("Enter the username");
//            String username= ab.nextLine();
//            int pin=514;
//            int pin2;
//
//            if(user.equalsIgnoreCase(username)) {
//                System.out.println("The username is correct");
//                System.out.println("Enter the password");
//                String password2 = ab.nextLine();
//                if (password1.equals(password2))
//                {
//                    System.out.println("The password is correct");
//                }
//                else
//                {
//                    System.out.println("Enter the pin");
//                    pin2 = ab.nextInt();
//                    if (pin == pin2)
//                    {
//                        System.out.println("You can update your password");
//                        ab.nextLine();
//                        password1 = ab.nextLine();
//                        System.out.println("The new password is " + password1);
//
//
//                    }
//                    else
//                    {
//                        System.out.println("the pin is incorrect");
//                    }
//
//                }
//                break;
//            }
//            else
//            {
//                System.out.println("Incorrect  username! Enter your username again");
//            }
//
//
//        }
//
//    }
//}

