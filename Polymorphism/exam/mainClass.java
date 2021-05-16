package Polymorphism.exam;

// main class which the compiler will run first
public class mainClass{
    public static void main(String[] args){
        // created customer1 object to access functions of customerBuy class
        customer customer1 = new customerBuy("Davinder", 123, "Phone");
        // created customer2 object to access functions of customerReturn class
        customer customer2 = new customerReturn("Sohal", 234, "TV", 5555);

        // making call to print functions of both classes
        customer1.print();
        customer2.print();
    }
}
