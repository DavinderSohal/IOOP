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

class person{
    String first_name;
    String last_name;

    public String getFirst_name(){
        return first_name;
    }

    public void setFirst_name(String first_name){
        this.first_name = first_name;
    }

    public String getLast_name(){
        return last_name;
    }

    public void setLast_name(String last_name){
        this.last_name = last_name;
    }

    public String getPassword(){
        return password;
    }

    public void setPassword(String password){
        this.password = password;
    }

    String password;

    public person(String first_name, String last_name, String password){
        this.first_name = first_name;
        this.last_name = last_name;
        this.password = password;
    }
}

class customer extends person{
    int member_id;

    public int getMember_id(){
        return member_id;
    }

    public void setMember_id(int member_id){
        this.member_id = member_id;
    }

    public customer(String first_name, String last_name, String password, int member_id){
        super(first_name, last_name, password);
        this.member_id = member_id;
    }
}

class employee extends person{
    int employee_id;
    String date;

    public int getEmployee_id(){
        return employee_id;
    }

    public void setEmployee_id(int employee_id){
        this.employee_id = employee_id;
    }

    public String getDate(){
        return date;
    }

    public void setDate(String date){
        this.date = date;
    }

    public employee(String first_name, String last_name, String password, int employee_id, String date){
        super(first_name, last_name, password);
        this.employee_id = employee_id;
        this.date = date;
    }
}

class main{
    public static void main(String[] args){
        customer c = new customer("name","lastname","password",1234);
        employee e = new employee("name","lastname","password",1234,"12-12-12");

        System.out.println(c.getFirst_name());
        System.out.println(c.getLast_name());
        System.out.println(c.getPassword());
        System.out.println(c.getMember_id());
        System.out.println();
        System.out.println(e.getFirst_name());
        System.out.println(e.getLast_name());
        System.out.println(e.getPassword());
        System.out.println(e.getEmployee_id());
        System.out.println(e.getDate());
    }
}
